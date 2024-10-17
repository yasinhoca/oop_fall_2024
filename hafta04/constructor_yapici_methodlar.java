package hafta04;

class Ucgen{
    float taban;
    float yukseklik;

    Ucgen(){ //constructor'lar sınıfla aynı ismi taşımak zorunda
        this.taban=5f;
        this.yukseklik=8f;
    }

    //constructor methodlar da overload edilebilir
    Ucgen(float taban, float yukseklik){
        this.taban = taban;
        this.yukseklik = yukseklik;
    }

    Ucgen(String isim){ //constructor ama sadece terminale
        System.out.println("Merhaba " + isim);
    }

    float alan(){
        return this.taban*this.yukseklik/2;
    }
}



public class constructor_yapici_methodlar {
    public static void main(String[] args) {
        Ucgen u = new Ucgen(); //new Ucgen() ifadesinde bir kere çalışır
        System.out.println(u.alan());
        u.taban = 10f;
        u.yukseklik = 12f;
        System.out.println(u.alan());

        Ucgen u2 = new Ucgen(13f,15f);
        System.out.println(u2.alan());

        Ucgen u3 = new Ucgen("Ufuk");

    }
}
