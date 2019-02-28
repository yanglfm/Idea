package DemoDay07;

import java.sql.*;

public class Test2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt=null;
        ResultSet rs=null;
            try {
                //加载驱动
                Class.forName("oracle.jdbc.driver.OracleDriver");//采用这个写法好处是只加载一次

                //获取程序的连接
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tom","123456");

                //插入语句
                //创建处理器对象
                stmt = conn.createStatement();

                //创建sql文
                String sql="insert into bank values('jack',1003)";
                String sql4="insert into bank values('jack',1003)";
                String sql2 = "select * from EMP";
                String sql3 = "select * from card";
                conn.prepareStatement(sql2);
                conn.prepareStatement(sql3);
                conn.prepareStatement(sql4);
             //创建修改
                String sql5="update bank set balance=800 where username='jack'";
                //创建删除
                String sql7="delete ";
               //查询语句
                String sql6="select empno,ename,sal,deptno  from EMP";
                //执行
               rs = stmt.executeQuery(sql6);
                while (rs.next()){
                    //如果为true 代表结果集中还有数据
                    //数据中的每一列该怎么获取，
                    // 通过每一列的数据类型来使用getXX方法来获取该列的数据
                    int empno = rs.getInt(1);//这里的索引号不能乱写，根据字段的排列顺序写的
                    String ename = rs.getString(2);
                    double sal = rs.getDouble(3);
                    int deptno = rs.getInt(4);
                    System.out.println("empno"+empno+"\t ename:"+ename+"\t sal:"+sal+"\t deptno:"+deptno);

                }
                int count = stmt.executeUpdate(sql5);
                if(count>0) {
                    System.out.println("插入成功！");
                }else {
                    System.out.println("插入失败！");
                }

//			System.out.println("数据库连接成功");
            } catch (ClassNotFoundException e) {
                // java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver 驱动找不到
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }finally {
                try {
                    //资源关闭
                    stmt.close();
                    rs.close();
                    conn.close();
                } catch (SQLException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
            }
        }
    }

