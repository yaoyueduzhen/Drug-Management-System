package Medicine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

public class add extends JFrame{
	  private static final long serialVersionUID = 2294503152841317673L;
	    //面板容器
	    private JPanel contentPane;
	    //文本框
	    private JTextField textField=null,textField1=null,textField2=null,textField3=null,textField4=null;
	    
	    
	    public add(){
	    	setTitle("添加药品");
	        //关闭
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //大小及位置
	        setBounds(10, 100, 300, 300);
	        //面板容器实例化
	        contentPane = new JPanel();
	        setLayout(new GridLayout(6,1,5,5));
	       
	        JPanel panel = new JPanel();

	        //标签
	        JLabel label = new JLabel("药品名称:");
	        //标签字体
	        label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //面板加入标签
	        panel.add(label);
	        //文本框
	        textField = new JTextField();
	        //文本框字体
	        textField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //将文本框加入到面板中
	        panel.add(textField);
	        //文本框的宽度
	        textField.setColumns(10);
	        add(panel);
	        
	        JPanel panel1 = new JPanel();
	     
	        //标签
	        JLabel label1 = new JLabel("药品厂家:");
	        //标签字体
	        label1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //面板加入标签
	        panel1.add(label1);
	        //文本框
	        textField1 = new JTextField();
	        //文本框字体
	        textField1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //将文本框加入到面板中
	        panel1.add(textField1);
	        //文本框的宽度
	        textField1.setColumns(10);
	        add(panel1);
	        
	        JPanel panel2 = new JPanel();
	
	        //标签
	        JLabel label2 = new JLabel("药品数量:");
	        //标签字体
	        label2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //面板加入标签
	        panel2.add(label2);
	        //文本框
	        textField2 = new JTextField();
	        //文本框字体
	        textField2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //将文本框加入到面板中
	        panel2.add(textField2);
	        //文本框的宽度
	        textField2.setColumns(10);
	        add(panel2);
	        
	        JPanel panel3 = new JPanel();
	
	        //标签
	        JLabel label3 = new JLabel("药品价格:");
	        //标签字体
	        label3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //面板加入标签
	        panel3.add(label3);
	        //文本框
	        textField3 = new JTextField();
	        //文本框字体
	        textField3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //将文本框加入到面板中
	        panel3.add(textField3);
	        //文本框的宽度
	        textField3.setColumns(10);
	        add(panel3);
	        
	        JPanel panel4 = new JPanel();
	
	        //标签
	        JLabel label4 = new JLabel("药品功效:");
	        //标签字体
	        label4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //面板加入标签
	        panel4.add(label4);
	        //文本框
	        textField4 = new JTextField();
	        //文本框字体
	        textField4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
	        //将文本框加入到面板中
	        panel4.add(textField4);
	        //文本框的宽度
	        textField4.setColumns(10);
	        add(panel4);
	        
	        JButton button_1 = null;
	        button_1 = new JButton("确定");
	        button_1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	String sql="insert into medicineinformation(name,company,number,price,mainfunction) "
	            			+ "values(\'"+textField.getText()+"\' ,\'"+textField1.getText()+"\' ,"+textField2.getText()
        				+","+textField3.getText()+",\'"+textField4.getText()+"\')";
	            	if(textField.getText().equals("")||textField1.getText().equals("")||textField2.equals("")||textField3.getText().equals("")||textField4.getText().equals(""))	
	            		JOptionPane.showMessageDialog(null, "添加失败!");
	            	else{
	            		new SQL().Update(sql);
	            		JOptionPane.showMessageDialog(null, "添加成功!");
	            	}
	            	setVisible(false);
	            }
	        });
	        add(button_1);
	        setVisible(true);
	    }

}

