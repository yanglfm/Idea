package DemoDay07;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertEmpTest1 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            String username="tom";
            String password="123456";
            //��ȡ���������
            conn = DriverManager.getConnection(url, username, password);
            //insert into employees select * from employees;
            //�������
            String sql ="insert into emp values (?,?,?,?,?,?,?,?)";
            //Ԥ������뷽ʽ
            pstmt =conn.prepareStatement(sql);
            //�Խ������ע��
            String str="1999/10/1";
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
            java.util.Date date = sdf.parse(str);
            long time = date.getTime();
            pstmt.setInt(1,8000);
            pstmt.setString(2,"Beijing");
            pstmt.setString(3,"Manager");
            pstmt.setInt(4,7369);
            pstmt.setDate(5, new java.sql.Date(time));
            pstmt.setDouble(6,1000);
            pstmt.setDouble(7,120);
            pstmt.setInt(8,30);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
