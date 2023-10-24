import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreenApp extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton clearButton;

    private int loginAttempts = 3;
    private final String correctUsername = "user";
    private final String correctPassword = "password";

    public LoginScreenApp() {
        setTitle("Login Screen");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validateLogin();
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        panel.add(loginButton);
        panel.add(clearButton);

        add(panel);

        setVisible(true);
    }

    private void validateLogin() {
        String enteredUsername = usernameField.getText();
        String enteredPassword = new String(passwordField.getPassword());

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose(); // Close the login screen on successful login
        } else {
            loginAttempts--;
            if (loginAttempts > 0) {
                JOptionPane.showMessageDialog(this, "Login failed! " + loginAttempts + " attempts remaining.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Maximum login attempts reached. Exiting...",
                        "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1); // Close the application after reaching maximum login attempts
            }
        }
    }

    private void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        usernameField.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginScreenApp();
            }
        });
    }
}
