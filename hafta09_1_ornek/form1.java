package hafta09_1_ornek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class form1 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JButton TAHMİNETButton;
    private JLabel lblDeneme;
    private JLabel lblDurum;
    private JTextField textField2;
    private JButton YENİDENOYNAButton;
    int rast,tahmin;
    Random r;
    int sayac = 0;
    ArrayList<String> tahminler = new ArrayList<>();

    form1(){
        add(panel);
        setSize(500,500);
        setTitle("Sayı Tahmin Oyunu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        r = new Random();
        rast = r.nextInt(100);


        TAHMİNETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tahmin =  Integer.parseInt(textField1.getText());
                tahminler.add(textField1.getText());
                textField2.setText(tahminler.toString());
                sayac++;
                lblDeneme.setText(Integer.toString(sayac) + ". DENEME");
                if(rast<tahmin){
                    lblDurum.setText("AŞAĞI");
                    lblDurum.setForeground(Color.RED);
                } else if(rast>tahmin){
                    lblDurum.setText("YUKARI");
                    lblDurum.setForeground(Color.GREEN);
                } else {
                    lblDurum.setText("TEBRİKLER BİLDİNİZ");
                    lblDurum.setOpaque(true);
                    lblDurum.setForeground(Color.BLUE);
                    //Color c = new Color(255,255,0);
                    //lblDurum.setBackground(c);
                    lblDurum.setBackground(new Color(255,255,0));
                    TAHMİNETButton.setEnabled(false);
                    YENİDENOYNAButton.setEnabled(true);

                }
            }
        });
        YENİDENOYNAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rast = r.nextInt(100);
                sayac = 0;
                textField1.setText("50");
                textField2.setText("");
                lblDurum.setText("AŞAĞI - YUKARI");
                lblDeneme.setText("DENEME SAYISI");
                lblDurum.setOpaque(true);
                lblDurum.setForeground(Color.BLACK);
                lblDurum.setBackground(new Color(255, 255, 255, 0));
                tahminler.clear();
                TAHMİNETButton.setEnabled(true);
                YENİDENOYNAButton.setEnabled(false);
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
