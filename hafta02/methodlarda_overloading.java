package hafta02;

public class methodlarda_overloading {
    // java da aynı isimli fakat farklı işler yapan
    // birden fazla method tanımlayabiliriz
    // buna aşırı yükleme veya overloading denir




    static int topla(int a, int b){
        return a + b;
    }

    static  int topla(int a, int b, int c){
        return a + b + c;
    }

    static  float topla(int a, int b, float c) {
        return (float) a + b + c; //casting ile a ve b türü floata dönüştürülür
    }

    static  float topla(int a, float b, boolean c) {
        float topla = 0;

        if(c) {   // if(c==true) da yazılabilir, if blokları sonucun true mu? false mu olduğuna bakar.
            topla =(float) a+b;
        }

        return topla;
    }

    public static void main(String[] args) {
        System.out.println(topla(5,13));
        System.out.println(topla(56,93,88));
        System.out.println(topla(34, 23, (float)3.2));
        int a,b;
        float c;
        a = b = 5;
        c = 1.67342f; //sona yazılan f de casting yapar
        System.out.println(topla(a,b,c));

        System.out.println(topla(21,0.1f,true));
        System.out.println(topla(32,1.2f,false));
    }
}
