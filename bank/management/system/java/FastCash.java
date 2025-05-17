import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{

    private JButton deposit, withdraw, fastCash, miniStatement, BalanceInquiry, pinChange, Exit;
    private JLabel image, text;
    ImageIcon i1, i3;
    Image i2;
    String pinNumber;
    FastCash(String pinNumber){
        this.pinNumber = pinNumber;

        setTitle("ATM Transactions");
        setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 ,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(0, 0 , 900, 900);
        add(image);

        text = new JLabel("SELECT WITHDRWAL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);

        deposit = new JButton("100");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("500");
        withdraw.setBounds(355, 415, 150, 30);
        image.add(withdraw);

        fastCash = new JButton("1000");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        miniStatement = new JButton("2000");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);

        pinChange = new JButton("5000");
        pinChange.setBounds(170, 485, 150, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        BalanceInquiry = new JButton("10000");
        BalanceInquiry.setBounds(355, 485, 150, 30);
        BalanceInquiry.addActionListener(this);
        image.add(BalanceInquiry);

        Exit = new JButton("Back");
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
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        } else {
            String amount = ((JButton) ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin =" + pinNumber);
                int balance = 0;
                while (rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance = Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != Exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values" + pinNumber + date + amount + withdraw;
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs" + amount + "Debited Seccussfull");
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
        public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
