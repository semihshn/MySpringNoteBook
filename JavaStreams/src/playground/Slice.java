package playground;

import java.util.stream.Stream;

public class Slice {
    //slice
    //Verilen ilk ve son konumlar arasında listenin bir alt dizisini döndürür,
    //bunu skip ve limit fonksiyonları yardımıyla yapabiliyoruz

    public static void main(String[] args) {

        Stream< Integer > stream1 = Stream.of(1, 3, 5,9,8,7);

        Stream<Integer>sliceOfIntStream = stream1.skip(2).limit(3);

        sliceOfIntStream.forEach(System.out::println);

    }
}
