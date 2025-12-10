package arrayManipulation;

import java.util.Arrays;
import java.util.Collections;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arr= {2,5,1,6,7};
		
		System.out.println(Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		 Arrays.sort(arr , Collections.reverseOrder());
		 System.out.println(Arrays.toString(arr));
		 
		 int [] arr1= {1,2,3};
		 int arr2[]= {1,2,3};
		 System.out.println( Arrays.equals(arr1, arr2));
		 // will compare two array values , if same it returns true or else false
		 
		 
		 //  will compare two array and finds first mismatched element,if found 
		 // it will return its index position or else return -1
		System.out.println( Arrays.mismatch(arr1, arr2));
		
		
		if(Arrays.mismatch(arr1, arr2)==-1) {
			System.out.println("Both elements are Same");
		}
		else {
			System.out.println("Both array elements are not same");
		}
		
	
	int arr4 []= {10,23,34,12,54,34};
	System.out.println(Arrays.toString(arr4));
	
	int [] copy=Arrays.copyOf(arr4, 4);
	System.out.println(Arrays.toString(copy));
	
	int [] copy1=Arrays.copyOf(arr4, arr4.length);
	System.out.println(Arrays.toString(copy1));
	
	
	int  [] copy2= Arrays.copyOf(arr4, 7);
	System.out.println(Arrays.toString(copy2));
	
	int [] copy3 = Arrays.copyOfRange(arr4, 2, 4);
	 // from 2 ,to 4 position 4 is exceluded , so it returns 2 and 3 position element.
	System.out.println(Arrays.toString(copy3));
	
	
	 int [] arr5 = {10,123,23,45,123,123};
	 
	 int value=23;
	 for(int i:arr) {
		 if(value==i) {
			 System.out.print("exist");
			 
		 }
	 }
	 
 Arrays.sort(arr5);
 int res = Arrays.binarySearch(arr5, value);
 if(res>0) {
	 System.out.println(value +" exist");
 }
 else {
	 System.out.println("value not exist");
 }
		
		
		
		
		
		
		

	}

}
