import javax.swing.*;
import java.awt.*;

public class EntryGUI {
    public static int width = 800;
    public static int height = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Entry Page");
        frame.setLocation(new Point(550, 250));
        final JLabel label = new JLabel();
        label.setBounds(0, 0, width, height);
        final JPasswordField password = new JPasswordField();
        password.setBounds(width / 2, 250, 200, 30);
        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(width / 2 - 200, 200, width / 2, 30);
        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(width / 2 - 200, 250, width / 2, 30);
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(width / 2 - 50, height / 2 + 25, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(width / 2, 200, 200, 30);
        frame.add(password);
        frame.add(labelUsername);
        frame.add(label);
        frame.add(labelPassword);
        frame.add(loginButton);
        frame.add(text);
        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
