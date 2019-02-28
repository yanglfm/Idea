package JDBCDao.com.syjy.dao.impl;

import JDBCDao.com.syjy.bean.Stu;
import JDBCDao.com.syjy.com.syjy.dao.IStuDao;
import JDBCDao.com.syjy.util.BaseDao;

import java.sql.*;
import java.util.ArrayList;

public class StuDaoImpl extends BaseDao implements IStuDao {
    //����
    boolean flag;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Stu stu = null;
    //�з���ֵ���� ������
    @Override
    public boolean addStu(Stu stu) {
        //�����ݿ�����
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";
            //����Ԥ����
            try {
                pstmt = conn.prepareStatement(sql);
                //ע������
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setInt(3, stu.getAge());
                pstmt.setString(4, stu.getSex());
                pstmt.setDate(5, (Date) stu.getBirthday());
                pstmt.setString(6, stu.getTel());
                pstmt.setString(7, stu.getEmail());
                pstmt.setString(8, stu.getAddress());
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
            }
        }
        return flag;
    }

    @Override
    public boolean delStu(int stuid) {
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "delete from stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("����ɾ���ɹ���");
                    flag = true;
                } else {
                    System.out.println("����ɾ��ʧ�ܣ�");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public boolean updateStu(int stuid, int age) {//�����ض��ĸ��µ�������ʲô
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "update stu set age=" + age + "where stuid=" + stuid;
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
        }
        return flag;
    }

    @Override
    public Stu findBystuid(int stuid) {//��ѯ����ѧ����Ϣ��������Stu
        Stu stu = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from  stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String stuname = rs.getString(2);
                    int age = rs.getInt(3);
                    String sex = rs.getString(4);
                    Date birthday = rs.getDate(5);
                    String tel = rs.getString(6);
                    String email = rs.getString(7);
                    String address = rs.getString(8);
                    stu = new Stu(stuid, stuname, age, sex, birthday, tel, email, address);
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
        return stu;
    }

    @Override
    public ArrayList<Stu> findStuInfo(int age) {//��ѯ�õ����ѧ����Ϣ�������ؼ���
        ArrayList<Stu> list = new ArrayList<>();
        Stu stu = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from  stu where age=" + age;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    int stuid = rs.getInt(1);
                    String stuname = rs.getString(2);
                    String sex = rs.getString(4);
                    Date birthday = rs.getDate(5);
                    String tel = rs.getString(6);
                    String email = rs.getString(7);
                    String address = rs.getString(8);
                    stu = new Stu(stuid, stuname, age, sex, birthday, tel, email, address);
                    list.add(stu);
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
        return list;
    }

    //�з���ֵ���� �޸��������� ���޲�����-------------------------------------------------------------
    @Override
    public ArrayList<Stu> findAllStuInfo() {
        ArrayList<Stu> list = new ArrayList<>();
        Stu stu = null;
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "select * from  stu ";
                pstmt = conn.prepareStatement(sql);
                // ִ��
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    int stuid = rs.getInt(1);
                    String stuname = rs.getString(2);
                    int age=rs.getInt(3);
                    String sex = rs.getString(4);
                    Date birthday = rs.getDate(5);
                    String tel = rs.getString(6);
                    String email = rs.getString(7);
                    String address = rs.getString(8);
                    stu = new Stu(stuid, stuname, age, sex, birthday, tel, email, address);
                    list.add(stu);
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delStu() {
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "delete from stu where stuid=10";
                pstmt = conn.prepareStatement(sql);
                // ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("����ɾ���ɹ���");
                    flag = true;
                } else {
                    System.out.println("����ɾ��ʧ�ܣ�");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateStu() {
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "update stu set age=20 where stuid=3" ;
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
        }
        return flag;
    }

    @Override
    public boolean addStu() {
        //�����ݿ�����
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";

            //����Ԥ����
            try {
                pstmt = conn.prepareStatement(sql);
                //ע������
                pstmt.setInt(1, 15);
                pstmt.setString(2, "Ann");
                pstmt.setInt(3, 16);
                pstmt.setString(4, "��");
                pstmt.setDate(5, new Date(System.currentTimeMillis()));
                pstmt.setString(6, "15555173209");
                pstmt.setString(7, "syjy@163.com.cn");
                pstmt.setString(8, "������");
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
            }
        }
        return flag;

    }

    //�޷���ֵ���� �в������� ------------------------------------------------------------
    @Override
    public void addStu1(Stu stu) {
        //�����ݿ�����
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";
            //����Ԥ����
            try {
                pstmt = conn.prepareStatement(sql);
                //ע������
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setInt(3, stu.getAge());
                pstmt.setString(4, stu.getSex());
                pstmt.setDate(5, (Date) stu.getBirthday());
                pstmt.setString(6, stu.getTel());
                pstmt.setString(7, stu.getEmail());
                pstmt.setString(8, stu.getAddress());
                //ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("���ݲ���ɹ�");
                } else {
                    System.out.println("���ݲ���ʧ��");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delStu1(int stuid) {
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "delete from stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("����ɾ���ɹ���");
                } else {
                    System.out.println("����ɾ��ʧ�ܣ�");

                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }

    }

    @Override
    public void updateStu1(int stuid, int age) {
        //�����ݿ�����
        conn = getConn();
        try {
            if (conn != null) {
                // sql��
                String sql = "update stu set age=" + age + "where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // ִ��
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("���ݸ��³ɹ���");
                } else {
                    System.out.println("���ݸ���ʧ�ܣ�");
                }
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
    }

    @Override
    public void findBystuid1(int stuid) {//��ѯҪ�з���ֵ

    }


    //�޷���ֵ���� ������ -----------------------------------------------------------

    @Override
    public void addStu2() {
        // �����ݿ�����
        conn = getConn();

        try {
            if (conn != null) {
                // sql��
                String sql = "insert into Stu values(12,'jack',20,'��',sysdate,'13912546541',default,'�������ڷɿƼ�԰')";
                pstmt = conn.prepareStatement(sql);
                // ִ��
                pstmt.executeUpdate();
                System.out.println("����ɹ���");
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }

    }

    @Override
    public void delStu2() {
        // �����ݿ�����
        conn = getConn();

        try {
            if (conn != null) {
                // sql��
                String sql = "delete from stu where stuid=4";
                pstmt = conn.prepareStatement(sql);
                // ִ��
                pstmt.executeUpdate();
                System.out.println("ɾ���ɹ���");
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
    }
    @Override
    public void updateStu2() {
        // �����ݿ�����
        conn = getConn();

        try {
            if (conn != null) {
                // sql��
                String sql = "update stu set age=24,email='jack@163.com.cn' where stuid=1";
                pstmt = conn.prepareStatement(sql);
                // ִ��
                pstmt.executeUpdate();
                System.out.println("�޸ĳɹ���");
            }
        } catch (Exception e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }

    }

    @Override
    public void findBystuid2() {//��ѯҪ�з���ֵ

    }


}
