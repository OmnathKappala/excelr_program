  import java.util.*;
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s= "I scream you scream for ice cream";
        String [] c=s.split(" ");
        System.out.println(Arrays.toString(c));
        Map< String,Integer> map=new HashMap<>();
        for(String b:c){
            map.put(b,map.getOrDefault(b, 0)+1);

        }
        System.out.println(map);
        Set<String> keys = map.keySet();
    }
}