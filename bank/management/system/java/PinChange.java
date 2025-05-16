package bank.management.system.java;
import javax.swing.*;
import java.awt.*;

public class PinChange extends JFrame {
    JPasswordField pin, repin;
    JButton change, back;
    String pinNumber;

    PinChange(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel pintext = new JLabel("New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165, 320, 180, 25);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);

        JLabel repinText = new JLabel("Re-Enter New PIN:");
        repinText.setForeground(Color.WHITE);
        repinText.setFont(new Font("System", Font.BOLD, 16));
        repinText.setBounds(165, 360, 180, 25);
        image.add(repinText);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PinChange("");
    }
}

