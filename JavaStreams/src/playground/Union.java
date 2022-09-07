package playground;

import java.util.stream.Stream;

public class Union {
    //union
    //iki streami birleştirir ve birleşim streaminde aynı elemanların tekrarlanmasını ortadan kaldırır,
    //yani concat ve distinct uygular

    public static void main(String[] args) {
        Stream< Integer > stream1 = Stream.of(1, 3, 5);
        Stream < Integer > stream2 = Stream.of(3, 4, 6);

        Stream < Integer > resultingStream = Stream.concat(stream1, stream2).distinct();

        System.out.println(resultingStream.toList());
    }
}
