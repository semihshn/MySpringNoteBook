package playground;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    //reduce
    //genelde kümülatif operasyonlarda sıkça kullanılır.
    //bir veri setinde sırayla işlem yapmak istiyorsak ve bir önceki
    //yaptığımız işlemi de dahil etmek istiyorsak reduce metodunu kullanabiliriz

    private Integer page;

    public Integer getPage() {
        return page;
    }

    public static void main(String[] args) {

        Reduce r=new Reduce();
        r.page=500;
        Reduce r1=new Reduce();
        r1.page=251;
        Reduce r2=new Reduce();
        r2.page=82;

        List<Reduce> bookSortedListByPage = new ArrayList<Reduce>();
        bookSortedListByPage.add(r);
        bookSortedListByPage.add(r1);
        bookSortedListByPage.add(r2);

        //sayfa sayısı 250'den büyük olanların sayfa sayılarını topla ve döndür
        Integer sum = bookSortedListByPage.stream().filter(book -> book.getPage() > 250)
                .map(Reduce::getPage)
                .reduce(0, (Integer::sum));

        System.out.println(sum);
    }
}
