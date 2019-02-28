package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws Exception {
        //��������
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //��������������
        //ʹ���������
        Statement stmt = conn.createStatement();
        //����sql��
        //��������̨����
        //��ѯstu����ÿ���ֶε����ƺ���������
        String  sql1="select * from STU";
        PreparedStatement pstmt = conn.prepareStatement(sql1);//Ԥ������
        ResultSet rs = pstmt.executeQuery();
      //  ResultSet rs=stmt.executeQuery(sql1);
        ResultSetMetaData metaData = rs.getMetaData();
        //�Ȼ�ȡ�õ�һ���ж����еļ�¼��
        int columnCount = metaData.getColumnCount();
        //ʹ��ѭ������
        for (int i = 1; i <=columnCount ; i++) {//�ӵ�һ�п�ʼ
            //��ȡ������:������һ��
            System.out.println(metaData.getColumnName(i));
            System.out.println(metaData.getColumnLabel(i));
            //��ȡ�е���������
            System.out.println(metaData.getColumnTypeName(i)+"\n");
        }
        /*    for (int i = 0; i <columnCount ; i++) {
            System.out.println(metaData.getColumnName(i+1));
            System.out.println(metaData.getColumnTypeName(i+1));
        }*/

        rs.close();
        stmt.close();
        conn.close();


    }
}
