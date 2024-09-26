package hafta01;

import java.util.Scanner;








public class dongu {
    public static void main(String[] args) {
        int tambolen,baslangic,bitis;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sayının katlarını arıyorsun = ");
        tambolen = scan.nextInt();
        System.out.println("Hangi sayıdan başalasın = ");
        baslangic = scan.nextInt();
        System.out.println("Hangi sayıya kadar = ");
        bitis = scan.nextInt();
        int i;
        for(i=baslangic;i<bitis;i++){
            if(i%tambolen==0){
                System.out.print(i + " - ");
            }
        }

    }
}
