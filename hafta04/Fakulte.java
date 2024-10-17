package hafta04;

public class Fakulte extends Universite{ //Universiteden miras alır, Universitenin Subclass'ı dır.
    private int fakulte_id=13;
    String fakulte_ad="Uygulamalı Bilimler";

    public int getFakulte_id() {
        return fakulte_id;
    }

    public void setFakulte_id(int fakulte_id) {
        this.fakulte_id = fakulte_id;
    }
}
