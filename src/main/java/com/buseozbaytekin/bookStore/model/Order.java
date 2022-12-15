package com.buseozbaytekin.bookStore.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")//sqlde order ayrılmış keyword. bu sebeple proje patlamasın diye burada entity name tanımlıyoruz bu order a isim veriyoruz.
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;
    //private List<Integer> bookList;
    private Double totalPrice;
}
 /*
 BookStoreApplication CommandLineRunner interface ini implement ediyor. bu bir run metodu sağlıyor ve uygulama ayağa kalkarken
 çalışıyor. buraya test amaçlı kitaplar eklendi. sonrasında bookStoreController içerisine postMapping endpointi kondu ve bunun içerisinde bookOrderRequest alıyor.
 BookOrderRequestte ise List bookIdList ve String userName var. bu veriler orderService e yönlendiriliyor. BookService ten book listesini alıp pricelarını toplayıp
  total price ı hesaplıyor daha sonra verileri toplayıp order sayfasına yazıyor putAnOrder metodunda. ve bookStoreController da ki postMapping endpointinde bize order
  nesnesi dönüyor. Biz bu order ı kullanıcıya döndürüyoruz. nesne otomatik olarak spring web kütüphanesi tarafından
  JSON yapısına döndürülüyor ve karşımıza stringi dönüyor.
Database in değişecekse hangi konfigürasyonu kullanacaksan onu applicationproperties den belirtmelisin.

  */