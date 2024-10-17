package hafta04;

public class HastaBilgileri {
    private String tc_no;
    private String hasta_id;
    public String ad;
    public String soyad;

    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }

    public String getHasta_id() {
        return hasta_id;
    }

    public void setHasta_id(String hasta_id) {
        this.hasta_id = hasta_id;
    }



    public void yaz(){
        System.out.println(this.tc_no+"-"+this.hasta_id+"-"+this.ad+"-"+this.soyad);
    }



}
