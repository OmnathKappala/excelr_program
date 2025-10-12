// strong Number:the sum of factorial of each digit is equal to the number itself.
/*123 - not strong number
1!=1
2!=2
3!=6
------
  9
  145 - strong number
   1-1
   4-24
   5-120
   -----
   145
   it is a strong number */


public class Strong_Number {
    public static void main(String[] args) {
        for(int num=1;num<=1000;num++){
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (temp == sum)
            System.out.println("strong number "+sum);
        }
    }
}
    


