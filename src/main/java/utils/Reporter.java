package utils;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.KlovReporter;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public abstract class Reporter extends AbstractTestNGCucumberTests {

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public ExtentTest test, node;
	public static KlovReporter klovReporter;

	public String testCaseName, testDescription, nodes, authors, category;
	public String excelFileName;

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		//extent.attachReporter(reporter);
	
		// Klov + Mongo config
		klovReporter = new KlovReporter();
		klovReporter.initMongoDbConnection("13.127.90.0", 27017);
		klovReporter.setProjectName("TestLeaf");
		klovReporter.setReportName("Build Version - 2.0");
	//	klovReporter.initMongoDbConnection("http://13.127.90.0/", 27017);
		klovReporter.setKlovUrl("http://13.127.90.0/"); 
		extent.attachReporter(klovReporter);
	}

	@BeforeClass
	public void report() throws IOException {
		test = extent.createTest(testCaseName, testDescription);
		test.assignAuthor(authors);
		test.assignCategory(category);

		
	}

	public abstract long takeSnap();

	public void reportStep(String dec, String status, boolean bSnap) {
		MediaEntityModelProvider img = null;
		if (bSnap && !status.equalsIgnoreCase("INFO")) {

			long snapNumber = 100000L;
			snapNumber = takeSnap();
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath("./reports/images/" + snapNumber + ".jpg")
						.build();
			} catch (IOException e) {

			}
		}
		if (status.equalsIgnoreCase("pass")) {
			node.pass(dec, img);
		} else if (status.equalsIgnoreCase("fail")) {
			node.fail(dec, img);
		}
	}

	public void reportStep(String desc, String status) {
		reportStep(desc, status, true);
	}

	@AfterSuite
	public void stopReport() {
		extent.flush();
		klovReporter.flush();
			
		//push images folder to s3 bucket
		
		TransferManager xfer_mgr = new TransferManager();
		String directoryPath = "./reports/images";
		String keyPrefix = "images";
		String bucketName = "extendreport-images";
		boolean recursive = false;
		MultipleFileUpload xref = xfer_mgr.uploadDirectory(bucketName, keyPrefix, new File(directoryPath), recursive);

		try {
			xref.waitForCompletion();
		} catch (AmazonServiceException e) {
			System.err.println("Amazon Service Error: " + e.getMessage());
			System.exit(1);
		} catch (AmazonClientException e) {
			System.err.println("Amazon Client Error: " + e.getMessage());
			System.exit(1);
		} catch (InterruptedException e) {
			System.err.println("Transfer Interrupted Error: " + e.getMessage());
			System.exit(1);
		}
		xfer_mgr.shutdownNow();
	}
}
