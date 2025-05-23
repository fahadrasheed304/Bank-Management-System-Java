import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(String formno){

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(105, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Times New Roman", Font.BOLD,40));
        text.setBounds(250,40,400,40);
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Times New Roman", Font.BOLD,38));
        cardNo.setBounds(80,150,250,30);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Times New Roman", Font.BOLD,38));
        pin.setBounds(120,220,250,40);
        add(pin);

        pinTextField = new JPasswordField ();
        pinTextField.setBounds(300,229,230,30);
        pinTextField.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.GRAY);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.GRAY);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.GRAY);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800 ,480);
        setVisible(true);
        setLocation(350,200);
    }


    public void actionPerformed(ActionEvent actionEvent){
        if (actionEvent.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (actionEvent.getSource() == signup) {
            if (cardTextField.getText().isEmpty() || pinTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter all required fields.");
                return;
            } else {
                setVisible(false);
                new SignUpOne("").setVisible(true);
            }
        } else if (actionEvent.getSource() == login) {
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());
            String query = "SELECT * FROM login WHERE cardNumber = ? AND pin = ?";
            try {
                PreparedStatement ps = conn.c.prepareStatement(query);
                ps.setString(1, cardNumber);
                ps.setString(2, pin);
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(true);
                    new Transactions("").setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin.");
                }
            }catch (Exception e){
                System.out.println(e);
            }

            if (cardNumber.isEmpty() || pin.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter all required fields.");
                return;
            }
        }
    }

    public static void main(String[] args){
        new Login("").setVisible(true);
    }
}
