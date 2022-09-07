package playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    //distinct
    //aynı elemanların tekrarlanmasını ortadan kaldırır, difference’dan farkı tek bir stream üzerinde
    //distinct çalıştırılır ve aynı değerlerin stream’de bir defa yer alması sağlanır

    private static final List list = Arrays.asList("Jack", "Jack", "Sam", "Sam", "James", "James");

    public static void main(String[] args) {

        List<String> distinctElements = (List<String>) list.stream()
                .distinct()
                .collect(Collectors.toList());

        for (Object str : distinctElements){
            System.out.println(str);
        }

    }
}
