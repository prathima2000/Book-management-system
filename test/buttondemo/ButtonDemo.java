package ButtonDemo;
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo  implements ActionListener   
{
   Frame f=new Frame ();
    public ButtonDemo() 
    {   
        f.setVisible(true); 
    f.setSize(200,300); 
    f.setLayout(new FlowLayout());
    Button b1=new Button("Red");
    Button b2=new Button("Green");
    Button b3=new Button("Yellow");
    Button b4=new Button("Blue"); 
 
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
 f.add(b1);
  f.add(b2);
  f.add(b3);
 f.add(b4);
    } 
    public void actionPerformed(ActionEvent ae)
    {   
        String str=ae.getActionCommand(); 
        if(ae.getActionCommand().equals("Red"))  
            f.setBackground(Color.RED);   
        if(ae.getActionCommand().equals("Green"))  
            f.setBackground(Color.GREEN);   
        if(ae.getActionCommand().equals("Yellow")) 
            f.setBackground(Color.YELLOW); 
        if(ae.getActionCommand().equals("Blue")) 
            f.setBackground(Color.BLUE);
    } 
    public static void main(String args[]) 
    {   
        ButtonDemo bdemo=new ButtonDemo();
    } }  
 
 