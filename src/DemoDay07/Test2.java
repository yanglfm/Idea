package DemoDay07;

import java.sql.*;

public class Test2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt=null;
        ResultSet rs=null;
            try {
                //��������
                Class.forName("oracle.jdbc.driver.OracleDriver");//�������д���ô���ֻ����һ��

                //��ȡ���������
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tom","123456");

                //�������
                //��������������
                stmt = conn.createStatement();

                //����sql��
                String sql="insert into bank values('jack',1003)";
                String sql4="insert into bank values('jack',1003)";
                String sql2 = "select * from EMP";
                String sql3 = "select * from card";
                conn.prepareStatement(sql2);
                conn.prepareStatement(sql3);
                conn.prepareStatement(sql4);
             //�����޸�
                String sql5="update bank set balance=800 where username='jack'";
                //����ɾ��
                String sql7="delete ";
               //��ѯ���
                String sql6="select empno,ename,sal,deptno  from EMP";
                //ִ��
               rs = stmt.executeQuery(sql6);
                while (rs.next()){
                    //���Ϊtrue ���������л�������
                    //�����е�ÿһ�и���ô��ȡ��
                    // ͨ��ÿһ�е�����������ʹ��getXX��������ȡ���е�����
                    int empno = rs.getInt(1);//����������Ų�����д�������ֶε�����˳��д��
                    String ename = rs.getString(2);
                    double sal = rs.getDouble(3);
                    int deptno = rs.getInt(4);
                    System.out.println("empno"+empno+"\t ename:"+ename+"\t sal:"+sal+"\t deptno:"+deptno);

                }
                int count = stmt.executeUpdate(sql5);
                if(count>0) {
                    System.out.println("����ɹ���");
                }else {
                    System.out.println("����ʧ�ܣ�");
                }

//			System.out.println("���ݿ����ӳɹ�");
            } catch (ClassNotFoundException e) {
                // java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver �����Ҳ���
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO �Զ����ɵ� catch ��
                e.printStackTrace();
            }finally {
                try {
                    //��Դ�ر�
                    stmt.close();
                    rs.close();
                    conn.close();
                } catch (SQLException e) {
                    // TODO �Զ����ɵ� catch ��
                    e.printStackTrace();
                }
            }
        }
    }

