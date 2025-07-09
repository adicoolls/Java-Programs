import javax.swing.*;
import java.awt.*;

public class onlypractice extends JFrame{
    onlypractice(){
      setLayout(new BorderLayout());

      JButton northButton =new JButton("north");
      JButton southButton =new JButton("south");
      JButton eastButton =new JButton("east");
      JButton westButton =new JButton("west");
      JButton centerButton =new JButton("center");

      add(northButton, BorderLayout.NORTH);
      add(southButton, BorderLayout.SOUTH);
      add(eastButton, BorderLayout.EAST);
      add(westButton, BorderLayout.WEST);
      add(centerButton, BorderLayout.CENTER);

      setSize(500,500);
      setVisible(true);


    }
    public static void main(String[] args) {
        onlypractice sd = new onlypractice();
    }
}