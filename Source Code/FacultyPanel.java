import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FacultyPanel extends JPanel {
              JPanel p1,p2,p3,p4,p5;
              FacultyPanel(){



                 JLabel sublogo = new JLabel(new ImageIcon("icons/sub_logo.png"));
                 sublogo.setBounds(220,5,150,80);                
                 add(sublogo); 
                 JLabel heading = new JLabel("Staff & Teacher ");
                 heading.setBounds(170,50,350,100);  
                 heading.setFont(new Font("Rosewood Std",Font.BOLD,30));              
                 add(heading);

                 p1 = new JPanel();
                 p1.setLayout(null);
                 p1.setBounds(50,150,100,100);
                 p1.setBackground(new Color(0,162,232));
                 JLabel l1 = new JLabel(new ImageIcon("icons/staff.png"));
                 l1.setBounds(0,0,100,70);
                 JLabel l11 = new JLabel("New Staff");
                 l11.setBounds(15,70,100,20);
                 p1.add(l11);
                 p1.add(l1);
                 add(p1);
                 p1.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new Faculty();
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
                 JLabel l2 = new JLabel(new ImageIcon("icons/update_Staff.png"));
                 l2.setBounds(0,0,100,70);
                 JLabel l22 = new JLabel("Update Staff");
                 l22.setBounds(10,70,100,20);
                 p2.add(l2);
                 p2.add(l22);
                 add(p2);
                  p2.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new UpdateFaculty();
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
                 JLabel l3 = new JLabel(new ImageIcon("icons/search.png"));
                 l3.setBounds(0,0,100,70);
                 JLabel l33 = new JLabel("Search Form");
                 l33.setBounds(10,70,100,20);
                 p3.add(l3);
                 p3.add(l33);
                 add(p3);
                 p3.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new SearchFaculty();
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
                 JLabel l4 = new JLabel(new ImageIcon("icons/delete_addmission.png"));
                 l4.setBounds(0,0,100,70);
                 JLabel l44 = new JLabel("Delete Form");
                 l44.setBounds(10,70,100,20);
                 p4.add(l4);
                 p4.add(l44);
                 add(p4);
                 p4.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new DeleteFaculty();;
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
                 JLabel l5 = new JLabel(new ImageIcon("icons/view_Addmission.png"));
                 l5.setBounds(0,0,100,70);
                 JLabel l55 = new JLabel("View Staff");
                 l55.setBounds(15,70,100,20);
                 p5.add(l5);
                 p5.add(l55);
                 add(p5);
                 p5.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        new FacultyRecord();
                                 }
                              
                          }
                          public void mouseEntered(MouseEvent evt) {
                                          
		                 setColor(p5);
                              
                          }
                          public void mouseExited(MouseEvent evt) {
                                          
		                 resetColor(p5);
                              
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