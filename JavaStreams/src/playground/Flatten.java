package playground;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {
    //flatten
    //bir koleksiyondaki iç içe geçmeleri kaldırır ve düzleştirir

    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("one:one"),
                Arrays.asList("two:one", "two:two", "two:three"),
                Arrays.asList("three:one", "three:two", "three:three", "three:four"));

        List<String> result= nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        for (Object str : result){
            System.out.println(str);
        }
    }
}
