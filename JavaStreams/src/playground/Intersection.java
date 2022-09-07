package playground;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {
    //Intersection
    //iki listenin kesişimini almamızı sağlayan bir yapıdır, stream API'nin direk bunu destekleyen bir yapısı
    //yoktur ama bu işlemi distinct ve filter kullanarak yapabiliriz

    static List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
    static List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

    public static void main(String[] args) {

        Set<String> result = Intersection.list.stream()
                .distinct()
                .filter(otherList::contains)
                .collect(Collectors.toSet());

        for (Object str : result){
            System.out.println(str);
        }

    }
}
