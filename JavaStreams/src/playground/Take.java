package playground;

import java.util.stream.Stream;

public class Take {
    //take
    //Listenin ilk n. İndexe kadar olan kısmını döndürür, bunu da limit fonksiyonu yardımıyla sağlayabiliyoruz

    public static void main(String[] args) {

        Stream< Integer > stream1 = Stream.of(1, 3, 5,9,8,7);

        Stream<Integer>sliceOfIntStream = stream1.limit(4);

        sliceOfIntStream.forEach(System.out::println);

    }
}
