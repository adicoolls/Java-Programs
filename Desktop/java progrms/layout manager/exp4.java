
import javax.swing.*;
import java.awt.*;

public class exp4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Null Layout Example");
        frame.setLayout(null);

        JButton button = new JButton("Click me!");
        button.setBounds(100, 100, 100, 50);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
// null layout example