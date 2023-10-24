import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelectorApp extends JFrame {
    private JTextArea textArea;
    private JButton bgColorButton, textColorButton;

    public ColorSelectorApp() {
        setTitle("Color Selector");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        bgColorButton = new JButton("Select Background Color");
        textColorButton = new JButton("Select Text Color");

        bgColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectBackgroundColor();
            }
        });

        textColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectTextColor();
            }
        });

        buttonPanel.add(bgColorButton);
        buttonPanel.add(textColorButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void selectBackgroundColor() {
        Color bgColor = JColorChooser.showDialog(this, "Choose Background Color", textArea.getBackground());
        if (bgColor != null) {
            textArea.setBackground(bgColor);
        }
    }

    private void selectTextColor() {
        Color textColor = JColorChooser.showDialog(this, "Choose Text Color", textArea.getForeground());
        if (textColor != null) {
            textArea.setForeground(textColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorSelectorApp();
            }
        });
    }
}
