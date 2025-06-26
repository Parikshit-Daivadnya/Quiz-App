
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    JLabel titleLabel, scoreLabel;
    String playerName;
    int score;
    JButton playAgainButton;
    
    
    public Score(String name, int score)
    {
        this.score=score;
        playerName=name;
        setLayout(null);
        setSize(900,700);
        setLocation(230,40);
        getContentPane().setBackground(Color.white); //getContentPane() is used to select the entire frame
        setTitle("Quiz Application - Score Page");
        setVisible(true);
    
         
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2= i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,340,300,250);
        add(image);
        
        titleLabel=new JLabel("Thankyou"+playerName+" for playing this Quiz");
        titleLabel.setBounds(230,50,800,50);
        titleLabel.setFont(new Font("Vivaldi",Font.BOLD,40));
        add(titleLabel);
        
        scoreLabel=new JLabel("Your score is: "+score);
        scoreLabel.setBounds(400,220,800,50);
        scoreLabel.setFont(new Font("Vivaldi",Font.BOLD,40));
        add(scoreLabel);
        
        playAgainButton = new JButton("Play Again");
        playAgainButton.setBounds(450,300,150,30);
        playAgainButton.setBackground(Color.black);
        playAgainButton.setForeground(Color.white);
        playAgainButton.addActionListener(this);
        add(playAgainButton);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args)
    {
        new Score("",0);
    }
}
