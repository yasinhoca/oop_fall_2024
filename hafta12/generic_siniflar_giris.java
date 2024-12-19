package hafta12;

import java.util.ArrayList;

public class generic_siniflar_giris {
    public static void main(String[] args) {




        // Java'da kullanılan List (collections) sınıfı aslında Generic sınıftır.
        // giriş tipleri primitive değildir. int girilmez, sınıf tipi olan Integer girilmelidir.
        ArrayList<Integer> liste = new ArrayList<>();
        //String değişken zaten sınıf tipi değişkendir, primitve olanı yoktur.
        ArrayList<String> liste2 = new ArrayList<>();
        //char değil Character girilmeli
        ArrayList<Character> liste3 = new ArrayList<>();
        //boolean da aynı şekilde generic girişi Boolean olarak girilmeli
        ArrayList<Boolean> liste4 = new ArrayList<>();

        //Tüm sınıf tipi değişkenler aslında birer nesnedir (object) dolayısı ile
        //generic girişinde Object sınıfı da tutulabilir
        //Bu durum farklı değişkenlerin aynı listede tutulabilmesine imkan verir
        ArrayList<Object> liste5 = new ArrayList<>();






    }
}
