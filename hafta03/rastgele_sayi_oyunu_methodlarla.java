package hafta03;

import java.util.Random;
import java.util.Scanner;






public class rastgele_sayi_oyunu_methodlarla {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int rast= r.nextInt(100);
        int sayac=0;
        int tahmin;

        System.out.println("Sıfır ile 100 arasında bir sayı tahmin et!");
        while(true){
            tahmin = scan.nextInt();
            sayac++;
            if(tahmin<rast){
                System.out.println("Daha büyük tahmin et! "+ sayac +". deneme");
            } else if (tahmin>rast) {
                System.out.println("Daha küçük tahmin et! "+ sayac +". deneme");
            } else {
                System.out.println("Tebrikler bildiniz! " + sayac + ". deneme" );
                break;
            }
        }
    }
}
