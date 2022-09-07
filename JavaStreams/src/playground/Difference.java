package playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Difference {
    //difference
    //iki stream arasında farklı değerlere sahip olanları yani uniq olanları seçmemizi sağlar

    private static final List listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
    private static final List<String> listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

    public static void main(String[] args) {

        List<String> differences = (List<String>) listOne.stream()
                .filter(element -> !listTwo.contains(element))
                .collect(Collectors.toList());

        for (Object str : differences){
            System.out.println(str);
        }

    }
}
