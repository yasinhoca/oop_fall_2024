package hafta05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class sayisal_loto_oynatan_algoritma {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();

        for(int i=1;i<=49;i++) s.add(i);

        System.out.println(s);

        Collections.shuffle(s);
        System.out.println(s);

        for(int i=0;i<6;i++) System.out.print(s.get(i)+ " _ ");

        System.out.println();

        Random r = new Random(); //Fatih'in yöntemi ama aynı sayı üretebilir dolayısı ile kullanılamaz
        for(int i=0;i<6;i++) System.out.print((r.nextInt(49)+1)+" _ ");
    }
}
