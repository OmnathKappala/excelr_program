public class Decimal_binary {
    public static void main(String[] args) {
        int num=2;
        String binary="";

        for(int i=0;num>0;i++){
            int rem=num%2;
            binary=rem+binary;
            num/=2;
        }
        System.out.print(binary);
    }

    
}
