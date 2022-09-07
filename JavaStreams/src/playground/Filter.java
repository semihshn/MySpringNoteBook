package playground;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    //filter:
    //Her öğe üzerinde bir boole işlevi çalıştırır yani şart çalıştırır ve
    //yalnızca şarttan geçenleri çıktıya koyar.

    private String firstName;
    private String lastName;
    private Integer age;

    public static void main(String[] args) {

        Filter u1=new Filter();
        u1.firstName="Semih";
        u1.lastName="Şahan";
        u1.age=22;

        Filter u2=new Filter();
        u2.firstName="Fatih";
        u2.lastName="Pak";
        u2.age=35;

        Filter u3=new Filter();
        u3.firstName="Melike";
        u3.lastName="Belpınar";
        u3.age=21;

        List<Filter> userList=new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        List<Filter> processedUser=userList.stream()
                .filter(user->user.age<22)
                        .collect(Collectors.toList());

        System.out.println(processedUser.get(0).firstName);
    }
}
