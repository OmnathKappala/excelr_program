public class ReverseNumber{
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        int res=0;
        int n=3;
        while(num>0){
            int rem=num%10;
            rev=rem+rev*10;
            num=num/10;
              res += Math.pow(rem, n);
            

            
            
        }

        if(num==res){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
        System.out.println(rev);
        System.out.println(res);
        if(num==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
         
         
    }
}