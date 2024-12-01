import java.awt.event.*;
import javax.swing.*;

public class Swing_LoginPage {

    public static void Log() {
        JFrame frame = new JFrame("Login Page");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 100, 100, 30);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 30);
        
        JTextField userField = new JTextField();
        userField.setBounds(150, 100, 200, 30);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 150, 200, 30);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 100, 30);
        
        loginButton.addActionListener(new ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userField);
        frame.add(passwordField);
        frame.add(loginButton);
        
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Swing_LoginPage.Log();
    }
}
