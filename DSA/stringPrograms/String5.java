package stringPrograms;

public class String5 {
    public static void main(String[] args) {
        String s1 = "This is A large sentence which explains about string";
         for(String word :s1.split(" ")){
            char ch = word.charAt(0);
            String vowel ="aeiouAEIOU";
            int compare=vowel.indexOf(ch);
            if(compare==-1){
                System.out.println(word +"-"+ch+" is a constant");
            }
            else{
                System.out.println(word +" -"+ch+"is a vowel");
            }

         }
    }
    
}
