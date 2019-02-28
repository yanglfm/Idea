package StudentMS.com.bochy.dao.impl;
import StudentMS.com.bochy.dao.AdminDao;
import StudentMS.com.bochy.entity.Admin;

import StudentMS.com.bochy.util.DBHelper;


import java.sql.*;

public class AdminDaoImpl extends DBHelper implements AdminDao {

    @Override
    public Admin Login(Admin admin) {
        //属性
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from admininfo where username = ? and password =?";
                pstmt = conn.prepareStatement(sql);
                // 执行
                pstmt.setString(1,admin.getUsername());
                pstmt.setString(2,admin.getPassword());
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    return admin;
                }else {
                    return null;
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }finally {
            closeConn(rs,pstmt,conn);
        }
        return null;
    }
}
