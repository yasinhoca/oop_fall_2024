package hafta08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_giris {
    public static void main(String[] args) {
        String s = "dal sarkar kartal kalkar, kartal kalkar dal sarkar";

        Pattern p = Pattern.compile("[dkasrl]{3}[dtlark]{3}");  //aranan örüntü/iz
        //     "s" sadece s harfini bulur
        //     "\\s" ise space yan boşluk sayısını bulur
        Matcher m = p.matcher(s);  //aranacak metin ve örüntünün karşılaştırılması

        int sayac = 0;

        while(m.find()) sayac++;

        System.out.println(sayac);
    }
}
