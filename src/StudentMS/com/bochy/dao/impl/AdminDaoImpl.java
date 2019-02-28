package StudentMS.com.bochy.dao.impl;
import StudentMS.com.bochy.dao.AdminDao;
import StudentMS.com.bochy.entity.Admin;

import StudentMS.com.bochy.util.DBHelper;


import java.sql.*;

public class AdminDaoImpl extends DBHelper implements AdminDao {

    @Override
    public Admin Login(Admin admin) {
        //����
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from admininfo where username = ? and password =?";
                pstmt = conn.prepareStatement(sql);
                // ִ��
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
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }finally {
            closeConn(rs,pstmt,conn);
        }
        return null;
    }
}
