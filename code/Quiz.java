
package quizapplication;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Quiz extends JFrame implements ActionListener {
    
    String name;
    
    String qOptions[][]=new String[10][5];
    String ans[][]= new String[10][1];
    String userAns[][]= new String[10][1];
    JRadioButton optButton1,optButton2,optButton3,optButton4; 
    ButtonGroup optionGroup;
    JButton nextButton, submitButton, lifelineButton;
    JLabel qNoLabel, qLabel;
    
    public static int count=0;
    public static int timer=20;
    public static int ans_given=0;
    public static int score=0;
    
    public Quiz(int count, String name)
    {
        this.name=name;
        setLayout(null);

        setBounds(100,5,1100,740); //if no component is written before setBounds then it does the work of
        //both setLocation and setSize
        // first 2 places for location and then for size
        
        getContentPane().setBackground(Color.white); //getContentPane() is used to select the entire frame
        setTitle("Quiz Application");
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        Image i2= i1.getImage().getScaledInstance(1100, 370, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(00,00,1100,370);
        add(image);

        qNoLabel=new JLabel();
        qNoLabel.setBounds(100,420,80,20);
        qNoLabel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(qNoLabel);
        
        qLabel=new JLabel();
        qLabel.setBounds(150,420,700,20);
        qLabel.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(qLabel);
        
        qOptions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        qOptions[0][1] = "JVM";
        qOptions[0][2] = "JDB";
        qOptions[0][3] = "JDK";
        qOptions[0][4] = "JRE";

        qOptions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        qOptions[1][1] = "int";
        qOptions[1][2] = "Object";
        qOptions[1][3] = "long";
        qOptions[1][4] = "void";

        qOptions[2][0] = "Which package contains the Random class?";
        qOptions[2][1] = "java.util package";
        qOptions[2][2] = "java.lang package";
        qOptions[2][3] = "java.awt package";
        qOptions[2][4] = "java.io package";

        qOptions[3][0] = "An interface with no fields or methods is known as?";
        qOptions[3][1] = "Runnable Interface";
        qOptions[3][2] = "Abstract Interface";
        qOptions[3][3] = "Marker Interface";
        qOptions[3][4] = "CharSequence Interface";

        qOptions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        qOptions[4][1] = "Stack";
        qOptions[4][2] = "String memory";
        qOptions[4][3] = "Random storage space";
        qOptions[4][4] = "Heap memory";

        qOptions[5][0] = "Which of the following is a marker interface?";
        qOptions[5][1] = "Runnable interface";
        qOptions[5][2] = "Remote interface";
        qOptions[5][3] = "Readable interface";
        qOptions[5][4] = "Result interface";

        qOptions[6][0] = "Which keyword is used for accessing the features of a package?";
        qOptions[6][1] = "import";
        qOptions[6][2] = "package";
        qOptions[6][3] = "extends";
        qOptions[6][4] = "export";

        qOptions[7][0] = "In java, jar stands for?";
        qOptions[7][1] = "Java Archive Runner";
        qOptions[7][2] = "Java Archive";
        qOptions[7][3] = "Java Application Resource";
        qOptions[7][4] = "Java Application Runner";

        qOptions[8][0] = "Which of the following is a mutable class in java?";
        qOptions[8][1] = "java.lang.StringBuilder";
        qOptions[8][2] = "java.lang.Short";
        qOptions[8][3] = "java.lang.Byte";
        qOptions[8][4] = "java.lang.String";

        qOptions[9][0] = "Which of the following option leads to the portability and security of Java?";
        qOptions[9][1] = "Bytecode is executed by JVM";
        qOptions[9][2] = "The applet makes the Java code secure and portable";
        qOptions[9][3] = "Use of exception handling";
        qOptions[9][4] = "Dynamic binding between objects";
        
        
        ans[0][0] = "JDB";
        ans[1][0] = "int";
        ans[2][0] = "java.util package";
        ans[3][0] = "Marker Interface";
        ans[4][0] = "Heap memory";
        ans[5][0] = "Remote interface";
        ans[6][0] = "import";
        ans[7][0] = "Java Archive";
        ans[8][0] = "java.lang.StringBuilder";
        ans[9][0] = "Bytecode is executed by JVM";
        
    
        optButton1= new JRadioButton();
        optButton1.setFont(new Font("Dialog",Font.PLAIN,18));
        optButton1.setBackground(Color.white);
        optButton1.setBounds(100,470,600,20);
        add(optButton1);
        
        optButton2= new JRadioButton();
        optButton2.setFont(new Font("Dialog",Font.PLAIN,18));
        optButton2.setBackground(Color.white);
        optButton2.setBounds(100,510,600,20);
        add(optButton2);
        
        optButton3= new JRadioButton();
        optButton3.setFont(new Font("Dialog",Font.PLAIN,18));
        optButton3.setBackground(Color.white);
        optButton3.setBounds(100,545,600,20);
        add(optButton3);
        
        optButton4= new JRadioButton();
        optButton4.setFont(new Font("Dialog",Font.PLAIN,18));
        optButton4.setBackground(Color.white);
        optButton4.setBounds(100,580,600,20);
        add(optButton4);
        
        optionGroup= new ButtonGroup();
        optionGroup.add(optButton1);
        optionGroup.add(optButton2);
        optionGroup.add(optButton3);
        optionGroup.add(optButton4);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(850,520,100,30);
        nextButton.setBackground(Color.black);
        nextButton.setForeground(Color.white);
        nextButton.addActionListener(this);
        add(nextButton);
        
        lifelineButton = new JButton("50-50");
        lifelineButton.setBounds(850,570,100,30);
        lifelineButton.setBackground(Color.black);
        lifelineButton.setForeground(Color.white);
        lifelineButton.addActionListener(this);
        add(lifelineButton);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(850,620,100,30);
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.addActionListener(this);
        submitButton.setEnabled(false);
        add(submitButton);
        
         
        start(count);
        setVisible(true);
    }
    
    //for timer(count down) we need to repaint the frame every sec
    //paint method is called automatically when an object of a class is created
    public void paint(Graphics g)
    {
        super.paint(g);
        
        String time="Time Left: "+timer+" seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,15));
         
        if(timer>0)
        {
            g.drawString(time, 830, 467); //to set location of the string on the frame
            
        }
        else
        {
            g.drawString("Time's Up!!!!", 860, 467);
            repaint();
        }
        
        timer--;
        try
        {
            Thread.sleep(1000);// delaying the execution of next line
            repaint();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        if(ans_given==1) //next button with ans given
        {
            ans_given=0;
            //timer=20;
            optButton1.setEnabled(true);
            optButton2.setEnabled(true);
            optButton3.setEnabled(true);
            optButton4.setEnabled(true);
            
        }
        else if(timer<0) 
        {                           
            timer=20;
            optButton1.setEnabled(true);
            optButton2.setEnabled(true);
            optButton3.setEnabled(true);
            optButton4.setEnabled(true);
            
            if(count==8)//if the current qno is 10th and no option was selected for 9th
            {
                nextButton.setEnabled(false);
                submitButton.setEnabled(true);
            }
            else if(count==9) //automatic quiz submit if submit not selected in time for the 10th q
            {
                if(optionGroup.getSelection()==null)
                {
                    userAns[count][0]="";  
                }
                else
                {
                    userAns[count][0]=optionGroup.getSelection().getActionCommand();
                }
                
                for(int i=0;i<userAns.length;i++)
                {
                    if(userAns[i][0].equals(ans[i][0]))
                    {
                       score+=10;
                    }
                }
             
                setVisible(false);
                new Score(name, score).setVisible(true);
            }
            else
            {
                if(optionGroup.getSelection()==null)
                {
                    userAns[count][0]="";
                }
                else
                {
                    ans_given=1;
                    userAns[count][0]=optionGroup.getSelection().getActionCommand();
                }
            }
            count++;
            start(count);
        }
        
                

    }
    
    public void start(int count)
    {
        qNoLabel.setText("Q."+(count+1)+") ");
        qLabel.setText(qOptions[count][0]);
        
        optButton1.setText(qOptions[count][1]);
        optButton1.setActionCommand(qOptions[count][1]);
        
        optButton2.setText(qOptions[count][2]);
        optButton2.setActionCommand(qOptions[count][2]);
         
        optButton3.setText(qOptions[count][3]);
        optButton3.setActionCommand(qOptions[count][3]);
         
        optButton4.setText(qOptions[count][4]);
        optButton4.setActionCommand(qOptions[count][4]);
        
        optionGroup.clearSelection();
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==nextButton)
        {
            timer=20;
            repaint();
            
            optButton1.setEnabled(true);
            optButton2.setEnabled(true);
            optButton3.setEnabled(true);
            optButton4.setEnabled(true);
         
            ans_given=1;
            if(optionGroup.getSelection()==null)
            {
                userAns[count][0]="";
            }
            else
            {
                userAns[count][0]=optionGroup.getSelection().getActionCommand();  
            }
           
            if(count==8)
            {
              nextButton.setEnabled(false);
              submitButton.setEnabled(true);
            }
        

            count++;
            start(count);
        }
        
        else if(ae.getSource()==lifelineButton)
        {
            if(count==2 || count==4 || count==6 || count==8 || count==9 )
            {
                optButton2.setEnabled(false);
                optButton3.setEnabled(false);
            }
            else{
                optButton1.setEnabled(false);
                optButton4.setEnabled(false);
            }
            
            lifelineButton.setEnabled(false);
        }
        
        else if(ae.getSource() == submitButton){
            ans_given=1;
            if(optionGroup.getSelection()==null)
            {
                userAns[count][0]="";
            }
            else
            {
                userAns[count][0]=optionGroup.getSelection().getActionCommand();
            }
             
             
            for(int i=0;i<userAns.length;i++)
            {
                if(userAns[i][0].equals(ans[i][0]))
                {
                    score+=10;
                }
            }
             
            setVisible(false);
            new Score(name, score).setVisible(true);
        }
    }
    
    
    public static void main(String[] args)
    {
        new Quiz(0,"");
    }
}
