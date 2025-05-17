import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{

    private JButton deposit, withdraw, fastCash, miniStatement, BalanceInquiry, pinChange, Exit;
    private JLabel image, text;
    ImageIcon i1, i3;
    Image i2;
    String pinNumber;
    Transactions(String pinNumber){
        this.pinNumber = pinNumber;

        setTitle("ATM Transactions");
        setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 ,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(0, 0 , 900, 900);
        add(image);

        text = new JLabel("Please select your Transactions");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 415, 150, 30);
        image.add(withdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("Pin Change");
        pinChange.setBounds(170, 485, 150, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        BalanceInquiry = new JButton("Balance Inquiry");
        BalanceInquiry.setBounds(355, 485, 150, 30);
        BalanceInquiry.addActionListener(this);
        image.add(BalanceInquiry);

        Exit = new JButton("Exit");
        Exit.setBounds(355, 520, 150, 30);
        Exit.addActionListener(this);
        image.add(Exit);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Exit) {
            System.exit(0);
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if (ae.getSource() == withdraw) {
            setVisible(false);
            new Withdraw(pinNumber).setVisible(true);
        } else if (ae.getSource() == fastCash) {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Transactions("").setVisible(true);
    }
}
