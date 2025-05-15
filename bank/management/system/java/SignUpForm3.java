
package bank.management.system.java;
import javax.swing.*;
import java.awt.*;



public class SignUpForm3 extends JFrame{
    JLabel i1, type, card, number, pin, pnumber, cardDetails, pinDetails, services, headingTitle;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton cancel, submit;
    long formNo;
    
    SignUpForm3(long formNo) {
        this.formNo = formNo;

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        setLayout(null);
        setSize(800, 750); 
        setLocationRelativeTo(null);
        
        headingTitle = new JLabel("APPLICATION FORM NO. " + formNo);
        headingTitle.setFont(new Font("Times New Roman", Font.BOLD, 38));
        headingTitle.setBounds(140, 10, 600, 40);
        add(headingTitle);

        cardDetails = new JLabel("Page 3: Account Details");
        cardDetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
        cardDetails.setBounds(290, 70, 400, 30);
        add(cardDetails);

        type = new JLabel("Account Type: ");
        type.setFont(new Font("Times New Roman", Font.BOLD, 22));
        type.setBounds(100, 120, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r1.setBounds(300, 120, 250, 30);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r2.setBounds(300, 160, 250, 30);
        r2.setBackground(Color.WHITE);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r3.setBounds(300, 200, 250, 30);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        r4.setBounds(300, 240, 300, 30);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        card = new JLabel("Card Number: ");
        card.setFont(new Font("Times New Roman", Font.BOLD, 22));
        card.setBounds(100, 290, 200, 30);
        add(card);

        number = new JLabel("XXXX-XXXX-XXXX-XXXX");
        number.setFont(new Font("Times New Roman", Font.BOLD, 18));
        number.setBounds(300, 290, 250, 30);
        add(number);

        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pin.setBounds(100, 340, 200, 30);
        add(pin);

        pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Times New Roman", Font.BOLD, 18));
        pnumber.setBounds(300, 340, 250, 30);
        add(pnumber);

        services = new JLabel("Services Required: ");
        services.setFont(new Font("Times New Roman", Font.BOLD, 22));
        services.setBounds(100, 390, 250, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c1.setBounds(300, 390, 150, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c2.setBounds(300, 430, 150, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c3.setBounds(300, 470, 150, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c4.setBounds(300, 510, 150, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c5.setBounds(300, 550, 150, 30);
        add(c5);

        c6 = new JCheckBox("E-Statements");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c6.setBounds(300, 590, 150, 30);
        add(c6);

        c7 = new JCheckBox("None");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c7.setBounds(300, 630, 150, 30);
        add(c7);

        cancel = new JButton("Cancel");
        cancel.setBounds(300, 670, 100, 30);
        cancel.setBackground(Color.GRAY);
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(cancel);

        submit = new JButton("Submit");
        submit.setBounds(420, 670, 100, 30);
        submit.setBackground(Color.GRAY);
        submit.setFont(new Font("Times New Roman", Font.BOLD, 14));
        add(submit);

        getContentPane().setBackground(new Color(240, 240, 240));

        setVisible(true);
    }
public static void main(String[] args) {
        new SignUpForm3(38749).setVisible(true);
    }
}    

