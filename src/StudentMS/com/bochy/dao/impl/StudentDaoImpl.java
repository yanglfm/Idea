package StudentMS.com.bochy.dao.impl;

import StudentMS.com.bochy.dao.StudentDao;
import StudentMS.com.bochy.entity.Student;
import StudentMS.com.bochy.util.DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDaoImpl extends DBHelper implements StudentDao {
    //属性
    boolean flag=false;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Student stu = null;

    @Override
    public boolean addStudent(Student stu) {
        //打开数据库连接
        conn = getConn();
        if (conn != null) {
            String sql = "insert into STUDENT values(?,?,?,?,?,?,?,?)";
            //进入预处理
            try {
                pstmt = conn.prepareStatement(sql);
                //注入数据
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setString(3, stu.getSex());
                pstmt.setInt(4, stu.getAge());
                pstmt.setString(5, stu.getClassType());
                pstmt.setString(6, stu.getAddress());
                pstmt.setString(7, stu.getTel());
                pstmt.setString(8, stu.getEmail());
                //执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据插入成功");
                    flag = true;
                } else {
                    System.out.println("数据插入失败");
                    flag = false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                closeConn(rs, pstmt, conn);
            }
        }
        return flag;
    }

    @Override
    public boolean updateStudent(int stuid, int age) {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "update STUDENT set age=" + age + "where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据更新成功！");
                    flag = true;
                } else {
                    System.out.println("数据更新失败！");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return flag;
    }


    @Override
    public Student findBystuid(int stuid) {
        Student stu = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from  STUDENT where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String stuname = rs.getString(2);
                    String sex = rs.getString(3);
                    int age = rs.getInt(4);
                    String classType = rs.getString(5);
                    String address = rs.getString(6);
                    String tel = rs.getString(7);
                    String email = rs.getString(8);
                    stu = new Student(stuid, stuname, sex, age, classType, address, tel, email);
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return stu;
    }

    @Override
    public Student findInfo(int stuid) {//查询所有学生信息
        return null;
    }

    public ArrayList<Student> findStuInfo() {//查询得到所有的学生信息，并返回集合
        ArrayList<Student> list = new ArrayList<>();
        Student stu = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from  STUDENT ";
                pstmt = conn.prepareStatement(sql);
                // 执行
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    int stuid = rs.getInt(1);
                    String stuname = rs.getString(2);
                    String sex = rs.getString(3);
                    int age = rs.getInt(4);
                    String classType = rs.getString(5);
                    String address = rs.getString(6);
                    String tel = rs.getString(7);
                    String email = rs.getString(8);
                    stu = new Student(stuid, stuname, sex, age, classType, tel, email, address);
                    list.add(stu);
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return list;
    }

    @Override
    public boolean delStudent(int stuid) {
        //打开数据库连接
        conn = getConn();

        try {
            if (conn != null) {
                //sql文
                String sql = "delete from Student where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return flag;
    }

}
