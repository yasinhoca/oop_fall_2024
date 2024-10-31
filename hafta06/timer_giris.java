package hafta06;

import java.util.Timer;
import java.util.TimerTask;





public class timer_giris {
    static Timer t;
    static TimerTask gorev,gorev2;

    static int sayac=30;

    public static void main(String[] args) {
        t = new Timer();

        gorev = new TimerTask() {
            @Override
            public void run() {
                sayac-=5;
                System.out.println(sayac);
                if(sayac<=0) t.cancel();
            }
        };

        gorev2 = new TimerTask() {
            @Override
            public void run() {
                sayac+=3;
                System.out.println(sayac);
            }
        };

        t.schedule(gorev,0,500); //1000ms = 1sn     gecikme 0 yani hemen çalışacak
        t.schedule(gorev2,0,1000);

    }

}
