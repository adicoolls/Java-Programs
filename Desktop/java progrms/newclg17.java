//importing java awt class
import java.awt.*;

//class newclg17 directly creates instance of frame class
  public class newclg17{

    //initializing using constructor
    newclg17(){
        //creating a frame 
        Frame f = new Frame();

        //creating a lable
        Label l = new Label("employee id");

        //creating a button 
        Button b = new Button("submit");

        //creating a textfield
        TextField t = new TextField();

        //setting a position of above components in the frame
        l.setBounds(20,80,80, 30);
        t.setBounds(20,100,80, 30);
        b.setBounds(100, 100, 80, 30);

         //adding components into frame
         f.add(b);
         f.add(l);
         f.add(t);

         //frame size 300 width and 300 height
         f.setSize(400, 300);
         
         //setting the title of frame
         f.setTitle("employee info");

         //no layout
         f.setLayout(null);

         //setting visibility of frame
         f.setVisible(true);


    }

    /**
     * Main method to initialize the AWT application.
     * It creates an instance of the newclg17 class which
     * sets up and displays the GUI frame with components.
     *
     * @param args command line arguments (not used)
     */
   
        // Create an instance of newclg17
    //main method 
    public static void main(String args []){
        newclg17 g = new newclg17();
    }
}