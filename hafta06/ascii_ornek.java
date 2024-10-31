package hafta06;

import java.util.Random;
import java.util.Scanner;

public class ascii_ornek {

    static String stringOlustur(int uzunluk){
        String s="";
        Random r = new Random();
        for(int i=0;i<uzunluk;i++){
            int sayi = r.nextInt(26)+65;
            s +=(char) sayi;
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi büyük harflerle giriniz:");
        String isim = scan.next();
        String rast="";
        int sayac = 0;

        while(true){
            rast = stringOlustur(isim.length());
            sayac++;
            System.out.println(sayac + ". deneme = " +rast);
            if(isim.equals(rast)) break;
        }

    }
}
