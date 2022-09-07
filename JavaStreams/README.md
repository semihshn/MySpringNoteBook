<div align="center">

 <img src="./imageForMarkdown/banner.png" alt="reduce" width="500"/>

</div>

#### **Collection Pipeline**
>	Collection Pipeline, ismindende anlaşılacağı gibi bir pipeline yani boru hattımız var ve bu boru hattından stream yani bir veri akışı var biz bu akan verilerin her birine filter,map,reduce gibi işlemler uygulayarak sonuçta işlenmiş bir stream elde ederiz ve işlenmiş stream’i tekrar işleyebiliriz yani zincirleme bir işlem yapabiliriz işte buna Collection Pipeline deniyor bu bir programlama yöntemidir. Bu model, fonksiyonel programlamada ve ayrıca lambdaları destekleyen nesne yönelimli dillerde yaygındır

<br/>

#### **First Encounters**
>	Bu pipeline yapısını ilk olarak unix’de görüyoruz ve bu şahane kullanımı C/C++/Java/C# gibi popüler dillerin kullanmayışı bazı yazılımcıları rahatsız etmekteydi ve OOP dünyasına da bu kullanımı kazandırmak istiyorlardı ve neyse ki kazandırıldı, Unix’den sonra Smalltalk daha sonra ruby gibi diller bunu desteklemekte

<br/>

#### **Defining Collection Pipeline**
> -	Collection Pipeline'ı yazılımı nasıl modülerleştirebileceğimizin ve oluşturabileceğimizin bir modeli olarak görebiliriz
Laziness
> -	Laziness yani tembellik ilkesini take metodu güzel anlatıyor aslına, yaptığı şey ise koleksiyonun ilk n elemanını al gerisine bakma böylece baştan sonra tüm koleksiyonu gezmek zorunda kalmıyor, tembellik yapıyor yani 😊 bu gibi yöntemler hep desteklenemiyor maalesef..

<br/>

#### **Parallelism**
>	Çoğu pipeline operasyonları paralel çağrılar ile iyi çalışır, paralel çağrılar yapılan işin verimliliğini artırır, işleri parçalara bölüp aynı anda yapılması olarak anlaşılabilir, ancak bazen parallelism ilkesi verimliliği azaltadabilir o yüzden bunu test edip öyle kullanmak tavsiye ediliyor.

<br/>

#### **Immutability**
>	Bu prensip ise pipeline’lara sokulan koleksiyonların, verilerin immutability olması gerektiğini söyler ki pipeline’lardan doğru çıktı alınabilsin, immutability sağlayamayan bazı fonksiyonel programlama dillerinin ise verileri değiştiren değil güncelleyen işlevleri kullanması gerektiğini belirtir.

<br/>

#### **When to use it**
> -	Collections ne zaman kullanılmalı sorusu aklımıza geldiğinde şu sözü hatırlamalıyız;
> -	“Extract a method whenever there’s a difference between what a block of code does and how it does it”


<br/>
<br/>


<div align=center>

# Operation Catalog
</div>

#### **Collect**
>	Collect methodu, Stream’de gerçekleştirilen ara işlemlerin sonucunu döndürmek için kullanılır.

<br/>

#### **Concat**  

> <img src="./imageForMarkdown/concat.png" alt="concat" width="200"/>

>	İki veya daha fazla Stream’i birleştirip bir Stream yapmamıza olanak sağlamaktadır. Birleştirilecek Streamlerin aynı veri tipinde olması önemlidir.

<br/>

#### **Difference**

> <img src="./imageForMarkdown/difference.png" alt="difference" width="200"/>

>	İki stream arasında farklı değerlere sahip olanları yani uniq olanları seçmemizi sağlar

<br/>

#### **Distinct**

> <img src="./imageForMarkdown/distinct.png" alt="distinct" width="200"/>

>	Sql’de kullandığımız gibi, aynı elemanların tekrarlanmasını ortadan kaldırır, difference’dan farkı tek bir stream üzerinde distinct çalıştırılır ve aynı değerlerin stream’de bir defa yer alması sağlanır

<br/>

#### **Drop**
>	Belirttiğimiz şarta uymayan değerleri siler ve Streami o şekilde dönderir

<br/>

#### **Filter**

> <img src="./imageForMarkdown/filter.png" alt="filter" width="200"/>

>	Bağımsız değişken olarak iletilen Predicate’e göre öğeleri seçmek için kullanılır

<br/>

#### **Flat-Map**

> <img src="./imageForMarkdown/flat-map.png" alt="flat-map" width="200"/>

>	Birden fazla kaynağı birleştirip yeni bir Stream oluşturmaya yarar

<br/>

#### **Flatten**

> <img src="./imageForMarkdown/flatten.png" alt="flatten" width="200"/>

>	İç içe geçmiş koleksiyonları düzleştirmeye yani tek bir koleksiyona indexlememizi, atmamızı sağlıyor

<br/>

#### **Fold**
>	Reduce için alternatif bir isimdir

<br/>

#### **Group-By**

> <img src="./imageForMarkdown/group-by.png" alt="group-by" width="200"/>

>	Bize SQL dilindeki ‘GROUP BY’ yan tümcesine benzer işlevsellik sağlar bunları bazı özelliklere göre nesneleri gruplamak ve sonuçları bir Map örneğinde depolamak için kullanırız

<br/>

#### **Inject**
>	Reduce için alternatif bir isimdir

<br/>

#### **Intersection**

> <img src="./imageForMarkdown/intersection.png" alt="intersection" width="200"/>

>	İki listenin kesişimini almamızı sağlayan bir yapıdır, Stream API’nin direkt bunu destekleyen bir yapısı yoktur ama bu işlemi distinct ve filter kullanarak yapabiliriz

<br/>

#### **Map**

> <img src="./imageForMarkdown/map.png" alt="map" width="200"/>

>	Stream’i başka bir stream’e çevirmek için kullanılır

<br/>

#### **Mapcat**
>	Flat-map için alternatif bir isimdir

<br/>

#### **Reduce**

> <img src="./imageForMarkdown/reduce.png" alt="reduce" width="100"/>

>	Genelde kümülatif operasyonlarda sıkça kullanılır. Bir veri setinde sırayla işlem yapmak istiyorsak ve bir önceki yaptığımız işlemi de dahil etmek istiyorsak reduce metodunu kullanabiliriz

<br/>

#### **Reject**
>	Filtrenin tersi, şart ile eşleşmeyen öğeleri döndürür, bunu ise Predicate sınıfının not fonksiyonu ile sağlayabiliyoruz, not fonksiyonu içine şartımızı yazabiliriz

<br/>

#### **Select**
>	Filter için alternatif bir isimdir

<br/>

#### **Slice**

> <img src="./imageForMarkdown/slice.png" alt="slice" width="200"/>

>	Verilen ilk ve son konumlar arasında listenin bir alt dizisini döndürür

<br/>

#### **Sort**

> <img src="./imageForMarkdown/sort.png" alt="sort" width="200"/>

>	Stream nesnesini sıralamak için kullanlır

<br/>

#### **Take**
>	Listenin ilk n. İndexe kadar olan kısmını döndürür

<br/>

#### **Union**

> <img src="./imageForMarkdown/union.png" alt="union" width="200"/>

>	İki streami birleştirir ve birleşim streaminde aynı elemnaların tekrarlanmasını ortadan kaldırır, yani concat ve distinct uygular
