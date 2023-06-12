

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame {
    private JTextField inputTextField;
    private JTextField resultTextField;
    private JButton computeButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        inputTextField = new JTextField(10);
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);
        computeButton = new JButton("Compute");
        computeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    computeFactorial();
                }
            });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Enter an integer: "));
        panel.add(inputTextField);
        panel.add(computeButton);
        panel.add(new JLabel("Factorial: "));
        panel.add(resultTextField);

        setContentPane(panel);
    }

    private void computeFactorial() {
        String input = inputTextField.getText();

        try {
            int number = Integer.parseInt(input);
            long factorial = calculateFactorial(number);
            resultTextField.setText(String.valueOf(factorial));
        } catch (NumberFormatException e) {
            resultTextField.setText("Invalid input");
        }
    }

    long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial*i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new FactorialCalculator().setVisible(true);
                }
            });
    }
}

