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
    //����
    boolean flag=false;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Student stu = null;

    @Override
    public boolean addStudent(Student stu) {
        //�����ݿ�����
        conn = getConn();
        if (conn != null) {
            String sql = "insert into STUDENT values(?,?,?,?,?,?,?,?)";
            //����Ԥ����
            try {
                pstmt = conn.prepareStatement(sql);
                //ע������
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setString(3, stu.getSex());
                pstmt.setInt(4, stu.getAge());
                pstmt.setString(5, stu.getClassType());
                pstmt.setString(6, stu.getAddress());
                pstmt.setString(7, stu.getTel());
                pstmt.setString(8, stu.getEmail());
                //ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("���ݲ���ɹ�");
                    flag = true;
                } else {
                    System.out.println("���ݲ���ʧ��");
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
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "update STUDENT set age=" + age + "where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("���ݸ��³ɹ���");
                    flag = true;
                } else {
                    System.out.println("���ݸ���ʧ�ܣ�");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return flag;
    }


    @Override
    public Student findBystuid(int stuid) {
        Student stu = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from  STUDENT where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
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
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return stu;
    }

    @Override
    public Student findInfo(int stuid) {//��ѯ����ѧ����Ϣ
        return null;
    }

    public ArrayList<Student> findStuInfo() {//��ѯ�õ����е�ѧ����Ϣ�������ؼ���
        ArrayList<Student> list = new ArrayList<>();
        Student stu = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from  STUDENT ";
                pstmt = conn.prepareStatement(sql);
                // ִ��
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
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, conn);
        }
        return list;
    }

    @Override
    public boolean delStudent(int stuid) {
        //�����ݿ�����
        conn = getConn();

        try {
            if (conn != null) {
                //sql��
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
