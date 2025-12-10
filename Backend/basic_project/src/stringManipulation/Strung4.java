package stringManipulation;

public class Strung4 {
	public static void iterate1(String s) {
		System.out.println("-----------for loop--------");
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i) +" ,");
		}
		System.out.println("");
	}
	
 
	
	public static void iterate2(String s) {
		System.out.println("----------enchanced for loop");
		for(char c:s.toCharArray()) {
			System.out.print(c+",");
		}
	}
	public static void iterate3(String[] words) {
		for(String word:words) {
			System.out.print(word);
		}
	}

	public static void main(String[] args) {
		String s="Hello World";
		iterate1(s);
		iterate2(s);
		String s2="This is a large sentence which explains about string";
		iterate3(s.split(s2));
		// TODO Auto-generated method stub

	}

}
