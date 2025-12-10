package arrayManipulation;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// 1D Array
		String[] arr= {"Apple","Banana","Orange"};
		 
		// Multideminsional Array / 2D array
		
		String [] [] arr2= {{"Apple","Banana","orange"},
		                         {"pink","Blue","REd"}};
		
		// Square Matrix
         String [] [] arr3= {
        		 {"Apple","Banana","orange"},
                 {"pink","Blue","REd"},
                 {"Sunday","Monday","Tuesday"} };
         
//         System.out.println(Arrays.toString(arr3));// hashcode address.
         System.out.println(Arrays.deepToString(arr3));
//		// TODO Auto-generated method stub

	}

}
