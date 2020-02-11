package Medicine;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Signin extends JFrame implements ActionListener{
	JPanel mb1,mb2,mb3;
	 JButton an1,an2;
	 JLabel lb1,lb2;
	 JTextField wb;
	 JPasswordField mm;
 
    public Signin() {
    	  mb1=new JPanel();
    	  mb2=new JPanel();
    	  mb3=new JPanel();
    	  an1=new JButton("登录");
    	  an2=new JButton("退出");
    	  lb1=new JLabel("用户名:");
    	  lb2=new JLabel("密     码:");
    	  
    	  wb=new JTextField(10);
    	  mm=new JPasswordField(10);
    	  mb1.add(lb1);  mb1.add(wb);
    	  mb2.add(lb2);  mb2.add(mm);
    	  mb3.add(an1);
    	  mb3.add(an2);
    	  this.setLayout(new GridLayout(3,1));
    	  
    	  this.add(mb1);
    	  this.add(mb2);
    	  this.add(mb3);
    	  
    	  this.setTitle("用户登录界面");
    	  
    	  this.setSize(230,150);
    	  this.setLocation(300,280);
    	  this.setResizable(false);
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    	  an1.addActionListener(this);
    	  an2.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent ae) {
    	System.out.println(1);
    	if (ae.getSource() == an1) {
            try {
            	String name = wb.getText();
            	String password = mm.getText();
                if (name.equals("user")&&password.equals("12345"))
                {
                	System.out.println(1);
                    JOptionPane.showMessageDialog(null, "登陆成功！");
                    try {
                    	//皮肤
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                    EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                SearchList frame = new SearchList();
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    setVisible(false);
                }
                else  {
                    JOptionPane.showMessageDialog(null, "用户名或密码错误！");
                    wb.setText("");
                    mm.setText("");
                }
            } catch (Exception ex) {
            }
	    
        }
        if (ae.getSource() == an2) {
	        //System.out.println("1111111111111");
	        System.exit(0);
	    }
    }
 
    public static void main(String arg[]) {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        Signin frm = new Signin();
        frm.setSize(400, 200);
        frm.setVisible(true);
    }
}
