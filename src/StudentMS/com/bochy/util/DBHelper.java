package StudentMS.com.bochy.util;

import java.sql.*;

public class DBHelper {
        Connection conn = null;
        public Connection getConn() {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
            } catch (Exception e) {
                // TODO �Զ����ɵ� catch ��
                e.printStackTrace();
            }
            return conn;
        }

        public void closeConn(ResultSet rs, Statement stmt, Connection conn) {
            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO �Զ����ɵ� catch ��
                    e.printStackTrace();
                }
            }

            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    // TODO �Զ����ɵ� catch ��
                    e.printStackTrace();
                }
            }

            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO �Զ����ɵ� catch ��
                    e.printStackTrace();
                }
            }

        }

    public static void main(String[] args) {
        new DBHelper().getConn();
    }


}
