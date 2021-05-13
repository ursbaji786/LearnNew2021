package baji2021.interviewLearn;

import java.util.ArrayList;
import java.util.List;

public class Array2D_MinMax {
	
	    public static void main(String[] args) {
	        int[][] data = {
	                {3, 2, 5},
	                {1, 4, 4, 8, 13},
	                {9, 1, 0, 2},
	                {0, 2, 6, 3, -1, -8}
	        };
	        
	        int l = data.length;
	        System.out.println("2D array length is " + l);
	        
	        int l0 = data[0].length;
	        System.out.println("first array length is " +l0);
	        
	        for(int i =0; i<4; i++) {
	        	 int eachLength = data[i].length;
	        	// System.out.println("each array length is " + eachLength);
	        	 List<Integer> x = new ArrayList<Integer>();
	        	 x.add(eachLength);
	        	 System.out.print(x);
	        	 Object[] list2Array = x.toArray();

	        	
	        }
	        
	        
	        System.out.println(getMaxValue(data));
	        System.out.println(getMinValue(data));
	    }


	    public static int getMaxValue(int[][] numbers) {
	        int maxValue = numbers[0][0];
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] > maxValue) {
	                    maxValue = numbers[j][i];
	                }
	            }
	        }
	        return maxValue;
	    }
	    public static int getMinValue(int[][] numbers) {
	        int minValue = numbers[0][0];
	        for (int j = 0; j < numbers.length; j++) {
	            for (int i = 0; i < numbers[j].length; i++) {
	                if (numbers[j][i] < minValue ) {
	                    minValue = numbers[j][i];
	                }
	            }
	        }
	        return minValue ;
	    }
	}


