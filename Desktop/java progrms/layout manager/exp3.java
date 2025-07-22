import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class exp3 extends JFrame implements ActionListener{
    JButton b1, b2;
    JLabel l1;
    JTextField t1, t2;

   exp3(){
    setLayout(null);
    setTitle("aditya ");
    setSize(300,440);
    setVisible(true);
        l1 =  new JLabel("my name is aditya ");
        t1 = new JTextField();
        b1 = new JButton("click me");
        b2 = new JButton("mobile number");
        t2 = new JTextField("enter mobile number");

        l1.setBounds(50, 50, 300, 30);
        t1.setBounds(50, 100, 200, 30);

        b1.setBounds(50, 200, 200, 30);
        t2.setBounds(50, 300, 200, 30);
        b2.setBounds(50, 400, 200, 30);

        add(l1); add(b1);
        add(t1);
        add(t2);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            String s1 = t1.getText();
            if(s1.isEmpty()){
                l1.setText("please enter some text");
            }else{
                l1.setText("you enterd" + s1);
            }
            if(e.getSource() == b2){
                t2.setText("your mobile numbe is ");
            }

        }
    }

    public static void main(String[] args) {
         exp3 gdg = new exp3();
    }
}