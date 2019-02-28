package JDBCDao.com.syjy.util;

import java.sql.*;
import java.util.ResourceBundle;

public class BaseDao2 {
    Connection conn=null;
    public Connection getConn(){
        try {
            //��ȡ�����ļ���Ϣ
            ResourceBundle bd = ResourceBundle.getBundle("ConnDB");
            String driver = bd.getString("driver");
            String url = bd.getString("url");
            String username = bd.getString("username");
            String passsword = bd.getString("password");
            Class.forName(driver);
            System.out.println("���ݿ����ӳɹ�");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  conn;
    }
    public void closeConn(ResultSet rs,Statement stmt,Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new BaseDao2().getConn();

    }

}
