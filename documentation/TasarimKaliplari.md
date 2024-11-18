Design Patterns Nedir?

Design patterns yani tasarım kalıpları, yazılım geliştirmede yaygın olarak karşılaşılan zorluklar için geliştirilen, test edilmiş, kendini kanıtlamış kod tasarımları, programlama şablonlarıdır.

Tasarım kalıpları bir algoritma, framework veya kod değildir. Ayrıca belli dile özgü değildir, dilden bağımsızdır. Genellikle nesneler arası ilişkiler UML diyagramları ile gösterilir. Design Pattern yani tasarım kalıpları genellikle OOP yani Nesne Tabanlı Programlama’da kullanılır. Sayıları bugün yüzlerle ifade edilse de temelde 23 farklı tasarım deseni bulunmaktadır.

Tasarım desenleri 3 ana başlık altında incelenir.

    Creational Patterns (Yaratımsal Kalıplar)
    Structural Patterns (Yapısal Kalıplar)
    Behavioral Patterns (Davranışsal Kalıplar)

Creational (Yaratımsal) Design Patterns

Nesnelerin oluşturulması ve yönetilmesi ile ilgilidir. Nesnelerin hangi sınıflarda hangi kurallarla oluşturulacağı, oluşturulan nesneler üzerine yapılacak olan güncellemeler ile ilgili durumları, bağımlılıkların azaltılması ve nesne oluştururken ihtiyaca göre en optimal çözümlerin üretilmesi için geliştirilmiş tasarımlardır.

    Factory Pattern
    Abstract Factory Pattern
    Singleton Pattern
    Prototype Pattern
    Builder Pattern

Factory Pattern

En önemli design pattern’lardan bir tanesidir. Birbirleri ile benzer yapıda olan nesnelerin nerede en verimli şekilde yaratılacağı probleminden dolayı ortaya çıkmıştır.

Factory Pattern, aynı abstract class veya interface’den türeyen nesnelerin üretiminin bir class üzerinden sağlanmasıdır. Üretilecek olan nesnenin hangi class’tan olacağına subclass’lar karar verir.

Factory Design Pattern, nesne yaratma işlemi için bir arayüz tasarlanmasını gerektirir ve alt sınıfların nesne üretmesine olanak sağlar. Ayrıca, hangi sınıf nesnesinin oluşacağını da alt sınıflar kendileri belirler.

Çeşitli markalara ait Arabalar ürettiğimizi düşünelim. Bilindiği üzere programlamada benzer özellikler taşıyan class’lar bir interface’ten türetilir ki bu programa daha esnek bir yapı kazandırır, daha az kod yazmayı ve lously coupling bir yapı oluşturmayı sağlar ve polymorphism’in sunduğu avantajları kullanmamıza imkan verir.

Buradan yola çıkarak çeşitli markalara arabalar üreten bir uygulama geliştirdiğimizi varsayalım. Bunun için ilk olarak Araba isimli bir interface oluşturup içerisine gerekli metotları yazmamız, ardından Araba türündeki diğer class’ları bu interface’e implement etmemiz oldukça mantıklı olacaktır.

Bu işlemleri gerçekleştirdikten sonra, nesne üretimini gerçekleştireceğimiz bir fabrika sınıfı tasarlamamız gerekmektedir. Bu sınıf birbiri ile benzer nesnelerin üretimini gerçekleştireceğimiz ve “nesne nerede yaratılmalı” sorusuna cevap oluşturacağımız sınıftır.

Bu sınıfta oluşturduğumuz metot, verilen bilgilere göre ve istenen özelliklere uygun objeler oluşturmaktan ve bunları return sorumlu olacaktır. Metodun return type’ı tüm araba türlerini kapsayan Araba interface’i olacaktır.
Abstract Factory Pattern

Abstract Factory Desing Pattern yapısında, benzer nesnelerin üretimi için her nesne türüne ait bir fabrika oluşturulur. Bu fabrikalar ise abstract bir ana fabrikadan türer

Factory Design Pattern yapısında, birbirleri ile benzer nesnelerin üretimini tek bir sınıfa bağladık ve tek bir arayüz üzerinden işlemlerimizi gerçekleştirdik. Abstract Factory yapısında ise benzer nesne üretimlerini gerçekleştirebilmek adına her nesne için ayrı bir fabrika sınıfı oluşturmamız gerekmektedir. Ayrıca bu desen, birden fazla Interface kullanımı ile gerçekleştirilir. Factory Design Pattern’de bulunan koşullu durum(if/else if/else if…) problemi Abstract Factory’de çözülür.

Farklı markalara ait Araba ve Motor türünde nesneler üreten bir uygulamamız olduğunu düşünelim. Factory Pattern’da olduğu gibi Car isimli bir interface’imiz ve ona implement edilen BMWCar ve AudiCar gibi class’larımız var.

Aynı şekilde Motor isimli bir interface’imiz ve ona implement edilen BMWMotor ve AudiMotor şeklinde iki ayrı class’ımız var.

Son olarak bu markalardan nesneler üreten fabrikalarımız olacak. Fakat bu fabrikaları da yine ana bir fabrika interface’ine bağlayacağız. Bu yüzden IFactory şeklinde bir interface’imiz olduğunu düşünelim. Ve ona bağlı olarak BMWFactory ve AudiFactory şeklinde iki ayrı fabrikamız var.

IFactory içerisinde motor ve car üretemek için oluşturulmuş iki metod var. Bu metotlar, BMWFactory ve AudiFactory tarafından override edilecek ve AudiFactory AudiCar ve AudiMotor üretecek. BMWFactory ise BMWMotor ve BMWCar üretecek.
Singleton Pattern

Singleton Design Pattern, bir sınıftan yalnızca bir nesne üretilebilmesini garanti eder ve diğer sınıfların(yeni nesne üretmeleri yerine) bu nesneye erişebilmelerine olanak sağlar. Dosya işlemleri, veri tabanı bağlantıları, loglama işlemleri gibi karmaşık sistemlere erişimi kontrol eden sınıflarda Singleton örneği görmek mümkündür. Bu tarz sınıflardan yalnızca bir instance bulunması sistem için yeterli olacaktır.

Peki bir sınıfın yalnızca bir nesnesi olmasını nasıl sağlayabiliriz ? Nesne üretimlerini Constructor metotlar sayesinde gerçekleştirdiğimizi düşünürsek, onu private olarak oluşturmak, dışarıdan nesne oluşturmanın önüne geçecektir. Constructor, private tanımlandığına göre nesne sınıf içerisinde oluşturulmalıdır.

Böylece söz konusu sınıf içerisinde genellikle getInstance() ismi verilen ve bu sınıfta oluşturulan nesneyi return eden bir metot oluşturulur. Bu metot, daha sonra bu class’tan bir nesne oluşturulamayacağı için static olmalıdır. Böylelikle direkt olarak class üzerinden bu metoda erişmek mümkün hale gelecektir. Metodumuz static olacağı için, oluşturulan nesnemizin de static olması gerekir. Zira bilindiği üzere static metotlar içerisinde yalnızca static elementler kullanılabilir.

    Lazy Singleton:

Singleton Design Pattern tasarımında gereksiz nesne oluşturma işleminin önüne geçmek için gerçekleştirilir. Temelde, nesne yaratma işleminin getInstance() metodu içerisinde gerçekleştirilmesidir. Böylelikle ihtiyaç duyulmadığı müddetçe, objenin oluşturulmasının önüne geçilir. Metodun içerisinde, obje oluşturulmadan önce null kontrölü yapılır.

class LazySingleton{
private static LazySingleton singleton; // obje

    private LazySingleton(){ //constructor
    }
//nesne metod çağırıldığında oluşacak.
public static LazySingleton getInstance(){
if(singleton==null){
singleton = new LazySingleton();
}
return singleton;
}
}

Prototype Pattern

Prototype Design Pattern, aynı sınıftan üretilecek olan ve pek çok ortak özelliği bulunan benzer nesnelerin üretimi sırasında gerçekleşebilecek karışıklıkları engellemek ve üretim maliyetini azaltmak amacı ile kullanılır. Özellikle oyun yazılımlarında kullanımını görmek mümkündür. Örneğin, bir savaş oyununda aynı askerden yüzlerce tane bulunurken bu askerlerin yalnızca kimlik numaraları farklıdır. Her defasında sıfırdan asker nesnesi yaratmak, constructor’u baştan sonra tekrar tekrar gerekli bilgilerle doldurmak yerine var olan asker nesneleri kopyalanır ve set metodu ile yalnızca kimlik numaraları vs. gibi değişecek bilgiler değiştirilir.

Nesne kopyalama işlemini gerçekleştirebilmek adına obje oluşturulacak class, Cloneable Interface’i implement edilir ve clone metodu override edilir.

@Override
public Soldier clone() {
Soldier soldier = null;
try {
soldier = (Soldier) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalama sırasında bir hata oluştu");
            e.printStackTrace();
        }
        return soldier;
    }

Nesne oluşturulacak class oluşturulduktan sonra, artık farklı class’larda oluşturulan bir obje, clone() metodu ile klonlanabilir. Aynı şekilde setter metotlarla istenen field’leri değiştirilebilir.

public class Main {
public static void main(String[] args){

Soldier availableSoldier =
new Soldier(100,45,20,50,60,5,"Kılıç",true);

        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);
    }
}

Builder Pattern

Nesne tabanlı programlamanın özü sınıflara dayanır. Sınıflardan nesneler yaratırız. Bunu yapmak için de constructorları kullanırız. Sınıfımızda bulunan field sayısı fazla olursa bundan dolayı birden çok constructora ihtiyaç duyabiliriz. Haliyle her bir field eklendiğinde yeni bir constructor ekleme ihtiyacı hissedebiliriz. Çünkü nesneyi oluştururken hangi field başta atama yapılacak ya da yapılmayacak bilemeyebiliriz. İşte bu uzayıp giden parametre sayısından, karmaşık constructorlardan kurtarmak için Builder Pattern güzel bir çözüm sunuyor.

Builder tasarım deseni ile sınıfımızın içine static bir inner class ekliyoruz. Builder ismini verdiğimiz bu class, asıl nesnemizi yalnızca istediğimiz field’larla oluşturmamıza imkan sunuyor. Sonuç olarak nesne oluştururken karşımıza aşağıdaki gibi bir yapı çıkıyor.

Person person = new Person.Builder().name("Osman").surname("Dogan").address("Istanbul").build();

Structural (Yapısal) Design Patterns

Daha büyük yapılar oluşturmak için sınıfların tasarımı ve birbirileri arasındaki ilişkilerin nasıl olacağı ile ilgilidir.

    Adapter Design Pattern
    Flyweight Design Pattern
    Composite Design Pattern
    Facade Design Pattern
    Proxy Design Pattern
    Decorator Design Pattern
    Bridge ****Design Pattern

## Composite (Bileşik) Design Pattern

Kendi içlerinde birbirlerinden farklı olan bir grup nesnenin sanki tek bir bütün nesneymiş gibi kullanılabilmesine imkan sağlayan tasarım desenine Composite Design Pattern denir. Bu tasarımın görevi, nesneleri bir ağaç yapısında birleştirip uygulamanın genelindeki parça bütün ilişkisini yeniden düzenleyip şekillendirmektir.

Yazılımcı, kullanıcının isteği doğrultusunda aynı türden veya farklı türlerden bir nesne topluluğu kullanmak zorunda ise, karmaşadan ve karışıklıktan kurtulmak için, tüm parçalar ile tek tek uğraşmaktansa bileşik kalıp kullanabilir.

Örnek vermek gerekirse elimizde daha sonra film türlerini implement edeceğimiz bir Movie interface’i var. Ve bu interface’in içerisinde tüm, Movie türleri tarafından kullanılması istenen showMovieInfo() isimli bir metot var.

Daha sonra bu Movie interface’ine implement edilen bir Comedy ve Horror türünde filimlerimiz olduğunu düşünelim. Üretilirken film ile ilgili çeşitli bilgiler alan bir Constructor’a sahip olan bu class’lar ayrıca showMovieInfo() metodunu override ediyor ve kendisi ile ilgili tüm bilgileri ekrana yazdırıyor.

Şimdi elimizde birden fazla film türünde birden fazla obje olduğunu düşünelim. Bunlarla ilgili toplu işlemeler yapmak istediğimizde mesela her birinin bilgileri ekrana yazdırmak istediğimizde mecburen gidip teker teker hepsinin showMovieInfo() metodunu çağırmamız gerekecek.

Onun yerine Movie interface’ine implement edilen ve içerisinde Movie data türünde objeler içeren bir listin yer aldığı Container bir class’ımız olsa. Bu listeye her türden Movie nesneleri eklemek ve silmek için add ve remove metotlarımız olsa ve birde içerdiği tüm filmler ile ilgili toplu işlemler yapabilse. Mesela showMovieInfo() metodunu override ederek bir for döngüsü ile showMovieInfo() metodunu kullanarak tüm filmlerin bilgilerini ekrana yazdırsa güzel olmaz mıydı?.

İşte bu yapıyı Composite Design Patter ile oluşturuyoruz. Bu sayede film objelerimizi container’daki bu listeye ekleyip, aynı türden fakat bir birinden farklı objeler üzerinde pek çok işlemi toplu halde gerçekleştirebiliyoruz.

## Facade Design Pattern

Bir alt sistemin parçalarını oluşturan classları istemciden soyutlayarak kullanımı daha da kolaylaştırmak için tasarlanmış tasarım kalıbıdır. Mimarisel açıdan ise, karmaşık ve detaylı bir sistemi organize eden ve bir bütün olarak clientlara(istemcilere) sunan yapıdır.

Burada bilmeniz gereken durum, alt sistem içerisinde bulunan sınıfların birbirlerinden bağımsız olmasıdır. Ayriyetten Facade sınıfından da bağımsız bir şekilde çalışabilmektedirler. Facade bizim classlarımızı içermek zorundadır ve operasyonu yaparken onlara ait fonksiyonellikleri kullanması gerekli.

Elimizde üç farklı görev ve fonksiyona sahip 3 class olduğunu düşünelim. Kullanıcının yapacağı işlem bu üç class’ı da ilgilendiriyor yani kullanıcının istediği işlemi yapabilmek için bu üç class’ı da kullanabilme ihtimali bulunuyor, (tek veya birlikte).

Böyle bir durumda biz bir Facade Class oluşturup, kullanıcıyı karmaşık bir yapıdan kurtarıyor ve ona daha basit bir arayüz sunuyoruz. Facade Class’ımız doğal olarak bu üç class’tan da değişkenlere sahip bulunuyor ve task’e göre bu üç class’ı da kullanıp, nihai olarak kullanıcının gerçekleştirmek istediği görevi yerine getiriyor.
Proxy Design Pattern

Geliştirdiğiniz bir uygulamada, bellek üzerinde büyük kaynak harcayan bir nesneye ihtiyaç duyduğunuzu varsayalım. Örneğin bu nesne bir resim üzerine işlem yapıyor olabilir. Haliyle böyle maliyetli bir nesneyi her zaman bellekte tutmak istemezsiniz. Sadece istemciden talep geldiği zaman nesneyi oluşturup, metodu çağırıp, işi bittiğinde de nesneyi bellekten kaldıran bir yapıya ihtiyacınız var. İşte böyle bir yapı kurmak için bir vekile ihtiyacınız var. Bu vekil yalnızca gerçekten ihtiyaç duyulduğu anda temsil ettiği neyseye erişim sağlayacak ve işlemleri gerçekleştirecek.

Özetle ifade etmek gerekirse, bir nesne, çok önemli sorumlulukları gerçekleştiriyor olabilir. Bu nesneye diğer nesneler tarafından doğrudan erişilmesi güvenlik problemlerine sebebiyet verebilir. Ayrıca, ilgili nesnemizin görevlerini yerine getirmesi oldukça maliyetli de olabilir. Örneğin, çalışmak için çok fazla zamana ihtiyaç duyuyor veya çok fazla bellek tüketiyor olabilir. Bu tarz nesnelerin yalnızca ihtiyaç anında kullanılması gerekmektedir. Aksi taktirde sistem performansı olumsuz etkilenecektir. Güvenlik açısından sakıncalı durumlarda ise bu olumsuzluk, sistemin çökmesine kadar giden problemlere dahi sebep olabilir.

Proxy Design Pattern, bir nesneye olan erişimin kontrol altına alınması amacı ile kullanılır. İstemcilerin direkt olarak ilgili nesneye ulaşması yerine bir vekil aracılığı ile (dolaylı olarak) nesneye ulaşmasını sağlar. Vekil nesne, yalnızca gerekli durumlarda asıl nesne ile iletişime geçer ve ilgili işlemler gerçekleştirilir. Proxy Design Pattern çeşitli amaçlarla kullanılabilir.
Decorator Design Pattern

Decorator tasarım deseninin amacı nesnelere dinamik olarak özellik eklemektir ve nesne kendisi de eklenen özelliklerden habersiz ve ayrı bir konumda olmalıdır. Yani kodun belli kısımlarında nesnelere belli özellikler kazandırmak istiyorsak ve bunu nesnenin kendi classından ayrıştırılmış bir şekilde yapmak istiyorsak decorator tasarım desenini kullanmalıyız.

Örneğin elimizde bir Phone interface’i ve ona bağlı bir iPhone class’ımız var. Fakat daha sonra iPhone modelleri artmaya başladı, temel bazı özelliklerde bazı değişiklikler oldu. Bu durumda ya her iPhone modeli için oluşturulan class’a girip tüm özellikleri en baştan yazmak gerekecek, ki bu hem uygulamanın şişmesine hem de vakit kaybına sebep olacak. Ya da temel iPhone class’ını decorator class’ı aracılığı ile, bu class’a extend edilen class’lara enjekte edip, bu özellikleri her seferinde yendien oluşturmadan, diğer tüm iPhone modellerine ekleyip onlara bazı yenilikler getirebileceğiz.
Adapter Design Pattern

Adapter tasarım kalıbı bir sistem parçasının, var olan başka bir sisteme adapte edilmesini ve o sistem içerisinde kullanılabilmesini sağlayan bir kalıptır. Örneğin elinizce Crypt isimli bir interface ve bu interface’den türeyen ACryptor ve BCryptor isimli iki class var. Bunların dışında bir de bu interface ve class’larla hiç bir şekilde ilgilisi bulunmayan XCryptor isimli bir class’ınız var ve bu da diğer class’larla benzer işler yapıyor.

Diyelim ki bu XCryptor class’ını mevcut yapıya yani Crypt’e adapte etmemiz gerekiyor. Bunun için ya XCryptor class’ına gidip onu Crypt interface’ine implement etmemiz ve doğal olarak Crypt ile gelen tüm metodları override etmemiz ve aynı şekilde XCryptor class’ındaki tüm yapıyı baştan aşağı yeniden düzenlememiz gerekecek ki bunlar işimizi bir hayli zorlaştıracak.

Ya da XCryptorAdaptor isimli yeni bir class oluşturup bunu Crypt interface’ine implement ettikten sonra içine bir XCryptor objesi ekleyeceğiz. Ve kullanmamız gereken ve override etmemiz gerken metotları, bu XCryptor objesine bağlanarak, bu objedeki metotlar yardımı ile kullanacağız. Böylelikle ne XCryptor’a ne de Crypt yapısına müdahale etmiş olduk.
Flyweight Design Pattern

Kullanım amacı, benzer nesneleri tekrar tekrar oluşturmak yerine ortak bellek alanlarını kullanarak bellek kullanımı azaltmaktır. Bu tasarım örüntüsüne örnek olarak “String Pool” verilebilir.

Flyweight her bir nesnede tüm verileri tutmak yerine, ortak kısımları paylaşarak mevcut hafıza (RAM) miktarına daha fazla nesne sığdırmanıza olanak sağlayan bir yapısal tasarım desenidir.
Bridge ****Design Pattern

Bridge, Türkçe karşılığı ile köprü büyük sınıfları veya birbiriyle yakın ilişkili sınıfları, birbirinden bağımsız olarak geliştirilebilecek iki ayrı hiyerarşiye bölmenizi sağlayan bir tasarım desenidir.

Örneğin Doviz isimli bir interface ve bu interface’e implement edilen USD ve EURO isimli class’larımız var. Biz bir Doviz objesi içeren bir Abstract Class oluşturup, bu abstract class’ın child class’larından, Doviz class’larına erişim sağlayabiliriz.
Behavioral(Davranışsal) Design Pattern

Nesnelere doğru sorumlulukların verilmesi, uygun algoritmaların kullanılması ve nesnelerin doğru yerde doğru işi yapmaları yazılım için hayati önem taşımaktadır. Behavioral/Davranışsal tasarım desenleri, bu problem ve ihtiyaçlara çözümler bularak nesnelerin görev sorumluluklarının düzenlenmesini sağlayarak daha performanslı ve güvenilir yazılımlar oluşturulması için kullanılırlar.

    Strategy Design Pattern
    Command Design Pattern
    Iterator Design Pattern
    Template Design Pattern
    Observer Design Pattern
    Memento Design Pattern
    Mediator Design Pattern
    Chain of Responsibility Design Pattern
    Visitor Design Pattern
    State Design Pattern
    Interpreter Design Pattern

Chain of Responsibility Design Pattern

Chain of Responsibility, Türkçe adıyla “Sorumluluk Zinciri” bir isteği bir dizi işleyici (zinciri) boyunca iletmenize izin veren davranışsal bir tasarım desenidir.

Sorumluluk zinciri deseni işleyici sınıfları bir zincir şeklinde birbirine bağlamanızı önerir. Zincirdeki her işleyicide bir sonraki işleyicinin referansını tuttuğu bir alan vardır. İstek bu zincirin başından sonuna kadar tüm işleyicilerden geçer.

İşin güzel tarafı işleyiciler isteği zincirin bir sonraki adımına göndermemeyi tercih edebilir ve böylece işlemi durdurulabilir. Daha ilk aşamada durması gereken bir istek sonraki aşamalara hiç aktarılmaz. Kullanıcı girişi hatalıysa, istek parametrelerini filtrelemeniz, sonuçlar ön bellekte var m bakmanız, yoksa veri tabanından sorgulamanız vs. vs. gerekmez.

Buna örnek olarak bir bankayı hayal edelim. Müşterilerden gelen tüm para çekme talepleri vezneden geçmek zorundadır. Eğer vezne talep edilen miktarı vermeye yetkili ise müşterinin ödemesi gerçekleştir değilse istek müdüre aktarılır. Aynı şekilde müdürün yetki durumuna göre para ödenir veya istek genel müdüre aktarılır.
Observer Design Pattern

Observer adından da anlaşılacağı üzere gözlemci, izleyici, gözcü yahut gözetmen diye nitelendirilen, anlamı gibi işlev gören bir tasarım desenidir. Elimizdeki mevcut nesnenin durumunda herhangi bir değişiklik olduğunda, bu değişiklerden diğer nesneleri haberdar eden bir tasarımdan bahsediyoruz. Dahada net bir şekilde bahsetmek gerekirse, elimizdeki “x” nesnesinin “y” özelliğinde bir güncellenme, değişiklik yahut belirli bir şartın gerçekleşmesi gibi bir durum cereyan ettiğinde bu “x” nesnesini -izleyen- -gözleyen- diğer “z”, “w”, “k” vs. nesnelerine bu yeni durumu bildiren sisteme Observer tasarım deseni diyoruz.
Mediator Design Pattern

Mediator (Ara bulucu ) nesneler arasındaki kaotik bağımlılıkları azaltmayı sağlayan davranışsal bir tasarım desenidir. Bu desen nesneler arasındaki doğrudan iletişimi sınırlar ve sadece mediator nesnesi üzerinden haberleşmeye zorlar.

Mediator tasarım deseni birbirinden bağımsız hale getirmek istediğiniz elemanlar arasındaki doğrudan iletişimi kesmeniz gerektiğini önerir. Bu bileşenler doğrudan iletişim kurmak yerine yerine, çağrıları uygun bileşenlere yönlendiren özel bir mediator nesnesi vasıtası ile dolaylı olarak iş birliği yapmalıdır. Böylece bileşenler düzinelerce başka elemana bağlanmak yerine tek bir mediator nesnesine bağımlı olacaklardır.

Mediator design patternini birbirleriyle ilişkili eş görevli bir grup nesneyi tek merkezden yönetmek ve aralarında gevşek bağlı(loosely coupled) sistemler kurmak istediğimiz durumlarda kullanabiliriz.

Sonuç olarak Mediator design patterninin bize söylediği şey, bu birbiriyle ilişki içinde olması gereken nesneleri ki bunlar birbirleriyle chatleşecek userlar olabilir, birbirleriyle iniş kalkış için iletişim kurması gereken uçak nesneleri olabilir, tek bir merkez içerisinde (mediator classta) birbiriyle konuşturun. Böylece nesneler arasında gevşek bağlı sistemler kurmuş olursunuz ve karmaşıklığı minimuma indirirsiniz.
Strategy Design Pattern

Strategy deseni, spesifik bir işi bir çok farklı yolla yapan bir sınıfı alıp bütün bu algoritmaları strategy adı verilen ayrı sınfılara ayırmanızı öneriyor. Bu modelde, bağlam (context) adını vereceğimiz orijinal sınıfta, oluşturacağımız bu stratejilere referansları içeren alanlar oluşturulması gerekiyor. Örneğin elimizde üç farklı şifreleme algoritması var bunları şifreleme isimli bir interface’e implement edilen üç farklı class olarak oluşturup ihtiyaç duyduğumuz yerde kullanabiliriz.
Command Design Pattern

Metotları bir aracı üzerinden çağırmayı ve böylece istemci ile metot arasındaki bağı zayıflatmayı ve loosely coupled bir yapı oluşturmayı hedefleyen bir tasarım desenidir. Böylece istemciyi değiştirdiğimizde, metot bundan etkilenmez, metodu değiştirdiğimizde istemci bu değişimden etkilenmez
Iterator Design Pattern

Tekrarlayıcı tasarım kalıbı; birleşik bir nesnenin bileşenlerine, nesnenin esas ifadesinin gösterilimini açığa çıkarmadan sırayla erişebilmeyi sağlar. Iterator Design Pattern, yazılımcıların sabah akşam bazen farkına bile varmadan kullandıkları bir desen aslında. For-each her kullandığınız da iterator pattern kullanıyorsunuz.
Template Design Pattern

Template Method ( Şablon Yöntemi ), üst sınıfta algoritmanın bir iskeletini oluşturan, alt sınıfların yapıyı değiştirmeden bu algoritmanın belirli adımlarını değiştirmesine izin veren bir tasarım desenidir.
Memento Design Pattern

Memento Design Pattern, elimizdeki mevcut nesnenin herhangi bir T anındaki durumunu kayda alarak, sonradan oluşabilecek değişiklikler üzerine tekrardan o kaydı elde etmemizi sağlayan bir desendir.
Visitor Design Pattern

Uygulamalarda belirli sınıflara, o sınıfların fiziksel yapılarını değiştirmeksizin yeni fonksiyonaliteler eklemek gerektiği durumlarda kullanılan bir tasarım desenidir. Visitor Pattern, yeni davranışı mevcut sınıflara entegre etmek yerine, visitor adı verilen ayrı bir sınıfa koymanızı önerir. Bu davranışı gerçekleştirmesi gereken asıl nesnemizi, nesne içerisindeki gereken tüm verilere erişebileceğinden de emin olarak, visitor’un metodlarından birine parametre olarak göndeririz.
State Design Pattern

State design patterni, nesnenin iç durumundaki değişikliklere göre çalışma zamanında farklı davranışlar sergilemesini sağlayan tasarım kalıbıdır. Yani biraz daha açarsak nesne belli özelliklerindeki değişimlere göre farklı davranışlar, fonksiyonellikler sergilemesi gibi düşünebiliriz. Örneğin bankanız kredi kartınızın bakiye-borç değerindeki değişimlere göre dinamik olarak sizin hesabınızı farklı davranışlara yani durumlara(state’lere) sokabiliyor.
Interpreter Design Pattern

Interpreter tasarım deseni, behavior grubununa ait, belli bir düzen veya kurala bağlı olan metinlerin sayısal veya mantıksal olarak işlenmesi gereken durumlarda ve kural işletme motorları(Rule Engine) için sıklıkla kullanılır. 