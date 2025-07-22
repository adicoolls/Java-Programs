import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    Label L1 = new Label("Num1");
    Label L2 = new Label("Num2");
    Label L3 = new Label("Result");

    TextField T1 = new TextField();
    TextField T2 = new TextField();
    TextField T3 = new TextField();

    Button B1 = new Button("Add"); // error: missing semicolon at the end of statement
    Button B2 = new Button("Sub");
    Button B3 = new Button("Mul");
    Button B4 = new Button("Div");

    Calculator() {
        L1.setBounds(50, 100, 100, 20);
        L2.setBounds(50, 140, 100, 20);
        L3.setBounds(50, 180, 100, 20);

        T1.setBounds(200, 100, 100, 20);
        T2.setBounds(200, 140, 100, 20);
        T3.setBounds(200, 180, 100, 20);

        B1.setBounds(50, 250, 50, 50);
        B2.setBounds(110, 250, 50, 50);
        B3.setBounds(170, 250, 50, 50);
        B4.setBounds(230, 250, 50, 50);

        add(L1);
        add(L2);
        add(L3);

        add(T1);
        add(T2);
        add(T3);

        add(B1);
        add(B2);
        add(B3);
        add(B4);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        int Num1 = Integer.parseInt(T1.getText());
        int Num2 = Integer.parseInt(T2.getText());

        if (e.getSource() == B1) {
            T3.setText(String.valueOf(Num1 + Num2));
        } else if (e.getSource() == B2) {
            T3.setText(String.valueOf(Num1 - Num2));
        } else if (e.getSource() == B3) {
            T3.setText(String.valueOf(Num1 * Num2));
        } else {
            T3.setText(String.valueOf(Num1 / Num2));
        }
    }

    public static void main(String[] args) {
        Calculator C1 = new Calculator();
    }
}