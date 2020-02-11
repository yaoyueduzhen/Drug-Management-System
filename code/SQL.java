package Medicine;

import java.sql.ResultSet;  
import java.sql.SQLException;

import javax.swing.JOptionPane;  

public class SQL {
	static String sql = null;  
	static DataBase db1 = null;
	static ResultSet ret = null;
	  
    public ResultSet Query(String sql) {
        db1 = new DataBase(sql);//创建DBHelper对象  
  
        try {
            ret = db1.pst.executeQuery();//执行语句，得到结果集
            return ret;
          /*  while (ret.next()) {  
                String name = ret.getString(1);  
                String company = ret.getString(2);
                String number = ret.getString(3);  
                String price = ret.getString(4); 
                String mainfuction = ret.getString(5);
                System.out.println(name + "\t" + company + "\t" + number + "\t" + price + "\t" + mainfuction);  
            }//显示数据  
            ret.close();  
            db1.close();//关闭连接  */
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return ret;
    }  
    public void Update(String sql){
    	db1 = new DataBase(sql);//创建DBHelper对象  
    	try {
            db1.pst.executeUpdate();//执行语句，得到结果集
    	}catch (SQLException e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "出现异常!");
        }
    	return;
    }
    
  /*  public static void main(String[] args) {  
        String sql = "select *from medicineinformation";//SQL语句  
        ResultSet ret = new SQL().Getresult(sql);
        try {
			while (ret.next()) {  
			    String name = ret.getString(1);  
			    String company = ret.getString(2);
			    String number = ret.getString(3);  
			    String price = ret.getString(4); 
			    String mainfuction = ret.getString(5);
			    System.out.println(name + "\t" + company + "\t" + number + "\t" + price + "\t" + mainfuction);  
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }*/
}