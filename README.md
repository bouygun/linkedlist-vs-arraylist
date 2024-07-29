# JAVA LINKED LIST VE ARRAY LIST 

## ArrayList

- İçerisinde tekrar eden ya da boş değerler içerebilir.
- Dahili olarak array kullanılır. Bu yüzden veriye index erişimi sağlar verilerin ekleme sırasını korur.
- Başlangıçta varsayılan bir kapasite var. Eklenecek veriler kapasiteyi aşarsa array tekrar boyutlanır.

## LinkedList

- Farklı veya aynı tiplerde verilerin RAM’de linear ve birbirine bağlı olarak çift bağlantılı bir veri yapısıdır.
- Veriler linear olması array gibi sırayla tutulduğu anlamına gelmez. Her eleman hafızada rastgaele adreslerde olabilir
>Tutulacak verini;
> prev: bir önceki verinin referansı
> next: bir sonraki verinin referansı.

- Son elemanının next kısmı ve ilk elemanın prev kısmı bir referans içermediği için Null’dır.
> İlk eleman head, son eleman tail olarka adlandırılır.

- Arrayliste kıyasla bellek yükü daha fazladır. Çünkü pre ve next node adreslerini tutar ama arraylist sadece gerçek veriyi tutar.

## Benzerlikler

- Elemanların eklenme sırasını korurlar.
- Senkronize değildir.
- Bir elemanın listede olup olmadığını kontrol etmek için listenin üzerinden geçiş yapılır. Dolayısıyla contains() methodu için ikisininde de time complexity O(N)’dir.