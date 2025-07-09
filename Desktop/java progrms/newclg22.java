import javax.swing.*;
import java.awt.*;

public class newclg22 extends JFrame {
    newclg22(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100,600,5000);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JLabel l1 = new JLabel("username");
        l1.setBounds(100,50,200,30);

        Font f=new Font("Arial", Font.ITALIC,30);
        l1.setFont(f);
        l1.setBackground(Color.RED);
        l1.setForeground(Color.RED);
        add(l1);




    }
           public static void main(String[] args) {
            newclg22 n = new newclg22();
           }
}
