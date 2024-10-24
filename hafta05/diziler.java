package hafta05;

import java.util.Random;

public class diziler {
    public static void main(String[] args) {
        String[] isimler = new String[5];
        isimler[0]="Ali";
        isimler[1]="Ayşe";
        isimler[2]="Mehmet";
        isimler[3]="Zeynep";
        isimler[4]="Adem";
        // [ali,ayşe,mehmet,zeynep,adem]
        System.out.println(isimler[3]);

        //tüm isimler for döngüsü ile yazdırılıyor
        for(int i=0;i< isimler.length;i++) System.out.println(isimler[i]);

        //isimler[5] = "yasin"; //taşma hatası - overflow alırız

        int[] sayilar = {2,4,5,8,0,1,2,5}; //dizi elemanlarını direk atadık

        System.out.println(sayilar[4]);
        //System.out.println(sayilar[8]); taşma hatası
        //System.out.println(sayilar[sayilar.length]); taşma hatası
        System.out.println(sayilar[4-4]);
        System.out.println(sayilar[sayilar[5]]);
        //System.out.println(sayilar[sayilar[0]-sayilar[7]]); 2-5 = -3 taşma hatası


        //0 ile 100 arasında  rastgele 100 sayı üretip toplamını bulalım?
        Random r = new Random();
        int[] dizi = new int[100];
        int toplam = 0;

        for(int i=0;i<100;i++){
            dizi[i] = r.nextInt(100);
            System.out.print(dizi[i]+" - ");
            toplam+=dizi[i];
        }

        System.out.println();
        System.out.println("Dizi elemanları toplamı =" + toplam);



    }
}
