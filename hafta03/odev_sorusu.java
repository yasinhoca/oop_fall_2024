package hafta03;

import java.util.Scanner;

public class odev_sorusu {

    static int enKucukBul(int a, int b,int c){
        if(a<=b && a<=c){
            return a;
        }else if(b<=a && b<=c){
            return b;
        } else return c;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("A sayısı:");
        a = scan.nextInt();
        System.out.println("B sayısı:");
        b = scan.nextInt();
        System.out.println("C sayısı:");
        c = scan.nextInt();
        System.out.println("Girilen sayılardan en küçüğü = "+enKucukBul(a,b,c));
    }
}
