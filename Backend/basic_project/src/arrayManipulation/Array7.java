package arrayManipulation;

public class Array7 {
	public static long product(int [][]arr) {
		long product=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				product*=arr[i][j];
			}
		}
		return product;
		}

	public static void main(String[] args) {
		int[][] arr=  {
				{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("Sum of 2D array is:" + sum(arr));
		
		System.out.println("Product of 2D array is :" + product(arr));
				
		}
		// TODO Auto-generated method stub

	
public static int sum(int[][]arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			sum+=arr[i][j];
		}
	}
	return sum;
}



}
