package oops.abstaction;

public class Ambiguity {

	public static void main(String[] args) {
		
		 Cricket c=new Athlete();
		 c.play();
		  
		 
		 Football f=new Athlete();
		 f.play();
		 
		 Athlete a=new Athlete();
		 a.play();
		 	}

}


interface Cricket{
	void play();
}
 interface Football{
	default void play() {
		System.out.println("bfhrb");
	}
 }
 
  class Athlete implements Cricket , Football{
	 public void play() {
		 System.out.println("we can play a sport");
	 }
	 
 }