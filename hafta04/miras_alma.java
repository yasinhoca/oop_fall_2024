package hafta04;

public class miras_alma {
    public static void main(String[] args) {
        Fakulte f= new Fakulte();
        System.out.println(f.uni_ad); // Universite sınıfından alıyoruz
        System.out.println(f.getYok_id());


        Bolum ybs = new Bolum(); //ybs fakülteden, fakulte de üniversiteden miras alır
        ybs.bolum_ad="Yönetim Bilişim Sistemleri";
        ybs.bolum_id=1;
        ybs.ogrenci_sayisi=400;
        System.out.println("YBS Bilgileri:");
        System.out.println("Üniversite adı = " + ybs.uni_ad);
        System.out.println("Üniversite id = " + ybs.getYok_id());
        System.out.println("Fakülte adı = " + ybs.fakulte_ad);
        System.out.println("Fakülte id = " + ybs.getFakulte_id());
        System.out.println("Bölüm adı =" + ybs.bolum_ad);
        System.out.println("Bölüm id =" + ybs.bolum_id);
        System.out.println("Bölüm öğrenci sayısı =" + ybs.ogrenci_sayisi);

        Bolum banka = new Bolum();
        banka.bolum_ad = "Bankacılık ve Finansman";
        banka.bolum_id = 2;
        banka.ogrenci_sayisi = 200;

    }
}
