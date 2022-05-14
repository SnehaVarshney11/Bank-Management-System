import java.awt.*;
import java.awt.event.*; //for actionListener
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener{
    long random;
    JTextField pan, aadhar;
    JComboBox religion, category, income, education, occupation;
    JButton button;
    JRadioButton syes, sno, eyes, eno;
    String formNo;

    //Constructor
    SignupTwo(String formNo){
        this.formNo = formNo;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        //Labels
        JLabel r = new JLabel("Religion:");
        r.setFont(new Font("Raleway", Font.BOLD, 20));
        r.setBounds(100, 140, 100, 30);
        add(r);
        //Add Drop Down by ComboBox
        String str[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(str); //Pass array of string inside JComboBox
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel cat = new JLabel("Category:");
        cat.setFont(new Font("Raleway", Font.BOLD, 20));
        cat.setBounds(100, 190, 200, 30);
        add(cat);
        //ADD Drop Down
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel salary = new JLabel("Income:");
        salary.setFont(new Font("Raleway", Font.BOLD, 20));
        salary.setBounds(100, 240, 200, 30);
        add(salary);
        //ADD Drop Down
        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel edu = new JLabel("Educational:");
        edu.setFont(new Font("Raleway", Font.BOLD, 20));
        edu.setBounds(100, 290, 200, 30);
        add(edu);
        
        JLabel quali = new JLabel("Qualification:");
        quali.setFont(new Font("Raleway", Font.BOLD, 20));
        quali.setBounds(100, 315, 200, 30);
        add(quali);
        //ADD Drop Down
        String eduValues[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Other"};
        education = new JComboBox(eduValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway", Font.BOLD, 20));
        occu.setBounds(100, 390, 200, 30);
        add(occu);
        //ADD Drop Down
        String occupationalValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationalValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel panNo = new JLabel("PAN Number:");
        panNo.setFont(new Font("Raleway", Font.BOLD, 20));
        panNo.setBounds(100, 440, 200, 30);
        add(panNo);
        //Add Text Field
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel aadharNo = new JLabel("Aadhar Number:");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100, 490, 200, 30);
        add(aadharNo);
        //Add Text Field
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        //Add Radio Button
        //For YES
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        //For NO
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE); 
        add(sno);
        //Group the buttons
        ButtonGroup btn = new ButtonGroup();
        btn.add(syes);
        btn.add(sno);
        
        JLabel exAcc = new JLabel("Exisiting Account:");
        exAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        exAcc.setBounds(100, 590, 200, 30);
        add(exAcc);
        //Add Radio Button
        //For YES
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        //For NO
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE); 
        add(eno);
        //Group the buttons
        ButtonGroup btn2 = new ButtonGroup();
        btn2.add(eyes);
        btn2.add(eno);
        
        button = new JButton("Next");
        button.setBounds(700, 630, 80, 30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.addActionListener(this);
        add(button);
        
        getContentPane().setBackground(Color.WHITE);
        
        //make frame
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
      
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //form is in long value
        //getSelectedItem returns object so type case in String
        String reli = (String) religion.getSelectedItem(); //find the val of dropdown
        String cat = (String) category.getSelectedItem();
        String sal = (String) income.getSelectedItem();
        String educ = (String) education.getSelectedItem();
        String occu = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "Yes";
        }else if(eno.isSelected()){
            exisitingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        //Hit in database
        try{
            Conn conn = new Conn();
            String query = "insert into signupTwo values('"+formno+"', '"+reli+"', '"+cat+"', '"+sal+"', '"+educ+"', '"+occu+"', '"+seniorcitizen+"', '"+exisitingaccount+"', '"+span+"', '"+saadhar+"')";
            conn.stmt.executeUpdate(query);
            
            //SignUp 3 Object
            setVisible(false);
            new SignupThree(formNo).setVisible(true);
      }catch(Exception e){
          System.out.println(e);
      }
    }
    public static void main(String[] args){
        new SignupTwo("");
    }
}