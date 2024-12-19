package hafta12;

public class generic_sınıf_ornek {
    public static void main(String[] args) {
        //Kendi tanımladığımız tek parametreli generic sınıfı test ediyoruz
        GenericSinif<Integer> jenerikInt = new GenericSinif<>(20);
        System.out.println(jenerikInt.getObject());
        GenericSinif<String> jenerikStr = new GenericSinif<>("Fatih Demirci");
        System.out.println(jenerikStr.getObject());

        //kendi yazdığımız çok parametreli generic sınıfı test edelim
        GenericCokParametreli<String,Integer> jenerikCokParametreli =
                new GenericCokParametreli<String,Integer>("Fatih",72);
        jenerikCokParametreli.print();

        GenericCokParametreli<Boolean,Character> jenerikCokParametreli2 =
                new GenericCokParametreli<Boolean,Character>(true,'A');
        jenerikCokParametreli2.print();
    }
}
