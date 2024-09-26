package hafta01;

import java.util.Scanner;

public class kullanicidan_veri_alma {

    public static void main(String[] args) {
        String isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz = ");

        //isim = scan.next();    next methodu boşluğa kadar string alır
        isim= scan.nextLine(); //nextLine ise tüm satırı alır
        System.out.println("OOP'a hoşgeldin " + isim);

        int x,y,murtaza;
        System.out.println("x sayısını giriniz:");
        x=scan.nextInt();
        System.out.println("y sayısını giriniz:");
        y=scan.nextInt();
        murtaza = x + y;
        System.out.println(x + " + " + y+ " = " + murtaza);



    }


}
