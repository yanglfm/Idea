package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Connection conn = null;
        Statement stmt=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");//�������д���ô���ֻ����һ��

            //��ȡ���������
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tom","123456");

            //�������
            //��������������
            stmt = conn.createStatement();
            //����sql��
            //�����޸�
            System.out.println("�������û���:");
            String str1=sc.next();
            System.out.println("�������޸ĵĽ��");
            int i=sc.nextInt();
            String sql5="update bank set balance=? where username=?";
            //����ɾ��
            //String sql7="delete from bank where user ";
            ps=conn.prepareStatement(sql5);
            ps.setString(1,str1);
            ps.setInt(2,i);
            //��ѯ���
            String sql6="select username,balance  from BANK";
            //ִ��
            stmt.executeUpdate(sql5);

            rs = stmt.executeQuery(sql6);

        while (rs.next()){
                //���Ϊtrue ���������л�������
                //�����е�ÿһ�и���ô��ȡ��
                // ͨ��ÿһ�е�����������ʹ��getXX���� �����ֶ��� ����ȡ���е�����
                String username = rs.getString(1);
                int password = rs.getInt(2);
                System.out.println("username "+username +"\t password:"+password);

            }

rs.close();
                stmt.close();
                conn.close();



    }
}
