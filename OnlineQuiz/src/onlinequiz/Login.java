
package onlinequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;
    Login()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.jpg"));
        Image scaledImage = i1.getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(scaledImage);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel ("JAVA QUIZ");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel ("Enter your name");
        name.setBounds(760, 150, 300, 20);
        name.setFont(new Font("Vinor Hand ITC", Font.BOLD, 12));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(728, 200, 200, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(728, 270, 100, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("BACK");
        back.setBounds(850, 270, 100, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000, 500);
        setLocation(300, 150);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == rules)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        } else if (ae.getSource() == back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }
}
