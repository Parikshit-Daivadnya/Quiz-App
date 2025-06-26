
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton backButton;
    
    public Rules()
    {
        setLayout(null);
        setSize(800,650);
        setLocation(300,50);
        getContentPane().setBackground(Color.white); //getContentPane() is used to select the entire frame
        setTitle("Rules for the Quiz");
        setVisible(true);
        
        JLabel titleLabel=new JLabel("Welcome to the Rules of the Quiz!");
        titleLabel.setBounds(45,30,600,50);
        titleLabel.setFont(new Font("Vivaldi",Font.BOLD,35));
        add(titleLabel);
        
        JLabel rulesLabel= new JLabel();
        rulesLabel.setBounds(45,30,600,600);
        rulesLabel.setFont(new Font("Tahoma",Font.BOLD,18));
        add(rulesLabel);
        
        rulesLabel.setText
        (
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        
        backButton = new JButton("Back");
        backButton.setBounds(653,553,100,40);
        backButton.setBackground(Color.black);
        backButton.setForeground(Color.white);
        backButton.addActionListener(this);
        add(backButton);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String[] args)
    {
        new Rules();
    }
    
}
