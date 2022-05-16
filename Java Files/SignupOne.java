import java.awt.*;
import java.awt.event.*; //for actionListener
import javax.swing.*;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton button;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChoser;
    //Constructor
    SignupOne(){
        setLayout(null);
        //Generrate random number
        Random rand = new Random();
        random = Math.abs((rand.nextLong() % 9000L) + 1000L);
        
        JLabel formNo = new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        //Labels
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        //Add Text Field
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        //Add Text Field
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        dateChoser = new JDateChooser();
        dateChoser.setBounds(300, 240, 400, 30);
        dateChoser.setForeground(new Color(105, 105, 105 ));
        add(dateChoser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        //radio button
        //For Male
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        //For Female
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE); 
        add(female);
        //To select only one gender
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        //Add Text Field
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        //radio button
        //For Married
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        //For Unmarried
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE); 
        add(unmarried);
        //For Other
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE); 
        add(other);
        //To select only one marital
        ButtonGroup grp = new ButtonGroup();
        grp.add(married);
        grp.add(unmarried);
        grp.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        //Add Text Field
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        //Add Text Field
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        //Add Text Field
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("PIN CODE:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);
        //Add Text Field
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
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
        String formNo = "" + random; //form is in long value
        String name = nameTextField.getText(); //find the val of nameTextField
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChoser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        //Hit in database
        try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null, "Name is Required");
          }
          else{
            Conn conn = new Conn();
            String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
            conn.stmt.executeUpdate(query);
            //signUp 2 object 
            setVisible(false);
            new SignupTwo(formNo).setVisible(true);
          }
      }catch(Exception e){
          System.out.println(e);
      }
    }
    public static void main(String[] args){
        new SignupOne();
    }
}
