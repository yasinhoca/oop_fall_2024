package hafta06;

public class thread_giris {
    public static void main(String[] args) {



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) System.out.print("AAA");
            }
        });




        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int j=0;j<10000;j++) System.out.print("BBB");
            }
        });


        t1.start();
        t2.start();

    }
}
