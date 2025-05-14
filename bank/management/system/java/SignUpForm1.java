package bank.management.system.java;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.Random;



public class SignUpForm1 extends JFrame {
    JLabel formNo, personDetails, name, fatherName, dob, gender, email, martial, pinCode, Address, city, State;
    JTextField nameTextField, fatherNameTextField, emailTextField, pinCodeTextField, addressTextField, cityTextField, StateTextField;
    JRadioButton male, female, married, unMarried, other;
    ButtonGroup genderGroup, maritalGroup;
    JDateChooser dateChooser;
    JLabel nameErrorLabel, fatherNameErrorLabel, emailErrorLabel, pinCodeErrorLabel, addressErrorLabel, cityErrorLabel, stateErrorLabel;
    
    SignUpForm1(String formno) {
        
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        setSize(800, 750);
        setLocationRelativeTo(null); 
        
        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane);

        Random ran = new Random();
        long random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

        formNo = new JLabel("APPLICATION FORM NO. " + random);
        formNo.setFont(new Font("Times New Roman", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        personDetails = new JLabel("PAGE 1: Personal Details ");
        personDetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        name = new JLabel("Name: ");
        name.setFont(new Font("Times New Roman", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        nameErrorLabel = new JLabel();
        nameErrorLabel.setForeground(Color.RED);
        nameErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        nameErrorLabel.setBounds(300, 170, 400, 20);
        add(nameErrorLabel);

        fatherName = new JLabel("Father name: ");
        fatherName.setFont(new Font("Times New Roman", Font.BOLD, 22));
        fatherName.setBounds(100, 190, 200, 30);
        add(fatherName);

        fatherNameTextField = new JTextField();
        fatherNameTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        fatherNameTextField.setBounds(300, 190, 400, 30);
        add(fatherNameTextField);

        fatherNameErrorLabel = new JLabel();
        fatherNameErrorLabel.setForeground(Color.RED);
        fatherNameErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        fatherNameErrorLabel.setBounds(300, 220, 400, 20);
        add(fatherNameErrorLabel);

        dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Times New Roman", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        gender = new JLabel("Gender: ");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 70, 30);
        female.setBackground(Color.WHITE);
        add(female);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        email = new JLabel("Email Address: ");
        email.setFont(new Font("Times New Roman", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        emailErrorLabel = new JLabel();
        emailErrorLabel.setForeground(Color.RED);
        emailErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        emailErrorLabel.setBounds(300, 370, 400, 20);
        add(emailErrorLabel);

        martial = new JLabel("Martial Status: ");
        martial.setFont(new Font("Times New Roman", Font.BOLD, 22));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 70, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unMarried = new JRadioButton("Un-Married");
        unMarried.setBounds(450, 390, 93, 30);
        unMarried.setBackground(Color.WHITE);
        add(unMarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 59, 28);
        other.setBackground(Color.WHITE);
        add(other);

        maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unMarried);
        maritalGroup.add(other);

        pinCode = new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Times New Roman", Font.BOLD, 22));
        pinCode.setBounds(100, 439, 200, 30);
        add(pinCode);

        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 590, 400, 30);
        add(pinCodeTextField);

        pinCodeErrorLabel = new JLabel();
        pinCodeErrorLabel.setForeground(Color.RED);
        pinCodeErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        pinCodeErrorLabel.setBounds(300, 620, 400, 20);
        add(pinCodeErrorLabel);

        Address = new JLabel("Address: ");
        Address.setFont(new Font("Times New Roman", Font.BOLD, 22));
        Address.setBounds(100, 490, 200, 30);
        add(Address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        addressErrorLabel = new JLabel();
        addressErrorLabel.setForeground(Color.RED);
        addressErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        addressErrorLabel.setBounds(300, 470, 400, 20);
        add(addressErrorLabel);

        city = new JLabel("City: ");
        city.setFont(new Font("Times New Roman", Font.BOLD, 22));
        city.setBounds(100, 540, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        cityErrorLabel = new JLabel();
        cityErrorLabel.setForeground(Color.RED);
        cityErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        cityErrorLabel.setBounds(300, 520, 400, 20);
        add(cityErrorLabel);

        State = new JLabel("State: ");
        State.setFont(new Font("Times New Roman", Font.BOLD, 22));
        State.setBounds(100, 590, 200, 30);
        add(State);

        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        StateTextField.setBounds(300, 540, 400, 30);
        add(StateTextField);

        stateErrorLabel = new JLabel();
        stateErrorLabel.setForeground(Color.RED);
        stateErrorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        stateErrorLabel.setBounds(300, 570, 400, 20);
        add(stateErrorLabel);

        JButton next = new JButton("Next");
        next.setBackground(Color.GRAY);
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        add(next);
    }
    
 public static void main(String[] args) {
        new SignUpForm1("").setVisible(true);
    }
}
