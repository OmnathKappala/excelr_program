package arrayManipulation;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		String [][] arr= {
//                0     1      2
				{"One","two","three"},
				{"Four","five","six"},
				{"Seven","eight","nine"}
		};
//		arr[row][col]
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[0][2]);
		
		arr[2][1]="TEN";
		System.out.println(Arrays.deepToString(arr));
		// TODO Auto-generated method stub
		
//		 for printing array present in mutlidemsional array based on index position
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i])+" "+ i+" position");
		}
		
		// for printing each value in MDA
		
		System.out.println("======================Accessing Values===============");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.println(arr[row][col]);
			}
			System.out.println("--------------------------");
		}
           
	}

}
 