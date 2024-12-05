package hafta10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JTextField textField3;
    private JPanel panel;
    private JCheckBox checkBox1;
    String alfabe = "abcçdefgğhıijklmnoöprsştuüvyz";
    int k = 3;
    String metin = "";
    String sifrelenmis = "";
    String h = "";
    int indis = 0;

    form1() {
        add(panel);
        setSize(600, 400);
        setTitle("Sezar Şifreleme");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                metin = textField1.getText();
                k = Integer.parseInt(textField2.getText());

                for (int i = 0; i < metin.length(); i++) {
                    h = Character.toString(metin.charAt(i));

                    if (h.equals(" ") && checkBox1.isSelected()) sifrelenmis += " ";
                    else if (h.equals(" ") && checkBox1.isSelected() == false) sifrelenmis += "";
                    else {
                        for (int j = 0; j < alfabe.length(); j++) {
                            if (h.charAt(0) == alfabe.charAt(j)) indis = j;
                        }
                        sifrelenmis += alfabe.charAt((indis + k) % 29);
                    }
                }

                textField3.setText(sifrelenmis);
                sifrelenmis = "";

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
