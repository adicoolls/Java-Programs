import java.awt.*;
import java.util.spi.CurrencyNameProvider;
public class newclg24 extends Frame {
   
    
    newclg24(){
       Label l1 = new Label("enter your name");
        l1.setBounds(50, 50, 300, 100);
        add(l1);
        TextField t1= new TextField();
        t1.setBounds(100, 50, 30,10);
        add(t1);

        setVisible(true);
        setLayout(null);
        setTitle("aditya kulkarni");
        setSize(500,500); 
        setBackground(Color.BLACK);
        
    }
    public static void main(String[] args) {
        newclg24 sfsf = new newclg24();
    }
    
}
