package methods;

public class MobileShop {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println(mobile);
		 mobile.brand="Realme";
		 mobile.pixcels=64;
		 mobile.price=16000.00;
		 mobile.weight=255.5;
		 mobile.storge=256;
		 System.out.println(mobile);
	   System.out.println("======================");
	   
	  Mobile m= new Mobile("Vivo");
	  
	  System.out.println(m);
	  
	  System.out.println("=========================");
	  
	  Mobile m1=new Mobile(128,"redmi");
	  
	  System.out.println(m1);
	  
	  System.out.println("=====================");
	  
	 Mobile m3= new Mobile(48, "Apple",16600,250,128);
		System.out.println(m3);
		// TODO Auto-generated method stub

	}

}
