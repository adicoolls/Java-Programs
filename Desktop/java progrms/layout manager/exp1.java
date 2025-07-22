import javax.swing.*;
public class exp1 extends JFrame{
    exp1(){
       
        setLayout(null);
        setTitle("my name is aditya");
        setSize(300,300);
        setVisible(true);

        JButton b1 = new JButton("click me");
        b1.setBounds(40,40,100,30);
        
        add(b1);

        JLabel l1 = new JLabel("this is new label");
        l1.setBounds(40,80,200,30);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(40,120,200,30);
        add(t1);

    }
    public static void main(String[] args) {
        //new exp1();
        exp1 dfs = new exp1();
    }
}
