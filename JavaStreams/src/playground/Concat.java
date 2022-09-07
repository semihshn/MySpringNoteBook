package playground;

import java.util.stream.Stream;

public class Concat {

    public static void main(String[] args) {
        //concat
        //Koleksiyonları tek bir koleksiyonda birleştirir
        //birleştirilecek Koleksiyonların aynı veri tipinde olması önemlidir.

        Stream< Integer > stream1 = Stream.of(1, 3, 5);
        Stream < Integer > stream2 = Stream.of(2, 4, 6);

        Stream < Integer > resultingStream = Stream.concat(stream1, stream2);

        System.out.println(resultingStream.toList());
    }
}
