package hafta06;

class Anasinif{ //superclass
    final int b= 3;
    int a;
    void  yaz (){
        a = 5;
        System.out.println("Ben ana sınıftan yazdırıldım");
    }
}

class Altsinif extends Anasinif{ //subclass
    void yaz(){
        super.yaz();
        System.out.println(this.a);
        System.out.println("Ben de alt sınıftan yazdırıldım");
    }
}

public class super_ve_final_terimleri {
    public static void main(String[] args) {
        Altsinif as = new Altsinif();
        as.yaz();
    }
}
