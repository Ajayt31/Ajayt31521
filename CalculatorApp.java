import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton, backspaceButton;
    private double num1, num2, result;
    private char operator;
    private boolean newInput = true;

    public CalculatorApp() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        panel.add(inputField);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        numberButtons = new JButton[16];

        for (int i = 0; i < 16; i++) {
            numberButtons[i] = new JButton(buttonLabels[i]);
            panel.add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    handleButtonClick(e);
                }
            });
        }

        clearButton = new JButton("C");
        backspaceButton = new JButton("⌫");

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        backspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backspace();
            }
        });

        panel.add(clearButton);
        panel.add(backspaceButton);

        add(panel);

        setVisible(true);
    }

    private void handleButtonClick(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();

        if (newInput) {
            inputField.setText("");
            newInput = false;
        }

        if (buttonText.matches("[0-9\\.]")) {
            inputField.setText(inputField.getText() + buttonText);
        } else if (buttonText.matches("[+\\-*/]")) {
            if (!inputField.getText().isEmpty()) {
                num1 = Double.parseDouble(inputField.getText());
                operator = buttonText.charAt(0);
                newInput = true;
            }
        } else if (buttonText.equals("=")) {
            if (!inputField.getText().isEmpty()) {
                num2 = Double.parseDouble(inputField.getText());
                calculate();
                newInput = true;
            }
        }
    }

    private void calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    inputField.setText("Error");
                    return;
                }
                break;
        }
        inputField.setText(Double.toString(result));
    }

    private void clear() {
        inputField.setText("");
        num1 = num2 = result = 0;
        newInput = true;
    }

    private void backspace() {
        String currentText = inputField.getText();
        if (!currentText.isEmpty()) {
            inputField.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
