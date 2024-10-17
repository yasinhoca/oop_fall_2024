package hafta04;

class Ogrenci{
    private int ogrenci_no = 90; //kendi sııfında değer atayabiliriz!
    public String ad;
    public String soyad;
    protected String email;
}

public class erisim_niteleyiciler {
    public static void main(String[] args) {
        Ogrenci o = new Ogrenci();
        o.ad="Mehmet";
        o.soyad="Sağlam";
        o.email="m@m.com";
        //o.ogrenci_no=5;  private değişkene erişim sadece kendi sınıfı içinde olabilir!
    }
}
