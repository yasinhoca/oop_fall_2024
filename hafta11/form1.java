package hafta11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class form1 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextArea textArea1;
    private JPanel panel;
    private JButton HESAPLAButton;
    int adet,taban,tavan;
    ArrayList<Integer> l = new ArrayList<>();
    Random r;
    /*Gönül Calab'ın tahtı, Calap gönüle baktı
            İki cihan bedbahtı, kim gönül yıkar ise
                Sen sana ne sanırsan ayruga da onu san
                    Dört kitabın manası budur eğer var ise
                                                       ░Yunus Emre
     */

    form1(){
        add(panel);
        setSize(600,500);
        setTitle("Liste Ödevi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        HESAPLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adet = Integer.parseInt(textField1.getText());
                taban = Integer.parseInt(textField2.getText());
                tavan = Integer.parseInt(textField3.getText());
                textArea1.setText("");
                l.clear();
                r = new Random();
                for(int i=0;i<adet;i++) l.add(r.nextInt(tavan-taban)+taban);
                textArea1.setText(l.toString());
                Collections.sort(l);
                textArea1.append("\n▓Liste Sıralandı\n");
                textArea1.append(l.toString());
                textArea1.append("\n▓En küçük sayı =" + l.get(0));
                textArea1.append("\n▓En büyük sayı =" + l.get(adet-1));
                Optional<Integer> o = l.stream().reduce((p1, p2)->p1+p2);
                textArea1.append("\n▓Liste toplamı =" + o.get());
                textArea1.append("\n▓Ortalaması =" + (float)o.get()/adet);

                textArea1.append("\n\n▓Çift sayılar\n");
                List<Integer> c = l.stream().filter(p->p%2==0).collect(Collectors.toList());
                textArea1.append(c.toString());
                Optional<Integer> oc = c.stream().reduce((p1, p2)->p1+p2);
                textArea1.append("\n▓Çift sayı adeti =" + c.size());
                textArea1.append("\n▓Çift toplamı =" + oc.get());
                textArea1.append("\n▓Çift sayıların ortalaması =" + (float)oc.get()/c.size());

                textArea1.append("\n\n▓Tek sayılar\n");
                List<Integer> t = l.stream().filter(p->p%2==1).collect(Collectors.toList());
                textArea1.append(t.toString());
                Optional<Integer> ot= t.stream().reduce((p1, p2)->p1+p2);
                textArea1.append("\n▓Tek sayı adeti =" + t.size());
                textArea1.append("\n▓Tek toplamı =" + ot.get());
                textArea1.append("\n▓Tek sayıların ortalaması =" + (float)ot.get()/c.size());





            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }


}
