import javax.swing.*;
import java.awt.*; //for import Image
import java.awt.event.*;
import java.sql.*; //for resultSet
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    JButton rs100, rs500, rs1000, rs2000, rs5000, rs10000, back; 
    String pinNo;
    FastCash(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        //Add Images
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        //Scale the image
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        //Convert it into image icon
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Select Withdrawl amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        rs100 = new JButton("Rs 100");
        rs100.setBounds(170, 415, 150, 30);
        rs100.addActionListener(this);
        image.add(rs100);
        
        rs500 = new JButton("Rs 500");
        rs500.setBounds(355, 415, 150, 30);
        rs500.addActionListener(this);
        image.add(rs500);
        
        rs1000 = new JButton("Rs 1000");
        rs1000.setBounds(170, 450, 150, 30);
        rs1000.addActionListener(this);
        image.add(rs1000);
        
        rs2000 = new JButton("Rs 2000");
        rs2000.setBounds(355, 450, 150, 30);
        rs2000.addActionListener(this);
        image.add(rs2000);
        
        rs5000 = new JButton("Rs 5000");
        rs5000.setBounds(170, 485, 150, 30);
        rs5000.addActionListener(this);
        image.add(rs5000); 
        
        rs10000 = new JButton("Rs 10000");
        rs10000.setBounds(355, 485, 150, 30);
        rs10000.addActionListener(this);
        image.add(rs10000); 
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back); 
         
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true); //hide the upper gap of frame 
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }else{
            //Take the amount
            String amount = ((JButton) ae.getSource()).getText().substring(3); //because it is object type so type caste it
            //Text will be show as Rs 100 so we don't want Rs so substring use 
            Conn conn = new Conn();
            try{
                //Check amount is present or not
                ResultSet rs = conn.stmt.executeQuery("Select * from bank where pin = '"+pinNo+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        //actual balance of user
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "insert into bank values('"+pinNo+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                conn.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs" + amount + " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinNo).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }  
    
    public static void main(String[] args){
        new FastCash("");
    }
}
