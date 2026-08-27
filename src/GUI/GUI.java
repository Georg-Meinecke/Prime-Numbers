package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Features.PrimeFinder;


public class GUI extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private JPanel middlePanel;
    private JButton btnCheckIfPrime;
    private JLabel outputLabel;
    private JTextField inputField;

    public GUI () {
        setTitle("Primes");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int bgGrey = 150;
        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(bgGrey, bgGrey, bgGrey));
        mainPanel.setLayout(new BorderLayout());
        inputField = new JTextField();
        mainPanel.add(inputField, BorderLayout.NORTH);

        middlePanel = new JPanel();
        middlePanel.setLayout(new FlowLayout());
        middlePanel.setBackground(new Color(51, 104, 23));

        btnCheckIfPrime = new JButton("Check if is a prime number");
        btnCheckIfPrime.addActionListener(this);
        middlePanel.add(btnCheckIfPrime);

        mainPanel.add(middlePanel, BorderLayout.CENTER);
        outputLabel = new JLabel("Test", SwingConstants.CENTER);
        outputLabel.setVerticalAlignment(SwingConstants.CENTER);
        mainPanel.add(outputLabel, BorderLayout.SOUTH);
        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCheckIfPrime) {
            String inputStr = inputField.getText();
            int num = Integer.parseInt(inputStr);
           String outputMSG = PrimeFinder.checkIfPrime(num) ? num + " is a prime number" : num + " is not a prime number";
           outputLabel.setText(outputMSG);
        }
    }
}
