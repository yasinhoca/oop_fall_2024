import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form1 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    private JButton button1;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"No","Ad","Soyad","Email"};
    Object[] satirlar = new Object[4];

    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Veritabani.baglan();
        ResultSet rs = Veritabani.listele("select * from ogrenci");

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try{
            while(rs.next()){
                satirlar[0]=rs.getInt("numara");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");
                satirlar[3]=rs.getString("email");
                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);
        }catch (SQLException e){
            System.out.println("veritabanı hatası");
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelim.setColumnCount(0);
                modelim.setRowCount(0);
                modelim.setColumnIdentifiers(kolonlar);

                String s=textField1.getText();
                ResultSet rs = Veritabani.listele(s);

                try{
                    while(rs.next()){
                        satirlar[0]=rs.getInt("numara");
                        satirlar[1]=rs.getString("ad");
                        satirlar[2]=rs.getString("soyad");
                        satirlar[3]=rs.getString("email");
                        modelim.addRow(satirlar);
                    }
                    table1.setModel(modelim);
                }catch (SQLException e2){
                    System.out.println("veritabanı hatası");
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
}
