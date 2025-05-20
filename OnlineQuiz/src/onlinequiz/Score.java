
package onlinequiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    Score(String name, int score) {
        
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.png"));
        Image scaledImage = i1.getImage().getScaledInstance(500, 200, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(scaledImage);
        JLabel image = new JLabel(i2);
        image.setBounds(120,150, 500, 200);
        add(image);
        
        
        JLabel heading = new JLabel("Thank you  " + name + " for playing Quiz Flora");
        heading.setBounds(150, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        setVisible(true);
        
        JLabel finalscore = new JLabel("Your score is " + score);
        finalscore.setBounds(280, 100, 200, 30);
        finalscore.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(finalscore);
        setVisible(true);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(290, 400, 160, 40);
        submit.setFont(new Font("Tahoma", Font.BOLD, 22));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
       
        add(submit);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login(); 
    }
    
    public static void main(String[] args)
    {
        new Score("User", 0);
    }
}
