import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formNo;
    
    //Constructor
    SignupThree(String formNo){
        this.formNo = formNo;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 30, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 100, 200, 30); //left, top, right, bottom
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 150, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 150, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 190, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 190, 250, 20);
        add(r4);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 250, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184"); //dummy card no
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 250, 300, 30);
        add(number);
        
        JLabel cDetails = new JLabel("Your 16 Digits Card Number"); //dummy card no
        cDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        cDetails.setBounds(100, 280, 300, 20);
        add(cDetails);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 320, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX"); //dummy card no
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 320, 300, 30);
        add(pnumber);
        
        JLabel pDetails = new JLabel("Your 4 Digits Password"); //dummy card no
        pDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pDetails.setBounds(100, 350, 300, 20);
        add(pDetails);
        
        JLabel serReq = new JLabel("Services Required: ");
        serReq.setFont(new Font("Raleway", Font.BOLD, 22));
        serReq.setBounds(100, 400, 400, 30);
        add(serReq);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        //c1.setBounds(100, 450, 200, 30);
        c1.setBounds(100, 440, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        //c2.setBounds(350, 450, 200, 30);
        c2.setBounds(350, 440, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        //c3.setBounds(100, 500, 200, 30);
        c3.setBounds(100, 470, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        //c4.setBounds(350, 500, 200, 30);
        c4.setBounds(350, 470, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        //c5.setBounds(100, 550, 200, 30);
        c5.setBounds(100, 500, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        //c6.setBounds(350, 550, 200, 30);
        c6.setBounds(350, 500, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 530, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBounds(230, 580, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 580, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Reccuring Deposit Account";
            }
            Random random = new Random();
            //Generate card no.
            String cardNo = "" + Math.abs((random.nextLong() % 90000000L + 5040936000000000L)); //Starting digits will be 5040936000000000
            //Generate Pin No.
            String pinNo = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            //Find the values of checkbox
            String facility = "";
            if(c1.isSelected()){
                facility += " ATM Card";
            }else if(c2.isSelected()){
                facility += " Internet Banking";
            }else if(c3.isSelected()){
                facility += " Internet Banking";
            }else if(c4.isSelected()){
                facility += " Mobile Banking";
            }else if(c5.isSelected()){
                facility += " Email & SMS Alerts";
            }else if(c6.isSelected()){
                facility += " Cheque Book";
            }
            //Give these values to database
            try{
                if(accountType.equals("")){
                    //Show Dialog 
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formNo+"', '"+accountType+"', '"+cardNo+"', '"+pinNo+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardNo+"', '"+pinNo+"')";
                    conn.stmt.executeUpdate(query1);
                    conn.stmt.executeUpdate(query2);
                    
                    //Give cardNo or pinNo to user
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNo + "\n Pin Number: " + pinNo);
                    
                    setVisible(false);
                    new Deposite(pinNo).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new SignupThree("");
    }
}
