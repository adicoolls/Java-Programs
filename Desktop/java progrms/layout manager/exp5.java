import javax.swing.*;
import java.awt.*;

public class exp5 {
    public exp5() {
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new exp5();
    }
}