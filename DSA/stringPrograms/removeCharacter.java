public class removeCharacter {
    public static void main(String[] args) {
        String str ="Hello World 123!";
        System.out.println("original String"+str);
        System.out.println("after removing vowels"+removeVowels(s));
    }
    public static String removeVowels(String s){
        StringBulider b=new StringBuilder();
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                continue;
            }
          
            b.append(c);
        }
        return b.toString();
    
        
    }
    
}
