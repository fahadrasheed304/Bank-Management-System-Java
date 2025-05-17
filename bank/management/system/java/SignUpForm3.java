vimport javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    JLabel i1, type, card, number, pin, pnumber, cardDetails, pinDetails, services;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton cancel, submit;
    String formNo;
    SignUpThree(String formNo){
        this.formNo = formNo;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");


        i1 = new JLabel("Page 3: Account Details");
        i1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        i1.setBounds(265,40,400,40);
        add(i1);

        type = new JLabel("Account Type:");
        type.setFont(new Font("Times New Roman", Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,190,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,200,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Times New Roman", Font.BOLD, 22));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,310,20);
        add(r4);

        card = new JLabel("Card Number:");
        card.setFont(new Font("Times New Roman", Font.BOLD, 22));
        card.setBounds(101,270,200,30);
        add(card);

        number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Times New Roman", Font.BOLD, 22));
        number.setBounds(354,270,270,30);
        add(number);

        cardDetails = new JLabel("Your 16 digit Card Number: ");
        cardDetails.setFont(new Font("Times New Roman", Font.BOLD, 10));
        cardDetails.setBounds(101,290,270,30);
        add(cardDetails);

        pin = new JLabel("PIN:");
        pin.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pin.setBounds(100,340,200,30);
        add(pin);

        pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pnumber.setBounds(354,340,270,30);
        add(pnumber);

        pinDetails = new JLabel("Your 4 Digit Password: ");
        pinDetails.setFont(new Font("Times New Roman", Font.BOLD, 10));
        pinDetails.setBounds(102,355,300,30);
        add(pinDetails);

        services = new JLabel("Services Required:");
        services.setFont(new Font("Times New Roman", Font.BOLD, 22));
        services.setBounds(100,410,200,30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c1.setBounds(100,500,160,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c2.setBounds(350,550,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c3.setBounds(98,450,200,30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c4.setBounds(350,500,220,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c5.setBounds(350,450,200,30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Times New Roman", Font.BOLD, 22));
        c6.setBounds(100,550,160,30);
        add(c6);

        c7 = new JCheckBox("I hearby declares that the above entered details are correct to the best of my Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Times New Roman", Font.BOLD, 12));
        c7.setBounds(100,670,800,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Times New Roman", Font.BOLD, 22));
        submit.setBounds(250,720,120,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 22));
        cancel.setBounds(420,720,120,30);
        cancel.addActionListener(this);
        add(cancel);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);

        getContentPane().setBackground(Color.WHITE);


        setSize(850, 820);
        setLocation(350,0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = "null";
            if (r1.isSelected()){
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();

            String cardNumber = "" + Math.abs(random.nextLong() % 90000000L) + 5040936000000000L;
            String pinNumber = "" + Math.abs(random.nextLong() % 9000L) + 1000L;

            String faculty = "";
            if(c1.isSelected()){
                faculty = faculty + "ATM Card";
            } else if (c2.isSelected()) {
                faculty = faculty + "Internet Banking";
            } else if (c3.isSelected()) {
                faculty = faculty + "Mobile Banking";
            } else if (c4.isSelected()) {
                faculty = faculty + "Email & SMS Alert";
            } else if (c5.isSelected()) {
                faculty = faculty + "Cheque Book";
            }else if (c6.isSelected()){
                faculty = faculty + "E-Statement";
            }

            try {
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is required");
                }else {
                    Conn conn = new Conn();
                    String query = "insert into signupthree values('"+formNo+"','"+accountType+"','"+cardNumber+"','"+pin+"','"+faculty+"')";
                    String query2 = "insert into login values('"+formNo+"','"+cardNumber+"','"+pinNumber+"')";
                    conn.s.executeUpdate(query);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n PIN: " + pinNumber);
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(false);
                }
            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login("").setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignUpThree("").setVisible(true);
    }
}
