package oops.inheritence;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		System.out.println("----first release");
		
		weChat chat=new weChat();
		chat.call();
		
		System.out.println("----------second release----------");
		// Non primitive typecasting -- implict
		chat=new weChatVersion2(); // re instialized objects
		chat.call();
		
		System.out.println("--------------thrid release-----------");
		
		chat=new wechatVersion3();
		chat.call();
		
		// TODO Auto-generated method stub

	}

}
class weChat{ // parent class super class /base class
	public void call() {
		System.out.println("calling is enabled in version1");
	}
	
}
class weChatVersion2 extends weChat{ // child of weChat // parent of WechatVersion3

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println(" video call is enabled in version2");
	}
	
	
}
class wechatVersion3 extends weChatVersion2{ // child ass

	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("video call with add people is enabled in version3");
	}
	}
	

