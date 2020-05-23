import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FeesPanel extends JPanel {
              JPanel p1,p2,p3,p4,p5,p6;
              FeesPanel(){
                 JLabel sublogo = new JLabel(new ImageIcon("icons/sub_logo.png"));
                 sublogo.setBounds(220,5,150,80);                
                 add(sublogo);  
                 JLabel heading = new JLabel("Fees & PayRoll ");
                 heading.setBounds(200,50,350,100);  
                 heading.setFont(new Font("Rosewood Std",Font.BOLD,30));              
                 add(heading);
                 p1 = new JPanel();
                 p1.setLayout(null);
                 p1.setBounds(50,150,100,100);
                 p1.setBackground(new Color(0,162,232));
                 JLabel l1 = new JLabel(new ImageIcon("icons/add_fee.png"));
                 l1.setBounds(0,0,100,70);
                 JLabel l11 = new JLabel("Fees Form");
                 l11.setBounds(10,70,100,20);
                 p1.add(l11);
                 p1.add(l1);
                 add(p1);
                 p1.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new Fees();
                                 }
                              
                          }
                          public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p1);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p1);
                              
                          }
                     });

                 p2 = new JPanel();
                 p2.setLayout(null);
                 p2.setBounds(200,150,100,100);
                 p2.setBackground(new Color(0,162,232));
                 JLabel l2 = new JLabel(new ImageIcon("icons/edit_Fee.png"));
                 l2.setBounds(0,0,100,70);
                 JLabel l22 = new JLabel("Edit Fees Form");
                 l22.setBounds(6,70,100,20);
                 p2.add(l2);
                 p2.add(l22);
                 add(p2);
                  p2.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new EditFees();
                                 }
                              
                          }
                         public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p2);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p2);
                              
                          }
                     });

                 p3 = new JPanel();
                 p3.setLayout(null);
                 p3.setBounds(360,150,100,100);
                 p3.setBackground(new Color(0,162,232));
                 JLabel l3 = new JLabel(new ImageIcon("icons/fee_Record.png"));
                 l3.setBounds(0,0,100,70);
                 JLabel l33 = new JLabel("Fees Record");
                 l33.setBounds(10,70,100,20);
                 p3.add(l3);
                 p3.add(l33);
                 add(p3);
                 p3.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new FeesRecord();
                                 }
                              
                          }
                          public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p3);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p3);
                              
                          }
                     });

                 p4 = new JPanel();
                 p4.setLayout(null);
                 p4.setBounds(50,320,100,100);
                 p4.setBackground(new Color(0,162,232));
                 JLabel l4 = new JLabel(new ImageIcon("icons/Payroll.png"));
                 l4.setBounds(0,0,100,70);
                 JLabel l44 = new JLabel("PayRoll Form");
                 l44.setBounds(7,70,100,20);
                 p4.add(l4);
                 p4.add(l44);
                 add(p4);
                 p4.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new PayRoll();
                                 }
                              
                          }
                          public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p4);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p4);
                              
                          }
                     });
                 
                 p5 = new JPanel();
                 p5.setLayout(null);
                 p5.setBounds(200,320,100,100);
                 p5.setBackground(new Color(0,162,232));
                 JLabel l5 = new JLabel(new ImageIcon("icons/edit_Payroll.png"));
                 l5.setBounds(0,0,100,70);
                 JLabel l55 = new JLabel("Edit PayRoll Form");
                 l55.setBounds(3,70,100,20);
                 p5.add(l5);
                 p5.add(l55);
                 add(p5);
                 p5.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new EditPayRoll();
                                 }
                              
                          }
                         public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p5);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p5);
                              
                          }
                     });
                 p6 = new JPanel();
                 p6.setLayout(null);
                 p6.setBounds(360,320,100,100);
                 p6.setBackground(new Color(0,162,232));
                 JLabel l6 = new JLabel(new ImageIcon("icons/Payroll_record.png"));
                 l6.setBounds(0,0,100,70);
                 JLabel l66 = new JLabel("PayRoll Record");
                 l66.setBounds(3,70,100,20);
                 p6.add(l6);
                 p6.add(l66);
                 add(p6);
                 p6.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new PayRollRecord();
                                 }
                              
                          }
                          public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p6);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p6);
                              
                          }
                     });               
  
                 setLayout(null);
                 setBackground(new Color(0,162,232));
                 
                  

             }             
            
           public void setColor(JPanel color){
         
                 color.setBackground(new Color(0,255,255));
        
      }    
      public void resetColor(JPanel color2){
         
                 color2.setBackground(new Color(0,162,232));
        
      }      






}