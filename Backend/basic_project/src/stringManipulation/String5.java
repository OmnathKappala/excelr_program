package stringManipulation;

public class String5 {

	public static void main(String[] args) {
		 StringBuffer buffer= new StringBuffer("Hello");
		 System.out.println(buffer);
//		 buffer.reverse();
//		 System.out.println(buffer);
		 
		 buffer.append(10);
		 System.out.println(buffer);
		 
//		 buffer.repeat("**",10);
//		 System.out.println(buffer);
		 
		 buffer.delete(1,3);
		 System.out.println(buffer);
		 buffer.deleteCharAt(2);
		 
		 System.out.println(buffer);
		 
		 
		 buffer.setCharAt(3, 'X');
		 
		 System.out.println(buffer);
		 
		 buffer.insert(3, 'p');
		 
		 System.out.println(buffer);
		// TODO Auto-generated method stub

	}

}
