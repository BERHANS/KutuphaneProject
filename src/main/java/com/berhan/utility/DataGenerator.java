package com.berhan.utility;

import com.berhan.controller.KitapController;
import com.berhan.controller.KullaniciController;

import com.berhan.controller.YazarController;
import com.berhan.repository.entity.Kullanici;
import com.berhan.repository.entity.Yazar;

import java.time.LocalDate;
import java.util.List;

public class DataGenerator {

    KullaniciController kullaniciController;
    YazarController yazarController;
    KitapController kitapController;
        public List<Kullanici> kullaniciListOlustur(){
            Kullanici kullanici = Kullanici.builder()
                    .ad("ayşe")
                    .soyad("pembe")
                    .paraMiktari(1000.0)
                    .tcKimlik("12345478888")
                    .telefonNo("1234564789")
                    .build();
            Kullanici kullanici1 = Kullanici.builder()
                    .ad("selin")
                    .soyad("beyaz")
                    .paraMiktari(1000.0)
                    .tcKimlik("12345478888")
                    .telefonNo("1234564789")
                    .build();
                    Kullanici kullanici2 = Kullanici.builder()
                    .ad("hayriye")
                    .soyad("kırmızı")
                    .paraMiktari(1000.0)
                    .tcKimlik("12345478888")
                    .telefonNo("1234564789")
                    .build();
                    Kullanici kullanici3 = Kullanici.builder()
                    .ad("Melis")
                    .soyad("kara")
                    .paraMiktari(1000.0)
                    .tcKimlik("12345678911")
                    .telefonNo("1234564789")
                    .build();

return (List<Kullanici>) kullaniciController.saveAll(List.of(kullanici,kullanici1,kullanici2,kullanici3));
        }
        public List<Yazar> yazarListOlustur(){
            Yazar yazar = Yazar.builder()
                    .ulke("afganistan")
                    .biyografi("dadasdasdasd")
                    .soyad("mahmutoğlu")
                    .ad("mahmut")
                    .olumTarihi(LocalDate.of(1995,2,2))
                    .dogumTarihi(LocalDate.of(1940,1,1))
                    .build();
            Yazar yazar1 = Yazar.builder()
                    .ulke("pakistan")
                    .biyografi("dadasdasdasd")
                    .soyad("kelebek")
                    .ad("hasan")
                    .olumTarihi(LocalDate.of(1995,2,2))
                    .dogumTarihi(LocalDate.of(1940,1,1))
                    .build();
            Yazar yazar2 = Yazar.builder()
                    .ulke("türkiye")
                    .biyografi("dadasdasdasd")
                    .soyad("arı")
                    .ad("mehmet")
                    .olumTarihi(LocalDate.of(1995,2,2))
                    .dogumTarihi(LocalDate.of(1940,1,1))
                    .build();
            Yazar yazar3 = Yazar.builder()
                    .ulke("fransa")
                    .biyografi("dadasdasdasd")
                    .soyad("böcek")
                    .ad("ali")
                    .olumTarihi(LocalDate.of(1995,2,2))
                    .dogumTarihi(LocalDate.of(1940,1,1))
                    .build();
            Yazar yazar4 = Yazar.builder()
                    .ulke("katar")
                    .biyografi("dadasdasdasd")
                    .soyad("mor")
                    .ad("ekrem")
                    .olumTarihi(LocalDate.of(1995,2,2))
                    .dogumTarihi(LocalDate.of(1940,1,1))
                    .build();

            return
        }


}
