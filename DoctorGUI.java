import javax.swing.*;
import java.awt.*;

public class DoctorGUI extends JFrame {
    // Width and height of the window
    public int width = 800;
    public int height = 600;

    public DoctorGUI() {
        // Create the frame
        JFrame frame = new JFrame("Doctor Page");
        // Window settings
        frame.setLocation(new Point(550, 250));
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}