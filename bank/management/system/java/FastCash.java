package bank.management.system.java;
import javax.swing.*;
import java.awt.*;
public class FastCash extends JFrame {
    private JButton deposit, withdraw, fastCash, miniStatement, BalanceInquiry, pinChange, Exit;
    private JLabel image, text;
    String pinNumber;
    FastCash(String pinNumber) {
        this.pinNumber = pinNumber;

        setTitle("ATM Transactions");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("100");
        deposit.setBounds(170, 415, 150, 30);
        image.add(deposit);

        withdraw = new JButton("500");
        withdraw.setBounds(355, 415, 150, 30);
        image.add(withdraw);

        fastCash = new JButton("1000");
        fastCash.setBounds(170, 450, 150, 30);
        image.add(fastCash);

        miniStatement = new JButton("2000");
        miniStatement.setBounds(355, 450, 150, 30);
        image.add(miniStatement);

        pinChange = new JButton("5000");
        pinChange.setBounds(170, 485, 150, 30);
        image.add(pinChange);

        BalanceInquiry = new JButton("10000");
        BalanceInquiry.setBounds(355, 485, 150, 30);
        image.add(BalanceInquiry);

        Exit = new JButton("Back");
        Exit.setBounds(355, 520, 150, 30);
        image.add(Exit);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}