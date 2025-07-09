//creates a normal form without using action listner in java 
import java.awt.*;
import javax.swing.*;  
 class newclg25 extends JFrame {
    newclg25(){
        //JFrame all methods

        setLayout(null);
        setSize(600,600);
        setTitle("swing elements");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Container c = getContentPane();

        c.setBackground(Color.cyan);

        Font f1 = new Font("Times New Roman", Font.BOLD, 13);

        //Label and TextField for name
        JLabel l1 = new JLabel("Enter your name");
        l1.setBounds(20,50, 110, 20);
        l1.setFont(f1);
        c.add(l1);

        JTextField tf1 = new JTextField("");
        tf1.setBounds(150, 50, 150, 20);
        c.add(tf1);

        //checkbox for subjects selection
        JCheckBox cb1 = new JCheckBox("ajp", true);
        JCheckBox cb2 = new JCheckBox("JSP", false);

        JCheckBox cb3 = new JCheckBox("CNS", false);
        cb1.setBounds(50, 120, 60, 20);
        cb2.setBounds(120, 120, 60, 20);
        cb3.setBounds(190, 120, 60, 20);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);

       //radio button for gender selection
       ButtonGroup gs = new ButtonGroup();
       JRadioButton male = new JRadioButton("male", true);
       JRadioButton female = new JRadioButton("female", false);
       male.setBounds(100, 180, 100, 20);
       female.setBounds(200, 180, 100, 20);
       gs.add(male);
       gs.add(female);
       c.add(male);
       c.add(female);

        //List for course selection
        String[]courses = {"cs", "it", "chem"};
        JList<String> courseList = new JList<>(courses);
        courseList.setBounds(150, 240, 100, 60);
        c.add(courseList);

        JComboBox<String>jcb = new JComboBox<>(new String[]{"AJP", "JSP", "CNS"});
        jcb.setBounds(150, 320, 100, 100);
        jcb.setSelectedIndex(2); //set selected method
        c.add(jcb);

        JTextArea t1 = new JTextArea();
        t1.setBounds(150, 320, 100, 20);
        t1.setLineWrap(true); // setLineWrap method
        c.add(t1);

        JButton b1 = new JButton("Submit");
        b1.setBounds(150, 470, 100, 30);
        b1.setFont(f1);
        b1.setForeground(Color.red);
        c.add(b1);


JMenuBar mbr = new JMenuBar();
setJMenuBar(mbr);
JMenu fileMenu = new JMenu("file");
fileMenu.add(new JMenuItem("new"));
fileMenu.add(new JMenuItem("open"));
fileMenu.add(new JMenuItem("save"));
fileMenu.add(new JMenuItem("exit"));
mbr.add(fileMenu);
setVisible(true);
        


    }
    public static void main(String[] args) {
        newclg25 sdf = new newclg25();
    }
 }