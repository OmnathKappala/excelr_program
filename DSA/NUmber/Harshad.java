public class Harshad {
    public static void main(String[] args) {
        for(int num=1;num<=50;num++){
            int temp=num;
            int sum=0;
            while(temp>0){
                int digits=temp%10;
                
                sum+=digits;
                 temp=temp/10;
            }
            if(num%sum==0){
                  System.out.println(num +" is a Harshad number");
            }
        }
        
    }
    
}
