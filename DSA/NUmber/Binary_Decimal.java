public class Binary_Decimal {
    public static void main(String[] args) {
        int num=101;
        int sum=0;
        for(int i=0;num>0;i++){
            int rem =num%10;
            sum+=rem*Math.pow(2,i);
            num/=10;
        }
        System.out.println(sum);
    }
    
}
