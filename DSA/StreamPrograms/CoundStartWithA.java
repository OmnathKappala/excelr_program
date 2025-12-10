 import java.util.*;

public class CoundStartWithA {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "Alpha", "Animal");

        long count = words.stream()
                          .filter(word -> word.startsWith("A")) // <-- fix here
                          .count();

        System.out.println(count + " words start with A");
    }
}

