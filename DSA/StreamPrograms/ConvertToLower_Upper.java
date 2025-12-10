 import java.util.*;
import java.util.stream.Collectors;  // <-- Add this import

public class ConvertToLower_Upper {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World", "Java", "Stream");
        System.out.println(words);

        Set<String> upperSet = words.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toSet());

        System.out.println("Upper Set : " + upperSet);

         Set<String> lowerSet = words.stream()
                                    .map(String::toLowerCase)
                                    .collect(Collectors.toSet());

        System.out.println(" Lowerset : " + lowerSet);
    }
}
