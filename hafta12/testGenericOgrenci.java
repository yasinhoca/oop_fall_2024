package hafta12;

public class testGenericOgrenci {
    public static void main(String[] args) {
        GenericOgrenci<Ogrenci> jenerikOgrenci =
                new GenericOgrenci<Ogrenci>(new Ogrenci(72,"Fatih", "Demirci","fd@gmail.com"));




        System.out.println(jenerikOgrenci.toString()); //nesnenin ramdeki adresini yazar
        //Generic nesnenin alt parametrelerini yazmak için ise
        System.out.println(jenerikOgrenci.o.ad );
        System.out.println(jenerikOgrenci.o.soyad);
        System.out.println(jenerikOgrenci.o.numara);
        System.out.println(jenerikOgrenci.o.email);



    }
}
