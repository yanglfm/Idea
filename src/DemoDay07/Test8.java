package DemoDay07;

import java.sql.*;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //插入语句
        String sql="insert into bank(username,balance) values(?,?)";
        //预处理的插入方式
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //对数据进行注入
        pstmt.setString(1,"张三");
        pstmt.setInt(2,1280);
        int count = pstmt.executeUpdate();
        if(count>0){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
        conn.close();

    }
}
