public class PrintDigit{
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        int product=1;
        int rev=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            product*=rem;
            System.out.println(rem);
            num/=10;
            rev=rem+rev*10; 
        }
        System.out.println("sum of digits:"+ sum);
        System.out.println("product of digits:"+product);
        System.out.println(rev);

        
    }
}
