package basic_project;

public class VariableProgram3 {
final static int value=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//value =20; final member can't be reassign
System.out.println(value);
final int value2=20;
//value2=30;  final member cant'be reassign 
System.out.println(value2);

	}

}