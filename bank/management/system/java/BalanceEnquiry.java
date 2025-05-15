package bank.management.system.java;
/**
 *
 * @author Fahad Rasheed
 */

import javax.swing.*;
import java.awt.*;

public class BalanceEnquiry extends JFrame {
    
    JButton back;
    JLabel text;
    String pinNumber;

    BalanceEnquiry(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        image.add(back);

        text = new JLabel("Your Current Account Balance is Rs XXXX");
        text.setForeground(Color.WHITE);
        text.setBounds(170, 300, 400, 30);
        image.add(text);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}

