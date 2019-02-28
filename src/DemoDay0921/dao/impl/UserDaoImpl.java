package DemoDay0921.dao.impl;

import DemoDay0921.dao.IUserDao;
import DemoDay0921.bean.Users;
import JDBCDao.com.syjy.util.BaseDao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl extends BaseDao2 implements IUserDao {
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    boolean flag=false;
    @Override
    public boolean login(String username, String password) {
        try {
            //开启数据库连接
            conn = getConn();
            //sql语句
            String sql="select * from users where username=? and password=?";
            //预编译
            ps.setString(1,username);
            ps.setString(2,password);
            //执行
            rs=ps.executeQuery();
            while (rs.next()){
                if (rs.getString(2).equals(username) && rs.getString(3).equals(password)){
                    flag=true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
    public boolean login(Users u) {
        return false;
    }

    @Override
    public Users login2(Users u) {
        try {
            //开启数据库连接
            conn = getConn();
            //sql语句
            String sql = "select * from users where username=? and password=?";
            //预编译
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            //执行
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(u.getUsername()) && rs.getString(3).equals(u.getPassword())) {
                    u=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                    return u;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return null;
    }

    @Override
    public List<Users> findAllUser() {
        return null;
    }

    @Override
    public Users findByUserName(String userName) {
        return null;
    }
}
