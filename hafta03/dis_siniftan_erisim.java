package hafta03;

public class dis_siniftan_erisim {
    public static void main(String[] args) {
        Hacim h = new Hacim(); //büyük küçük harf duyarlı h'si küçük olan hacim nesnesi oluşturulabilir
        System.out.println(h.hesaplaKup(15));
        System.out.println(h.hesaplaDikdortgenPrisma(3,3,5));
        System.out.println(h.hesaplaSilindir(5,15));
        System.out.println(h.hesaplaKure(5));


        System.out.println(Hacim.hesaplaPiramit(3,4,5)); //static olduğu için direkt Hacim üzerinden, nesne tanımlamadan çağırdım



    }
}
