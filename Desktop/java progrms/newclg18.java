import java.util.List;
import java.awt.*;
import java.awt.event.*;

public class newclg18  extends Frame {
    newclg18(){
        Label l = new Label("employee id");
        l.setBounds(50, 100, 90, 30);
        //l.setText("ajp ");

        add(l);
        TextField t = new TextField();
        t.setBounds(160, 100, 90, 100);
        t.setText("hello");
        add(t);

        Checkbox c1 = new Checkbox("ajp", null, true);
        Checkbox c2 = new Checkbox("jsp", null, false);
        Checkbox c3 = new Checkbox("cns", null, false);
        c1.setBounds(50, 160, 50, 50);
        c2.setBounds(150, 160, 50, 50);
        c3.setBounds(250, 160, 50, 50);

        add(c1);
        add(c2);
        add(c3);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c4 = new Checkbox("male", cbg, false);
        Checkbox c5 = new Checkbox("female", cbg, true);
        c4.setBounds(50, 250, 50, 50);
        c5.setBounds(150, 250, 50, 50);
        add(c4);
        add(c5);

        List l1 = new List(1, true);
        l1.add("cs");
        l1.add("it"); 
        l1.add("chem");
        l1.setBounds(50,350,50,50);
        add(l1);

        Choice c = new Choice();
        c.add("ajp"); c.add("jsp"); c.add("cns");
        add(c);

        TextArea ta = new TextArea();
        ta.setBounds(50,550,100,100);
        add(ta);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu file = new Menu("file");
        MenuItem (11,12);
        file.add(new MenuItem("new"));
        file.add(new MenuItem("open"));
        mbar.add(file);


        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setTitle("UI elements program");

    }
    public static void main(String args[]){
        newclg18 u = new newclg18();
    }
    }

