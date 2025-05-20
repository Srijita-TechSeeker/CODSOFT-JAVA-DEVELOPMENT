
package onlinequiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules  extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name)
    {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel ("Welcome " + name + " to Quiz Flora");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        
        JLabel rules = new JLabel ();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rules.setText(
                "<html>"+
                  "Quiz Rules:\n" +
                 "1. The quiz contains 10 multiple-choice questions" + "<br><br>" + 
                 "2. You have 15 seconds to answer each question." + "<br><br>" + 
                 "3. No negative marking for wrong answers." + "<br><br>" + 
                 "4. Once an answer is submitted, it cannot be changed." + "<br><br>" + 
                 "5. Do not refresh or close the window during the quiz." + "<br><br>" + 
                 "6. Your final score will be shown after completion." + "<br><br>" + 
               "<html>"
                
        );
        add(rules);
        
        
        
        back = new JButton("BACK");
        back.setBounds(250, 500, 100, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 25);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(700, 650);
        setLocation(350, 70);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == start)
        {
            setVisible(false);
            new Quiz(name);
            
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args)
    {
        new Rules("user");
    }
}
