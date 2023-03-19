import javax.swing.*;
import java.awt.*;

public class PatientGUI {
    public static int width = 900;
    public static int height = 900;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Patient Page");
        frame.setLocation(new Point(550, 250));
        final JLabel label = new JLabel();
        label.setBounds(0, 0, width, height);
        frame.setSize(900, 900);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
