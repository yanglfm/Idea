package JDBCDao.com.syjy.util;

import java.sql.*;

public class BaseDao {
    Connection conn = null;
    public Connection getConn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn(ResultSet rs,Statement stmt,Connection conn) {
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }

        if(stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }

        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }

    }

   /* public static void main(String[] args) {
        new BaseDao().getConn();
    }
*/

}
