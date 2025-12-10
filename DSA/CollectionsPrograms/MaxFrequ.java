import java.util.HashMap;
import java.util.Map;

 public class MaxFrequ{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String s="malayalam";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);

        }
        System.out.println(map);
        int max=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }

        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==max){
                System.out.println(entry.getKey()+"- "+entry.getValue());
            }
        }
        
    
    }
}
