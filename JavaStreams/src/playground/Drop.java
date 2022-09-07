package playground;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Drop {
    //drop
    //Koleksiyonun ilk n elemanı dışındakilerin hepsini döndüren bir yapıdır, bunuda skip fonksiyonu yardımıyla
    //ilk n elemanı görmezden gelerek geçmesini sağlayarak yaparız

    public static void main(String[] args) {

        Stream< Integer > stream1 = Stream.of(1, 3, 5,9,8,7);

        Stream<Integer>sliceOfIntStream = stream1.skip(2);

        sliceOfIntStream.forEach(System.out::println);
    }
}
