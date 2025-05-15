package bank.management.system.java;
/**
 *
 * @author Fahad Rasheed
 */
import javax.swing.*;
import java.awt.*;

public class MiniStatement extends JFrame {

    JLabel mini, card, balance;

    MiniStatement(String pinNumber) {
        setTitle("Mini Statement");

        setLayout(null);
        mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        mini.setText("<html>01-Jan-2025&nbsp;&nbsp;&nbsp;&nbsp;Deposit&nbsp;&nbsp;&nbsp;&nbsp;1000<br><br>02-Jan-2025&nbsp;&nbsp;&nbsp;&nbsp;Withdraw&nbsp;&nbsp;&nbsp;&nbsp;500<html>");
        add(mini);

        JLabel bank = new JLabel("Pakistani Bank");
        bank.setBounds(150, 20, 200, 20);
        add(bank);

        card = new JLabel("Card Number: XXXX-XXXX-XXXX-1234");
        card.setBounds(20, 80, 300, 20);
        add(card);

        balance = new JLabel("Your current account balance is Rs: XXXX");
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}

