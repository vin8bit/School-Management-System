import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends JFrame {

         Container cont;
         JPanel menu1,menu2;
         JPanel addPanel,facultyPanel,feesPanel;
         AdmissionForm admissionForm;
         FacultyPanel facultyForm;
         FeesPanel feesForm;
         JMenuBar  menu_Bar;
         JMenu file,addmenu,staff,fees,result,help;

            	Admin(){
                     setTitle("SCHOOL MINI MANAGEMENT SYSTEM");
                     setIconImage(new ImageIcon("icons/logo.png").getImage()); 
                     menu_Bar = new JMenuBar();
                     file = new JMenu("File");
                     menu_Bar.add(file);
                     addmenu = new JMenu("Student");
                     menu_Bar.add(addmenu);
                     staff = new JMenu("Staff & Teacher");
                     menu_Bar.add(staff);
                     fees = new JMenu("Fee & PayRoll");
                     menu_Bar.add(fees);
                     result = new JMenu("Result");
                     menu_Bar.add(result);
                     help = new JMenu("Help");
                     menu_Bar.add(help);
                     
                     setJMenuBar(menu_Bar);
                     admissionForm = new AdmissionForm();
                     facultyForm  = new FacultyPanel();
                     feesForm =  new FeesPanel();                    
                     cont = getContentPane();
                     setLayout(null);
                     JPanel menu11 = new JPanel();
                    
                     menu1 = new JPanel();
                     menu1.setLayout(null);
                     //menu1.setLayout(new BorderLayout());
		     menu2 = new JPanel();
                     menu2.setLayout(new BorderLayout());
                     menu2.setBackground(Color.red);
                     menu1.setBounds(0,0,150,600);
                     menu2.setBounds(150,0,650,600);
                     
                     menu1.setBackground(Color.green);
                     

                     /********Admission menu **********/

                     addPanel = new JPanel();
                     addPanel.setBounds(0,60,150,90);
                     addPanel.setBackground(new Color(0,162,232));
                     ImageIcon img1 = new ImageIcon("icons/Add_Student.png");
                     addPanel.add(new JLabel(img1));
		     addPanel.add(new JLabel("Admission & Students"));
                     menu1.add(addPanel);
                     addPanel.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        menu2.add(admissionForm);
                                        admissionForm.setVisible(true);
                                        facultyForm.setVisible(false);
                                        feesForm.setVisible(false);
                                        System.out.println("menu2add");
                                        setColor(addPanel);
                                        resetColor(facultyPanel);
                                        resetColor(feesPanel);
                                 }
                              
                          }
                     });

                     /********Faculty menu **********/

                     facultyPanel = new JPanel();
                     facultyPanel.setBounds(0,160,150,90);
                     facultyPanel.setBackground(new Color(255,255,255));
                     ImageIcon img2 = new ImageIcon("icons/Add_Staff.png");
                     facultyPanel.add(new JLabel(img2));
		     facultyPanel.add(new JLabel("Staff & Teacher"));
                     menu1.add(facultyPanel);
                      facultyPanel.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        menu2.add(facultyForm);
                                        admissionForm.setVisible(false);
                                        facultyForm.setVisible(true);
                                        feesForm.setVisible(false);
                                        System.out.println("menu2ffffff");
                                        setColor(facultyPanel);
                                        resetColor(addPanel);
                                        resetColor(feesPanel);
                                 }
                              
                          }
                     });

                    /********Fees menu **********/

                     feesPanel = new JPanel();
                     feesPanel.setBounds(0,260,150,90);
                     feesPanel.setBackground(new Color(255,255,255));
                     ImageIcon img3 = new ImageIcon("icons/fee.png");
                     feesPanel.add(new JLabel(img3));
		     feesPanel.add(new JLabel("Fees & PayRoll"));
                     menu1.add(feesPanel);
                     feesPanel.addMouseListener(new MouseAdapter() {
                           public void mousePressed(MouseEvent evt) {
                                          
		                 if((evt.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK ){
				        menu2.add(feesForm);
                                        admissionForm.setVisible(false);
                                        facultyForm.setVisible(false);
                                        feesForm.setVisible(true);
                                         setColor(feesPanel);
                                        resetColor(addPanel);
                                        resetColor(facultyPanel);
                                        
                                 }
                              
                          }
                     });

                     menu2.add(admissionForm);
                     cont.add(BorderLayout.WEST,menu1);
                     cont.add(menu2);
                     setSize(800,600);
                     setLocationRelativeTo(null);
                     setDefaultCloseOperation(EXIT_ON_CLOSE);
                     setResizable(false);
                     setVisible(true);                     

		}
           public void setColor(JPanel color){
         
                 color.setBackground(new Color(0,162,232));
        
      }    
      public void resetColor(JPanel color2){
         
                 color2.setBackground(new Color(255,255,255));
        
      }          

      public static void main(String []args){
              
               new Admin();
      }

}
