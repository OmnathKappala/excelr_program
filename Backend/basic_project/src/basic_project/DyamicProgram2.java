package basic_project;

import java.util.Arrays;
import java.util.Scanner;

public class DyamicProgram2 {

	public static void main(String[] args) {
		String [] arr=new String[4];
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter"+i+" position value: ");
			arr[i]=sc.next();
		// TODO Auto-generated method stub

	}
		System.out.println(Arrays.toString(arr));
	}
}

