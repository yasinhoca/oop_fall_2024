package hafta04;

public class encapsulation_kapsulleme {
    public static void main(String[] args) {
        HastaBilgileri hb=new HastaBilgileri();
        hb.ad = "yasin";
        hb.soyad= "sağlam";
        hb.yaz();


        hb.setTc_no("44444444440");
        System.out.println(hb.getTc_no());
        hb.yaz();

        hb.setHasta_id("9801");
        System.out.println(hb.getHasta_id());
        hb.yaz();
    }
}
