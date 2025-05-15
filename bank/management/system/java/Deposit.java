package bank.management.system.java;
/**
 *
 * @author Fahad Rasheed
 */
import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame{
    
    ImageIcon i1, i3;
    Image i2;
    JLabel image, text;
    JButton back, deposit;
    JTextField amount;
    String pinNumber, accountType;
    Deposit(String pinNumber, String accountType){
        this.pinNumber = pinNumber;
        this.accountType = accountType;
        setLayout(null);

        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text = new JLabel("Enter the amount you want to Deposit.");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        amount= new JTextField();
        amount.setFont(new Font("New Times Roman", Font.BOLD,18));
        amount.setBounds(170, 330, 200, 20);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Deposit("", "").setVisible(true);
    }
}
