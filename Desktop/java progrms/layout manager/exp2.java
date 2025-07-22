import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp2 extends JFrame {
    

    private JTextField textField;
    private JButton button;

    public exp2() {
        super("Action Listener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create text field
        textField = new JTextField(20);
        add(textField);

        // Create button
        button = new JButton("Click Me");
        add(button);

        // Add action listener to button
        button.addActionListener(new MyActionListener());

        // Set size and make visible
        setSize(300, 100);
        setVisible(true);
    }

    // Inner class for action listener
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Change text in text field when button is clicked
            textField.setText("Button was clicked!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new exp2();
        });
    }
}