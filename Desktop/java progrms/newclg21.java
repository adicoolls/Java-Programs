import javax.swing.*;
import java.awt.*;

public class newclg21 extends JFrame {
    newclg21(){
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100,100,600,500);
        setTitle("introduction to JFrame");

        Container c = getContentPane();
        c.setBackground(Color.pink);

        setResizable(false);

    }
    public static void main(String[] args) {
        newclg21 n=new newclg21();
    }
    
}
