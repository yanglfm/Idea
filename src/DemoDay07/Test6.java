package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws Exception {
        //��������
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //��������������
        Statement stmt = conn.createStatement();
        //����sql��
        //��������̨����
        Scanner sc=new Scanner(System.in);
        System.out.println("�������û���");
        String str=sc.next();
        System.out.println("�������޸ĵĽ��");
        int i=sc.nextInt();
        /*System.out.println("�������û���");
        String empno=sc.next();
        System.out.println("�������޸ĵĽ��");
        int sal=sc.nextInt();
        String sql3="update emp set sal="+sal+"whee empno="+empno;*/
        String sql1="update bank set balance='"+i+"' where username='" +str+ "'";//����¼��������޸���Ӧ��ֵ
        String sql2="select USERNAME,BALANCE from BANK";
        //ִ��where Name='" + name + "'"
        int executeUpdate = stmt.executeUpdate(sql1);//�����ִ�и��µ����
        //ִ��
        ResultSet rs = stmt.executeQuery(sql2);//ִ�в�������
        while(rs.next()){
            String username = rs.getString(1);
            int balance = rs.getInt(2);
            System.out.println(username+"---"+balance);
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}
