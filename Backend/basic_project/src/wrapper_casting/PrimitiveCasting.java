package wrapper_casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		byte byteValue=10;
		int intValue=byteValue; // implicit
		short shortValue=(short)intValue;//explict
		// passing data into method
		intMethod(byteValue); // implict
		shortMethod((short)intValue);// explict casting
		// TODO Auto-generated method stub

	}
	public static void intMethod(int a) {
		System.out.println(a);
		}
	public static void shortMethod(short a) {
		System.out.println(a);
	}

}
