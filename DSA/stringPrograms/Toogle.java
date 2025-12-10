public class Toogle{
    public static void main(String[] args) {
        String s="Java";
       StringBuilder b=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>='A'&& c<='Z'){
                int ch=c+32;
                b.append((char)ch);
            }
            else if(Character.isLowerCase(c)){
            // else if(c>='a' && c<='z'){
            //     int ch=c-32;

                // b.append((char)ch);
                b.append(Character.toUpperCase(c));
            }
             
        }
        System.out.println(b);
    }
}