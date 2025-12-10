import java.util.List;

public class Square {
        public static void main(String[] args) {
        List<Integer> list=List.of(10,3,4,2);
        System.out.println(list);

        list.stream().map(x-> x*x).forEach(System.out::println);
   
    }

    

}
