import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionTester
{
   public static void main(String[] args)
   {
	  MarsIcon Circle =new MarsIcon(100);
	  
	  
	   
      JFrame frame = new JFrame();

      final int FIELD_WIDTH = 20;
     // final JTextField textField = new JTextField(FIELD_WIDTH);
     // textField.setText("Click a button!");

      JButton red = new JButton("Repaint Red");

//      helloButton.addActionListener(event ->
//         textField.setText("Hello, World!"));

      JButton blue = new JButton("Repaint Blue");
      
      JButton green = new JButton("Repaint green");

//      goodbyeButton.addActionListener(event ->
//         textField.setText("Goodbye, World!"));

      frame.setLayout(new FlowLayout());
      frame.add(red);
      frame.add(blue);
      frame.add(green);
      final JLabel label= new JLabel(Circle);
      frame.add(label);
      
      red.addActionListener(event->{Circle.setColor("red");});
      red.addActionListener(event->{label.repaint();});
      blue.addActionListener(event->{Circle.setColor("blue");});
      blue.addActionListener(event->{label.repaint();});
      green.addActionListener(event->{Circle.setColor("green");});
      green.addActionListener(event->{label.repaint();});
      
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      
//      JOptionPane.showMessageDialog(
//	             null, 
//	             "",
//	             "Message",
//	             JOptionPane.INFORMATION_MESSAGE,
//	             new MarsIcon(50));
//	       System.exit(0);
   }
}
