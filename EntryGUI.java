import javax.swing.*;

public class EntryGUI {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        JButton button1 = new JButton("Hello");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
