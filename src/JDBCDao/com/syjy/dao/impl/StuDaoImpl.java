package JDBCDao.com.syjy.dao.impl;

import JDBCDao.com.syjy.bean.Stu;
import JDBCDao.com.syjy.com.syjy.dao.IStuDao;
import JDBCDao.com.syjy.util.BaseDao;

import java.sql.*;
import java.util.ArrayList;

public class StuDaoImpl extends BaseDao implements IStuDao {
    //属性
    boolean flag;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Stu stu = null;
    //有返回值类型 有条件
    @Override
    public boolean addStu(Stu stu) {
        //打开数据库连接
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";
            //进入预处理
            try {
                pstmt = conn.prepareStatement(sql);
                //注入数据
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setInt(3, stu.getAge());
                pstmt.setString(4, stu.getSex());
                pstmt.setDate(5, (Date) stu.getBirthday());
                pstmt.setString(6, stu.getTel());
                pstmt.setString(7, stu.getEmail());
                pstmt.setString(8, stu.getAddress());
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
            }
        }
        return flag;
    }

    @Override
    public boolean delStu(int stuid) {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "delete from stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据删除成功！");
                    flag = true;
                } else {
                    System.out.println("数据删除失败！");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public boolean updateStu(int stuid, int age) {//给定特定的更新的内容是什么
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "update stu set age=" + age + "where stuid=" + stuid;
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
        }
        return flag;
    }

    @Override
    public Stu findBystuid(int stuid) {//查询单个学生信息，并返回Stu
        Stu stu = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from  stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
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
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return stu;
    }

    @Override
    public ArrayList<Stu> findStuInfo(int age) {//查询得到多个学生信息，并返回集合
        ArrayList<Stu> list = new ArrayList<>();
        Stu stu = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from  stu where age=" + age;
                pstmt = conn.prepareStatement(sql);
                // 执行
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
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return list;
    }

    //有返回值类型 无给定的条件 （无参数）-------------------------------------------------------------
    @Override
    public ArrayList<Stu> findAllStuInfo() {
        ArrayList<Stu> list = new ArrayList<>();
        Stu stu = null;
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "select * from  stu ";
                pstmt = conn.prepareStatement(sql);
                // 执行
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
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delStu() {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "delete from stu where stuid=10";
                pstmt = conn.prepareStatement(sql);
                // 执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据删除成功！");
                    flag = true;
                } else {
                    System.out.println("数据删除失败！");
                    flag = false;
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateStu() {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "update stu set age=20 where stuid=3" ;
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
        }
        return flag;
    }

    @Override
    public boolean addStu() {
        //打开数据库连接
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";

            //进入预处理
            try {
                pstmt = conn.prepareStatement(sql);
                //注入数据
                pstmt.setInt(1, 15);
                pstmt.setString(2, "Ann");
                pstmt.setInt(3, 16);
                pstmt.setString(4, "男");
                pstmt.setDate(5, new Date(System.currentTimeMillis()));
                pstmt.setString(6, "15555173209");
                pstmt.setString(7, "syjy@163.com.cn");
                pstmt.setString(8, "苏州市");
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
            }
        }
        return flag;

    }

    //无返回值类型 有参数条件 ------------------------------------------------------------
    @Override
    public void addStu1(Stu stu) {
        //打开数据库连接
        conn = getConn();
        if (conn != null) {
            String sql = "insert into stu values(?,?,?,?,?,?,?,?)";
            //进入预处理
            try {
                pstmt = conn.prepareStatement(sql);
                //注入数据
                pstmt.setInt(1, stu.getStuid());
                pstmt.setString(2, stu.getStuName());
                pstmt.setInt(3, stu.getAge());
                pstmt.setString(4, stu.getSex());
                pstmt.setDate(5, (Date) stu.getBirthday());
                pstmt.setString(6, stu.getTel());
                pstmt.setString(7, stu.getEmail());
                pstmt.setString(8, stu.getAddress());
                //执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据插入成功");
                } else {
                    System.out.println("数据插入失败");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delStu1(int stuid) {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "delete from stu where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据删除成功！");
                } else {
                    System.out.println("数据删除失败！");

                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

    @Override
    public void updateStu1(int stuid, int age) {
        //打开数据库连接
        conn = getConn();
        try {
            if (conn != null) {
                // sql文
                String sql = "update stu set age=" + age + "where stuid=" + stuid;
                pstmt = conn.prepareStatement(sql);
                // 执行
                int i = pstmt.executeUpdate();
                if (i > 0) {
                    System.out.println("数据更新成功！");
                } else {
                    System.out.println("数据更新失败！");
                }
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    @Override
    public void findBystuid1(int stuid) {//查询要有返回值

    }


    //无返回值类型 无条件 -----------------------------------------------------------

    @Override
    public void addStu2() {
        // 打开数据库连接
        conn = getConn();

        try {
            if (conn != null) {
                // sql文
                String sql = "insert into Stu values(12,'jack',20,'男',sysdate,'13912546541',default,'苏州市腾飞科技园')";
                pstmt = conn.prepareStatement(sql);
                // 执行
                pstmt.executeUpdate();
                System.out.println("插入成功！");
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

    @Override
    public void delStu2() {
        // 打开数据库连接
        conn = getConn();

        try {
            if (conn != null) {
                // sql文
                String sql = "delete from stu where stuid=4";
                pstmt = conn.prepareStatement(sql);
                // 执行
                pstmt.executeUpdate();
                System.out.println("删除成功！");
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }
    @Override
    public void updateStu2() {
        // 打开数据库连接
        conn = getConn();

        try {
            if (conn != null) {
                // sql文
                String sql = "update stu set age=24,email='jack@163.com.cn' where stuid=1";
                pstmt = conn.prepareStatement(sql);
                // 执行
                pstmt.executeUpdate();
                System.out.println("修改成功！");
            }
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }

    @Override
    public void findBystuid2() {//查询要有返回值

    }


}
