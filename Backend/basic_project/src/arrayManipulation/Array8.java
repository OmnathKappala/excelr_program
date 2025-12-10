package arrayManipulation;

import java.util.Arrays;

public class Array8 {
	public static int[][] sum(int [][]arr1 ,int[][] arr2) {
		int [][]sum=new int [arr1.length][arr2.length];
		 for(int i=0;i<arr1.length;i++) {
			  for(int j=0;j<arr1[i].length;j++) {
				  sum[i][j]=arr1[i][j]+arr2[i][j];
			  }
		 }
		
		return sum;
		
	}

	public static void main(String[] args) {
		int [][] arr1 = {
				{10,20,30},{40,50,60},{70,80,90}
		};
		int [][] arr2 = {{10,20,30},{40,50,60},{70,80,90}};
		// TODO Auto-generated method stub
   System.out.println("Sum of two arrays is :" + Arrays.deepToString(sum(arr1,arr2)));
	}

}
