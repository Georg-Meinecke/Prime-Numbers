package Features;

import javax.swing.*;


public class TestingGUI {


    static String input = JOptionPane.showInputDialog("type your number");
    static int number = Integer.parseInt(input);
    static PrimeFinder pf = new PrimeFinder();

    static String outputMSG1 = (number + " is a prime number");
    static String outputMSG2 = (number + " is not a prime number");

    public static void displayGUI() {


        if (pf.checkIfPrime(number)) {
            JOptionPane.showMessageDialog(null, outputMSG1);
        } else {
            JOptionPane.showMessageDialog(null, outputMSG2);
        }
    }

    public static void main(String[] args) {

        displayGUI();
    }
}

