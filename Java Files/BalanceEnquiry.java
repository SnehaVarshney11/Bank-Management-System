import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinNo ;
    JButton back;
    
    BalanceEnquiry(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        Conn conn = new Conn();
        int balance = 0;
        try{
            //Check amount is present or not
            ResultSet rs = conn.stmt.executeQuery("Select * from bank where pin = '"+pinNo+"'");
            
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    //actual balance of user
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
         }catch(Exception e){
            System.out.println(e);
        }
        
        JLabel text = new JLabel("Your Current Account balance is Rs " + balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170, 300, 400, 30);
        image.add(text);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinNo).setVisible(true);
    }
    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}
