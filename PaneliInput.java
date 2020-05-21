package Rruga_e_shkurter;

import javax.swing.*;
import java.awt.*;

public class PaneliInput extends JFrame {

    JTextField field1;
    JTextField field2;
    JButton confirm;

    public PaneliInput()
    {
        this.setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        JLabel label1=new JLabel("Qyteti i nisjes:");
        JLabel label2=new JLabel("Destinacioni:");
        field1= new JTextField(20);
        field2= new JTextField("Dragash",20);
        confirm = new JButton("Confirm");
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(confirm);
        pack();
    }

    public String getLabel1() {
        return field1.getText();
    }
    public String getLabel2() {
        return field2.getText();
    }
}
