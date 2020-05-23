import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class EditFees extends JFrame implements ActionListener{

            Container cont;
            JPanel jPanel;
            JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
            JTextField ltf1,ltf2,ltf3,ltf4,ltf5,ltf6,ltf7,ltf8,ltf9,ltf10,ltf11,ltf12,ltf13;
            JRadioButton male,female;
            ButtonGroup bg;
            JComboBox classbox;
            JButton save,search,delete;
            String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
            Connection conn;
	    PreparedStatement psmt;
            Statement stm2;
	    ResultSet rs2 ;
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            String userName = "System";
            String password = "System";
            int pass,pass2,check1,check2;
            String dl;
            EditFees(){
                 cont = getContentPane();
                 setLayout(null);
                 setSize(600,400);

                 setTitle("SCHOOL MANAGEMENT SYSTEM");

                 jPanel = new JPanel();
                 jPanel.setLayout(null);
                 jPanel.setBounds(0,0,600,600);
                 jPanel.setBackground(Color.green);
                
                 setResizable(false);
                 JLabel logo = new JLabel(new ImageIcon("icons/logo.png"));
                 logo.setBounds(120,10,60,60);  
                   setIconImage(new ImageIcon("icons/logo.png").getImage());             
                 jPanel.add(logo);
                 
                 
                 JLabel heading = new JLabel("Edit Fees Form ");
                 heading.setBounds(180,5,350,100);  
                 heading.setFont(new Font("Ravie",Font.BOLD,25));              
                 jPanel.add(heading);

                 /*******GUI******/
                 l1 = new JLabel("ID :");
                 l1.setBounds(70,80,50,25);
                 l2 = new JLabel("Name :");
                 l2.setBounds(70,120,50,25);
                 l3 = new JLabel("Class :");
                 l3.setBounds(70,160,100,25);
                 l4 = new JLabel("Date :");
                 l4.setBounds(70,200,100,25);
                 l5 = new JLabel("Late fee  :");
                 l5.setBounds(280,200,100,25);
                 l6 = new JLabel("Amount :");
                 l6.setBounds(70,240,100,25);
                 



                 ltf1 = new JTextField();
                 ltf1.setBounds(140,80,340,25);
                 ltf2 = new JTextField();
                 ltf2.setBounds(140,120,340,25);
                 ltf3 = new JTextField();
                 ltf3.setBounds(140,160,340,25);
                 ltf4 = new JTextField();
                 ltf4.setBounds(140,200,120,25);
                 ltf5 = new JTextField();
                 ltf5.setBounds(360,200,120,25);
                 ltf6 = new JTextField();
                 ltf6.setBounds(140,240,340,25);
                 
                 ltf1.setEditable(false);
                 ltf2.setEditable(false);
                 ltf3.setEditable(false);

                 save = new JButton("Update");
                 save.setBounds(70,300,100,25);
                 save.addActionListener(this);

                 search = new JButton("Search");
                 search.setBounds(230,300,100,25);
                 search.addActionListener(this);

                 delete = new JButton("Delete");
                 delete.setBounds(380,300,100,25);
                 delete.addActionListener(this);

                 jPanel.add(l1);
                 jPanel.add(l2);
                 jPanel.add(l3);
                 jPanel.add(l4);
                 jPanel.add(l5);
                 jPanel.add(l6);
                 
                 jPanel.add(ltf1);
                 jPanel.add(ltf2);
                 jPanel.add(ltf3);
                 jPanel.add(ltf4);
                 jPanel.add(ltf5);
                 jPanel.add(ltf6);                 
                 
                 jPanel.add(save);
                 jPanel.add(search);
                 jPanel.add(delete);
                 
                 cont.add(jPanel);
                 setLocationRelativeTo(null);
                 setVisible(true);
                 try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                    }catch(Exception cnf){ JOptionPane.showMessageDialog(this,cnf,"Error",JOptionPane.ERROR_MESSAGE);}
                 
                
            }
   
     public void actionPerformed(ActionEvent e){
                  s1="";s2="";s3="";s4="";s5="";s6="";s7="";s8="";s9="";s10="";s11="";s12="";                       
                    if(e.getSource()== save){
                         s1 = ltf1.getText();
                         s2 = ltf2.getText();
                         s3 = ltf3.getText();
                         s4 = ltf4.getText();
                         s5 = ltf5.getText();
                         s6 = ltf6.getText();
                         pass=0;pass2=0;check1=0;check2=0;
                         if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s6.isEmpty()){
                                JOptionPane.showMessageDialog(this,"Some field is empty !","Error",JOptionPane.ERROR_MESSAGE);                           
                         }else{ 
                                         
                                         String i = ltf5.getText();
					
					 String i2=ltf6.getText();
					for(int y=0;y<i.length(); ++y)
					{
						
						if(!Character.isDigit(i.charAt(y)))
							{  pass2=7; check2=1;  }
						
					}
					
					for(int y2=0;y2<i2.length(); ++y2)
					{
						
						if(!Character.isDigit(i2.charAt(y2)))
						{  pass2=7;  check1=1; }
					}

                                         
                                              if(pass2==0){
                                         try {          Connection con = DriverManager.getConnection(url,userName,password);
      							PreparedStatement preparedStmt = con.prepareStatement("delete from fees where id = ?");
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
      							con.close(); 
							conn = DriverManager.getConnection(url,userName,password);
							psmt =  conn.prepareStatement("insert into fees values(?,?,?,?,?,?)");
			                	        psmt.setString(1,s1);
							psmt.setString(2,s2);
							psmt.setString(3,s3);
                                                        psmt.setString(4,s4);
							psmt.setString(5,s5);
							psmt.setString(6,s6);
                                                       
							psmt.executeUpdate();
							JOptionPane.showMessageDialog(this,"Save fees successful","Success",JOptionPane.INFORMATION_MESSAGE);
							ltf1.setText("");ltf2.setText("");ltf3.setText("");ltf4.setText("");ltf5.setText("");ltf6.setText("");
                                                       
							conn.close();

							}
						catch(Exception se){ JOptionPane.showMessageDialog(this,se,"Error",JOptionPane.ERROR_MESSAGE);}
                                                      }else{ if(check2==1){ JOptionPane.showMessageDialog(this,"Invalid late fees !","Error",JOptionPane.ERROR_MESSAGE);}
                                                             if(check1==1){ JOptionPane.showMessageDialog(this,"Invalid amount !","Error",JOptionPane.ERROR_MESSAGE);}
                                                       }
                                               









                      }
                    }
              if(e.getSource()==search){
						int de=0;
						dl=JOptionPane.showInputDialog(this,"Enter ID");
						if(!dl.isEmpty()){
								try{ 	
			                               			conn = DriverManager.getConnection(url,userName,password);
									stm2=conn.createStatement();
									rs2=stm2.executeQuery("Select id from fees");
									while (rs2.next())
									{
										if(dl.equals(rs2.getString(1)))
										{
											de=1; 
											break;
										}
									} 
									conn.close();
								}catch(Exception ep){}
							if(de==1){ 

								try{	
					
									conn = DriverManager.getConnection(url,userName,password);
									stm2=conn.createStatement();
									rs2= stm2.executeQuery("SELECT  *  FROM fees WHERE id="+dl+" ");
						
									while(rs2.next())
									{
					
									ltf1.setText(rs2.getString(1));
									ltf2.setText(rs2.getString(2));
									
									ltf3.setText(rs2.getString(3));
                                                                        ltf4.setText(rs2.getString(4));
									ltf5.setText(rs2.getString(5));
									
									ltf6.setText(rs2.getString(6));
									
									
									}
									
									conn.close();
					
				          			    }catch(Exception p){JOptionPane.showMessageDialog(this,p,"Error",JOptionPane.ERROR_MESSAGE);}


							}else{  JOptionPane.showMessageDialog(this,"Data not found","Error",JOptionPane.ERROR_MESSAGE);}


						}else{ JOptionPane.showMessageDialog(this,"Search field is empty","Error",JOptionPane.ERROR_MESSAGE);}
					
					}

              if(e.getSource()== delete){
                         s1 = ltf1.getText();
                         s2 = ltf2.getText();
                         s3 = ltf3.getText();
                         s4 = ltf4.getText();
                         s5 = ltf5.getText();
                         s6 = ltf6.getText();
                         pass=0;pass2=0;check1=0;check2=0;
                         if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s6.isEmpty()){
                                JOptionPane.showMessageDialog(this,"Some field is empty !","Error",JOptionPane.ERROR_MESSAGE);                           
                         }else{ 
                                         
                                        

                                         
                                              
                                         try {          Connection con = DriverManager.getConnection(url,userName,password);
      							PreparedStatement preparedStmt = con.prepareStatement("delete from fees where id = ?");
      							preparedStmt.setString(1, s1);
      							preparedStmt.execute();
      							con.close(); 
							
							JOptionPane.showMessageDialog(this,"Delete fees successful","Success",JOptionPane.INFORMATION_MESSAGE);
							ltf1.setText("");ltf2.setText("");ltf3.setText("");ltf4.setText("");ltf5.setText("");ltf6.setText("");
                                                       
							conn.close();

							}
						catch(Exception se){ JOptionPane.showMessageDialog(this,se,"Error",JOptionPane.ERROR_MESSAGE);}
                                                      
                                               









                      }
                    }



     }
    
     public static void main(String []args){
               new EditFees();
     }


}