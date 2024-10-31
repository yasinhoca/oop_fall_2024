package hafta06;

import java.util.Random;

public class ascii_giris {
    public static void main(String[] args) {
        System.out.println((char)65);
        System.out.println((int)'A');

        Random r = new Random();
        int sayi = r.nextInt(26)+65;
        System.out.println((char)sayi);

        for(int i = 65;i<=90;i++) System.out.print((char)i);

        String s = "";
        for(int j=0;j<3;j++){
            sayi = r.nextInt(26)+65;
            s += (char) sayi;
        }
        System.out.println();
        System.out.println(s);

    }
}
