package playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        //sorted
        //Çıktı, sağlanan karşılaştırıcıya göre girdinin kopyası olarak sıralanır,
        //yani sıralanmış halini dönderir

        List names = Arrays.asList("Cengiz","Beyza","Ahmet");
        List result = (List) names.stream().sorted().collect(Collectors.toList());

        for (Object str : names){
            System.out.println(str);
        }
        System.out.println("------------");
        for (Object str : result){
            System.out.println(str);
        }
    }
}
