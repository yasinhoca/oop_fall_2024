package hafta09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JButton CEVAPLAButton;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel arif;
    int sayac = 0;
    int dogru=0;
    int yanlis = 0;
    String cevap="";
    ButtonGroup bg;

    form1(){
        add(panel);
        //setSize(700,500);
        setBounds(100,150,700,500);
        setTitle("Test Uygulaması");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);
        bg.add(radioButton4);

        Sorular so = new Sorular();
        soruYukle(so, sayac);

        CEVAPLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cevap="";
                if(radioButton1.isSelected()) cevap=radioButton1.getText();
                else if(radioButton2.isSelected()) cevap=radioButton2.getText();
                else if(radioButton3.isSelected()) cevap=radioButton3.getText();
                else if(radioButton4.isSelected()) cevap=radioButton4.getText();
                if(cevabiDenetle(so,sayac,cevap)){
                    dogru++;
                    lbl1.setText(Integer.toString(dogru)+" doğru");
                } else {
                    yanlis++;
                    lbl2.setText(Integer.toString(yanlis)+" yanlış");
                }
                if(sayac<4){
                    sayac++;
                    soruYukle(so,sayac);
                } else {
                    CEVAPLAButton.setEnabled(false);
                    if(yanlis>2)
                    {
                        arif.setText("BAŞARISIZ"); //arif burda nedir? Label'dır.
                        arif.setOpaque(true);
                        arif.setBackground(Color.red);
                        arif.setForeground(Color.yellow);
                    } else {
                        arif.setOpaque(true);
                        arif.setText("BAŞARILI");
                        arif.setBackground(Color.blue);
                        arif.setForeground(Color.yellow);
                    }
                }
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

    void soruYukle(Sorular so, int sayac) {
        textArea1.setText("");
        radioButton1.setText("");
        radioButton2.setText("");
        radioButton3.setText("");
        radioButton4.setText("");
        bg.clearSelection();
        textArea1.setText(so.sorular.get(sayac).metin);
        radioButton1.setText(so.sorular.get(sayac).a);
        radioButton2.setText(so.sorular.get(sayac).b);
        radioButton3.setText(so.sorular.get(sayac).c);
        radioButton4.setText(so.sorular.get(sayac).d);
    }

    Boolean cevabiDenetle(Sorular so, int sayac, String cevap){
        if(so.sorular.get(sayac).cevap.equals(cevap)) return true;else return false;
    }

}
