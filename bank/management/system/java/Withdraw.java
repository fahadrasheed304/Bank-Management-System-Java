import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener{

    ImageIcon i1, i3;
    Image i2;
    JLabel image, text;
    JButton back, withdraw;
    JTextField amount;
    String pinNumber;
    Withdraw(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);

        i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text = new JLabel("Enter the amount you want to Withdraw.");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        amount= new JTextField();
        amount.setFont(new Font("New Times Roman", Font.BOLD,18));
        amount.setBounds(170, 330, 200, 20);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == withdraw){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            }else {
                try {
                    Conn conn = new Conn();
                    String query = "insert into bank (pin_number, transaction_type, transaction_date, amount) VALUES (?, ?, ?, ?)";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" + number + "Withdraw Successfully");
                    setVisible(false);
                    new Transactions( pinNumber).setVisible(true);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Withdraw("");
    }
}
