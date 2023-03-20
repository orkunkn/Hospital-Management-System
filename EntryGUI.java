import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryGUI {
    // Width and height of the window, login button
    public int width = 800;
    public int height = 600;
    private JButton loginButton = new JButton("Login");

    public EntryGUI() {
        // Create the frame
        JFrame frame = new JFrame("User Entry Page");
        // Set window size and location
        frame.setSize(width, height);
        frame.setLocation(new Point(550, 250));
        // Create username label
        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(width / 2 - 200, 200, width / 2, 30);
        // Create password label
        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(width / 2 - 200, 250, width / 2, 30);
        // Create username input
        final JTextField username = new JTextField();
        username.setBounds(width / 2, 200, 200, 30);
        // Create password field
        final JPasswordField password = new JPasswordField();
        password.setBounds(width / 2, 250, 200, 30);
        // Create login button
        loginButton.setBounds(width / 2 - 50, height / 2 + 25, 80, 30);
        // Login button function, directs the user according to username and password
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Test case for doctor, username = doctor, password = doc
                if (username.getText().equals("doctor") && String.valueOf(password.getPassword()).equals("doc")) {
                    frame.dispose();
                    new DoctorGUI();
                    // Test case for patient, username = patient, password = pat
                } else if (username.getText().equals("patient")
                        && String.valueOf(password.getPassword()).equals("pat")) {
                    frame.dispose();
                    new PatientGUI();
                }
            }
        });
        // Add elements to the frame
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(username);
        frame.add(password);
        frame.add(loginButton);
        // Window settings
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EntryGUI();
    }
}