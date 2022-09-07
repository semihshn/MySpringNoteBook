package playground;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reject {
    //reject
    //Filtrenin tersi, şart ile eşleşmeyen öğeleri döndürür, bunu ise Predicate sınıfının not fonksiyonu ile
    //sağlayabiliyoruz, not fonksiyonu içine şartımızı yazabiliriz

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");

        Predicate<String> predicate1 = str -> str.startsWith("A");
        Predicate<String> predicate2 =  str -> str.length() < 5;

        List<String> result = names.stream()
                .filter(Predicate.not(predicate1.and(predicate2)))
                .collect(Collectors.toList());

    }
}
