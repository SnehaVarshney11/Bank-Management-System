import javax.swing.*;
import java.awt.*; //for image
import java.awt.event.*; // for ActionListener(interface)so that we can perform action on buttons 
import java.sql.*; // for ResultSet

// JFrame --> By swing
public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //Constructor
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        //To add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        //To put image on frame we use JLabel
        JLabel label = new JLabel(i3);
        //to change the location of image
        label.setBounds(70, 10, 100, 100); //left, top, hight/width of that pic 
        add(label);
        
        //we can write any content on frame using JLabel
        JLabel text = new JLabel("Welcom to ATM");
        //Change font
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNo.setBounds(120, 150, 150, 30);
        add(cardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        //Change the color of frame 
        getContentPane().setBackground(Color.WHITE);
        
        // to make frame use setSize() function
        setSize(800, 480);
        setVisible(true); //set visibility so that user can see frame
        setLocation(350, 200); //by default every frame opens with top corner to change the 
        //location we use this function 
    }
    
    // tells after click on button what actions are performed
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == login){
            Conn conn = new Conn();
            String cardNo = cardTextField.getText();
            String pinNo = pinTextField.getText();
            String query = "select * from login where cardNo = '"+cardNo+"' and pinNo = '"+pinNo+"'";
            try{
                ResultSet res = conn.stmt.executeQuery(query);
                if(res.next()){
                    setVisible(false);
                    new Transactions(pinNo).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signup){
            setVisible(true);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
