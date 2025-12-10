import java.util.Collections;
import java.util.List;


public class Sorting {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,3,34,23,65,87,90,90,90);
        System.out.println(list);

         
         list.stream()
        //  .sorted( (a,b)->b-a)
        // .sorted()
        .sorted(Collections.reverseOrder())
       
        .forEach(System.out::println);
    }

    
}
