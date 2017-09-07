import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet  code="buttondemo1" width="300" height="300">
</aplet>*/

public class buttondemo1 extends Applet implements ActionListener
{
 int a=20,b=10;
 Button b1,b2;
 
 public void init()
  {
    b1=new Button("add");
    b2=new Button("sub"); 
    
  add(b1);
  add(b2);
  
   b1.addActionListener(this);
   b2.addActionListener(this);
  }
 public void actionperfirmed(ActionEvent ae)
  {
    String str=ae.getActionCommand();
    if(str.equals("add"))
     {
       System.out.println("20+10=30");
     }
     if(str.equals("sub"))
     {
        System.out.println("20-10=10");
      }
  }
} 
    

 
