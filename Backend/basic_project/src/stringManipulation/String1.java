package stringManipulation;

public class String1 {

	public static void main(String[] args) {

		String s1="Apple";
		System.out.println(s1);
		
		String s2="Apple";
		System.out.println(s2);
		
		String s3=new String("Apple");
		System.out.println(s3);
		
		String s4="apple";
		
		System.out.println(s1==s2);
	 
		System.out.println(s1==s3);
	 
		System.out.println(s1==s4);
		
		// equals and equalsIngorecase will check values rather than address 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		// Ignore case of the string
		System.out.println(s1.equalsIgnoreCase(s4));
		// TODO Auto-generated method stub

	}

}
