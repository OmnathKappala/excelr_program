package arrayManipulation;

public class ArrayIterations {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		int size=arr.length;
		System.out.println("=================================");
		System.out.println("===============While loop =============");
		System.out.println("=======================================");
		
		int i=0;
		while(i<size) {
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("===================");
		System.out.println("========do while======");
		System.out.println("=====================");
		int l=0;
		do {
			System.out.println(arr[l]);
			 l++;
		}
		while(l<size);
		
		System.out.println("+++++++for each loop");
		for(int j:arr) {
			System.out.println(j);
		}
		System.out.println("===================for loop");
		for(int a=0;a<size;a++) {
			System.out.println(arr[a]);
		}
			
		
		

		
		
		 

	}

}
