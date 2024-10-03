package hafta02;

public class methodlara_giris {

    static void yaz(){ //method eğer değer döndürmeyecekse void kullanılır
        //yaz() burada değer almıyor
        //bu method ne değer alır ne de değer gönderir
        System.out.println("Bu metin yaz() methodu içinden yazdırıldı!");
    }

    static void topla(int a, int b){ //değer döndürmez, iki adet int değer alır
        int toplam = a + b;
        System.out.println("Toplam = " + toplam);
    }

    static int carp(int a,int b){ //carpıp sonucu integer türünde return edecek
        //hem dönüşü hem girişi olan method

        //int carpma;
        //carpma = a*b;
        //return carpma;
        // bu şekilde de işlem yaptırılabilir fakat gereksiz yere
        //değişken tanımlamış oluruz. İsraf olur!

        return a*b;
    }



    public static void main(String[] args) {
        //yaz(); bir sefer methoda gönderir
        for(int i=0;i<10;i++){  //i+=5 yazsaydık kaç kere yazardı?
            yaz();
        }

        topla(45,56);

        int x,y;
        x=30;
        y=60;
        topla(x,y);

        int a,b;
        a=13;
        b=17;
        topla(a,b);

        int carpim;
        carpim = carp(40,32);
        System.out.println("Çarpım =" + carpim);

    }


}
