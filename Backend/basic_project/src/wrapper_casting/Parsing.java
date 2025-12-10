package wrapper_casting;
// converting Strings into number ,boolean,and numbers
public class Parsing {

	public static void main(String[] args) {
		
		String s="10";
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		String s2="flase";
		boolean b=Boolean.parseBoolean(s2);
		System.out.println(b);
		Boolean b1=Boolean.valueOf(s2);
		
		String s3="10.00gf";  // NumberFormating Exception
		Float f=Float.parseFloat(s3);
		System.out.println(f);
		
		
		// TODO Auto-generated method stub

	}

}
