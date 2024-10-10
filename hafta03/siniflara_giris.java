package hafta03;

class Ogrenci{
    int numara;
    String ad;
    String soyad;
    String email;

    void yaz(){
        System.out.println(this.numara + "-"+this.ad + "-"+this.soyad + "-"+this.email);
    }

}


public class siniflara_giris {
    public static void main(String[] args) {
        Ogrenci o1=new Ogrenci(); //Ogrenci sınıfının bir kopyası nesne olarak tanımlandı
        o1.numara = 13;
        o1.ad = "Ali";
        o1.soyad = "Alkan";
        o1.email = "a@a.com";
        o1.numara = 25;
        //System.out.println(o1.ad + " " + o1.soyad + " " + o1.numara + " " +o1.email);
        //o1.numara = 32; //değişken değeri atanır ama yazdıktan sonra!!! Sınavda soracağım ~%75 hata payı olacak
        o1.yaz();

        Ogrenci o2 = new Ogrenci();
        o2.ad="Arif Samet";
        o2.soyad = "Aydın";
        o2.numara=93;
        o2.email="as@as.com";
        o2.yaz();

    }
}
