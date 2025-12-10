package stringPrograms;

public class Ascii {
    public static void main(String[] args) {
         char start='A';
         char end='Z';
         for(char i=start;i<=end;i++){
            char temp=i;
            int ascii=temp;
             System.out.println(i+" "+ascii);
         }
    }
    
}
