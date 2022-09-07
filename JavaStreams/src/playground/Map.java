package playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    //map
    //parametre olarak java util function paketi içerisinde yer alan Function interface'i almaktadır.
    //Stream içerisinde ki elemanları başka elamanlara dönüştürmek veya üzerlerinde işlem yapmak için
    //kullanılmaktadır

    private String name;
    private Integer age;

    Map(String name,Integer age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        List<Map> studentList = new ArrayList<Map>();
        studentList.add(new Map("ahmet",23));
        studentList.add(new Map("mehmet",25));
        studentList.add(new Map("sinan",27));
        studentList.add(new Map("kaan",21));
        studentList.add(new Map("yağız",29));

        List<String> names = studentList.stream()
                .map(student -> student.getName()+" Şahan")
                .collect(Collectors.toList());

        for (Object str : names){
            System.out.println(str);
        }

    }
}
