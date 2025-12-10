package stringPrograms;

public class Anagram {
    public static boolean isAnagram1(String s1,String s2){
        char[]ch1=s1.toCharArray();
        char []ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        String s ="listen";
        String s1="silten";
        if(isAnagram1(s1,s)){
             System.out.println("is an Anagram");
        }

        
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            for(char c:s1.toCharArray()){
                if(s2.indexOf(c)!=-1){
                    return true;
                }
                else{
                    return false;
                }
            }

            }
            return false;
        }
    }

    


