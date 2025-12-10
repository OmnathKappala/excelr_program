
package arrayManipulation;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println(Arrays.toString(arr));
		int index=0;
		int value=101;
		do {
//			System.out.println(arr[index]);
			arr[index]=value;
			index++;
			value++;
			
		} while (index<arr.length);
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub
           for(int i=0;i<arr.length;i++) {
        	   arr[i]=value++;
           }
           System.out.println(Arrays.toString(arr));
	}

}
