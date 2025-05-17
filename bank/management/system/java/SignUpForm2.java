import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;

public class SignUp2 extends JFrame{
    JLabel additionalDetails, religion, Income, Education, qualification, panCode, ExistAccount, SC,CnicNumber, occupation, category;
    JTextField CnicTextField , panCodeTextField ;
    JRadioButton sYes, sNo, eYes, eNo;
    JComboBox Religion, Category, Occupation, income, Qualification, education;
    String formNO;
    private Random random = new Random();

    SignUp2(String formNo){

        this.formNO = formNo;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        setLayout(null);

        additionalDetails = new JLabel("PAGE 2: Additional Details " );
        additionalDetails.setFont(new Font("Times New Roman", Font.BOLD,302));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        religion = new JLabel("Religion: ");
        religion.setFont(new Font("Times New Roman", Font.BOLD,22));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String valReligion[] = {"Null", "Hindu", "Muslim", "Sikh", "Christian", "Other"};
        Religion = new JComboBox(valReligion);
        Religion.setBounds(300, 140, 400, 30);
        Religion.setBackground(Color.WHITE);
        add(Religion);

        category = new JLabel("Category: ");
        category.setFont(new Font("Times New Roman", Font.BOLD,22));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String valCategory[] = {"Null", "General", "OBC", "SC", "ST", "Other"};
        Category = new JComboBox(valCategory);
        Category.setBounds(300, 190, 400, 30);
        Category.setBackground(Color.WHITE);
        add(Category);

        Income = new JLabel("Income: ");
        Income.setFont(new Font("Times New Roman", Font.BOLD,22));
        Income.setBounds(100, 240, 200, 30);
        add(Income);

        String valIncome[] = {"Null","<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(302, 243, 398, 30);
        income.setBackground(Color.WHITE);
        add(income);

        Education = new JLabel("Educational: ");
        Education.setFont(new Font("Times New Roman", Font.BOLD,22));
        Education.setBounds(100, 290, 200, 30);
        add(Education);

        qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Times New Roman", Font.BOLD,22));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String valQualification[] = {"Null","Graduate","Under Graduate", "Post Graduate", "Doctrate", "Others"};
        Qualification = new JComboBox(valQualification);
        Qualification.setBounds(300, 310, 398, 30);
        Qualification.setBackground(Color.WHITE);
        add(Qualification);

        occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Times New Roman", Font.BOLD,22));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String valOccupation[] = {"Null", "Salaried","Self-Employed","Business", "Student", "Retired", "Others"};
        Occupation = new JComboBox(valOccupation);
        Occupation.setBounds(302, 390, 398, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);

        CnicNumber = new JLabel("CNIC-Number: ");
        CnicNumber.setFont(new Font("Times New Roman", Font.BOLD,22));
        CnicNumber.setBounds(100, 490, 200, 30);
        add(CnicNumber);

        CnicTextField = new JTextField();
        CnicTextField.setFont(new Font("Times New Roman", Font.BOLD,14));
        CnicTextField.setBounds(300, 440, 400, 30);
        add(CnicTextField);

        SC = new JLabel("Senior Citizen: ");
        SC.setFont(new Font("Times New Roman", Font.BOLD,22));
        SC.setBounds(100, 540, 200, 30);
        add(SC);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(300, 490, 60, 30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo = new JRadioButton("NO");
        sNo.setBounds(450, 490, 70, 30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup SeniorGroup = new ButtonGroup();
        SeniorGroup.add(sYes);
        SeniorGroup.add(sNo);


        ExistAccount = new JLabel("Existing Account: ");
        ExistAccount.setFont(new Font("Times New Roman", Font.BOLD,22));
        ExistAccount.setBounds(100, 590, 200, 30);
        add(ExistAccount);

        eYes = new JRadioButton("Yes");
        eYes.setBounds(300, 545, 60, 30);
        eYes.setBackground(Color.WHITE);
        add(eYes);

        eNo = new JRadioButton("No");
        eNo.setBounds(450, 545, 70, 30);
        eNo.setBackground(Color.WHITE);
        add(eNo);

        ButtonGroup ExistingGroup = new ButtonGroup();
        ExistingGroup.add(eYes);
        ExistingGroup.add(eNo);

        panCode = new JLabel("PAN Number: ");
        panCode.setFont(new Font("Times New Roman", Font.BOLD,22));
        panCode.setBounds(100, 439, 200, 30);
        add(panCode);

        panCodeTextField = new JTextField();
        panCodeTextField.setFont(new Font("Times New Roman", Font.BOLD,14));
        panCodeTextField.setBounds(300, 590, 400, 30);
        add(panCodeTextField);

        JButton next = new JButton();
        next.setBackground(Color.GRAY);
        next.setFont(new Font("Times New Roman", Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        add(next);

        getContentPane().setBackground(new Color(240, 240, 240));

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        String formNo = "" + random;
        String sReligion = (String) Religion.getSelectedItem();
        String sCategory = (String) Category.getSelectedItem();
        String sIncome = (String) income.getSelectedItem();
        String sEducation = (String) Qualification.getSelectedItem();
        String sOccupation = (String) Occupation.getSelectedItem();
        String SeniorCitizen = sYes.isSelected() ? "Yes" : "No";
        String ExistingAccount = eYes.isSelected() ? "Yes" : "No";
        String panCode = panCodeTextField.getText();
        String cnicNumber = CnicTextField.getText();



        try {
            Conn conn = new Conn();
                String query = "insert into signUpTwo values('"+formNo+"','"+sReligion+"','"+sCategory+"','"+sIncome+"','"+sEducation+"','"+Occupation+"','"+panCode+"','"+CnicNumber+"','"+SeniorCitizen+"','"+ExistingAccount+"',')";
                conn.s.executeUpdate(query);

                setVisible(false);
                new SignUpThree(formNo).setVisible(true);
            }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignUp2("").setVisible(true);

    }
}
