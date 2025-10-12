class SumOfNumber{
    public static void main(String[] args) {
        int sum=0;
        int product=1;
        for(int i=2;i<=10;i++){
            sum+=i;
            product*=i;
            
        }
        System.out.println(sum);
        System.out.println(product);
    }
}