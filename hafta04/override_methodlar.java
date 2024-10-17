package hafta04;

class Cokgen{
    int kenar_sayisi;
    int yukseklik;
    float alanHesapla(int kenar_uzunlugu){
        return (float) this.kenar_sayisi*this.yukseklik*kenar_uzunlugu/2;
    }
}

class Kare extends Cokgen{
    int kenar_uzunlugu;

    float alanHesapla(int kenar_uzunlugu){ //miras aldığı Cokgen sınıfındaki alanHesapla() methodu iptal edilir, bu method kullanılır. Buna Override denir
        return (float)kenar_uzunlugu*kenar_uzunlugu;
    }

}


public class override_methodlar {
    public static void main(String[] args) {
        Kare k = new Kare();
        System.out.println(k.alanHesapla(14));


    }
}
