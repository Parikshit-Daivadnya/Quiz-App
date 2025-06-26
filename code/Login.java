//necesarry to mention the package name if your file is inside a folder in the source folder
//the JVM can directly execute the files present in the source package but if there is a folder within the source folder which 
//has your file, then mention the name of the sub folder



//to do: name automatically cleared after rules are viewed

package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
    
    JButton exitButton,rulesButton,startButton;
    JTextField nameTextField;

    
    public Login()
    {
        setLayout(null);
        setSize(1200,500);
        setLocation(60,120);
        getContentPane().setBackground(Color.white); //getContentPane() is used to select the entire frame
        setTitle("Quiz Application - Login Page");
        setVisible(true);
    
         
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        Image i2= i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,700,500);
        add(image);
        
        JLabel titleLabel=new JLabel("Let's Play!");
        titleLabel.setBounds(830,50,200,50);
        titleLabel.setFont(new Font("Vivaldi",Font.BOLD,40));
        add(titleLabel);
        
        JLabel nameLabel=new JLabel("Enter your name");
        nameLabel.setBounds(848,120,200,50);
        nameLabel.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(nameLabel);
        
        nameTextField= new JTextField();
        nameTextField.setBounds(750,160,350,30);
        nameTextField.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(nameTextField);
        
        
        rulesButton = new JButton("Rules");
        rulesButton.setBounds(1000,250,100,30);
        rulesButton.setBackground(Color.black);
        rulesButton.setForeground(Color.white);
        rulesButton.addActionListener(this);
        add(rulesButton);
        
        startButton = new JButton("Start");
        startButton.setBounds(875,300,100,30);
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.addActionListener(this);
        add(startButton);
        
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(750,250,100,30);
        exitButton.setBackground(Color.black);
        exitButton.setForeground(Color.white);
        exitButton.addActionListener(this);
        add(exitButton);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exitButton)
        {
           System.exit(0);
        }
        
        else if(ae.getSource()==rulesButton)
        {
            setVisible(false);
            new Rules().setVisible(true);
        }
        
        else if(ae.getSource()==startButton)
        {
           String name=nameTextField.getText();

            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Your Name First");
                return;
            } 
            else
            {
               new Quiz(0,name).setVisible(true);
               setVisible(false);
            }
        }
    }
    
    
    public static void main(String[] args)
    {
        new Login(); //anonymous obj
    }
}
