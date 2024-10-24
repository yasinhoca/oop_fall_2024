package hafta05;

abstract class Soyut{
    //nesnesi oluşturulamaz yada nesne üzerinde abstract methodlar override edilmelidir.
    //miras verebilir
    //abstract sınıfta en az bir tane abstract method olmalıdır
    abstract void tckimlikAl();
    abstract void ogrenciisimAl();

    void yaz(){
        System.out.println("Somut method içinden yazıldı");
    }
}

class Somut extends Soyut{


    @Override
    void tckimlikAl() {

    }

    @Override
    void ogrenciisimAl() {

    }
}



public class abstract_soyut_sınıf_ve_methodlar {
    public static void main(String[] args) {
        Somut somut = new Somut();
        somut.yaz();

       /* Soyut soyut = new Soyut() {
            @Override
            void tckimlikAl() {

            }

            @Override
            void ogrenciisimAl() {

            }
        }; */

    }
}
