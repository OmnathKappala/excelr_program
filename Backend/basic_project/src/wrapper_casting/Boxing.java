package wrapper_casting;

public class Boxing { // wrapping the primitive datatype into non primitive data type  is called Boxing.
	byte byteValue=-127;
	short shortValue=234;
	int intValue=10;
	long longValue=234443244l;
	double doubleValue=234.234;
	float floatValue=5464564.345f;
	char charValue='a';
	boolean booleanValue=false;
	
	// Wrapper Class ref=primitiveValue;
	
	Short s=shortValue;
	Integer i=intValue;
	Long l=longValue;
	Double d=doubleValue;
	Float f=floatValue;
	Character c=charValue;
	Boolean bo=booleanValue;
	
	
	Byte b=byteValue;
	Byte b1=Byte.valueOf(byteValue);

}
