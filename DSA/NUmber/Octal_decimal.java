public class Octal_decimal {
    public static void main(String[] args) {
        int num=101;
        int sum=0;
        for(int i=0;num>0;i++){
            int rem =num%10;
            sum+=rem*Math.pow(8,i);
            num/=10;
        }
        System.out.println(sum);
        
    }
     
}
