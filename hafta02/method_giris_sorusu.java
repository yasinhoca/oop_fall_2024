package hafta02;

public class method_giris_sorusu {
    //Kendisine gönderilen üç sayıdan, ilk İki sayıyı çarpıp,
    // sonucu üçüncü sayıya bölen ve sonucu float olarak return eden
    // methodu yazınız?

    static float islem(int a, int b, int c){
        float sonuc;
        sonuc = (float) (a*b)/c;
        return sonuc;
    }


    public static void main(String[] args) {
        int a,b,c;
        a=6;
        b=8;
        c=13;
        float hesap;
        hesap = islem(a,b,c);
        System.out.println(hesap);
    }
}
