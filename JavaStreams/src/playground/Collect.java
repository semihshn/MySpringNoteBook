package playground;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        //collect
        //Bir akıştaki öğeleri bir koleksiyonda toplamayı sağlayan bir yapıdır

        List<String> degerler = Arrays.asList("burak", "kutbay", "java");

        List<String> sonuc= degerler.stream()
                .filter(d-> !"kutbay".equals(d))
                .collect(Collectors.toList());

        for (Object str : sonuc){
            System.out.println(str);
        }
    }
}
