import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.*;

class JTextFile2 extends JFrame implements ActionListener {
    // JTextField
    static JTextField t;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // label to display text
    static JLabel l;

    // default constructor
    JTextFile2() {
    }

    // main class
    public static void main(String[] args) {
        // create a new frame to store text field and button
        f = new JFrame("JText to Files");

        // create a label to display text
        l = new JLabel("nothing entered");

        // create a new button
        b = new JButton("submit");

        // create a object of the text class
        JTextFile2 te = new JTextFile2();

        // addActionListener to button
        b.addActionListener(te);

        // create a object of JTextField with 16 columns
        t = new JTextField(16);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(t);
        p.add(b);
        p.add(l);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // if the button is pressed
    public void actionPerformed(ActionEvent e) {
        String fn;
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            // set the text of the label to the text of the field
            fn = t.getText();
            l.setText(t.getText());
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(fn + ".txt"));
                bw.write(t.getText());
                bw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // set the text of field to blank
            t.setText(" ");

        }
    }
}
