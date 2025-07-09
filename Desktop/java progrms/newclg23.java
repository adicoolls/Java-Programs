import javax.swing.*;
import java.awt.*;

public class newclg23 extends JFrame {
    newclg23(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        Container c=getContentPane();
        Container b = getContentPane();
        c.setLayout(null);

        c.setBackground(Color.GREEN);
        b.setBackground(Color.DARK_GRAY);

        JTextField t1 = new JTextField("username");
        t1.setBounds(100,50,200,30);

        Font f = new Font("Arial", Font.BOLD, 20);

        t1.setFont(f);
        t1.setBackground(Color.RED);
        t1.setForeground(Color.BLACK);

        c.add(t1);
        b.add(t1);
        t1.setText("Enter your name");

        t1.setEditable(false);


    }
    public static void main(String[] args) {
        newclg23 n =new newclg23();
    }
}
