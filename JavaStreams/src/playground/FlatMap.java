package playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    //flat-map
    //mantıksal olarak bu işlem map ve flatten işlevinin bir arada kullanılmasıyla aynıdır

    public static void main(String[] args) {

        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        List<String> collect = Stream.of(array)
                .flatMap(Stream::of)
                .filter(x -> !"a".equals(x))
                .collect(Collectors.toList());

        for (String s : collect) {
            System.out.println(s);
        }

    }
}
