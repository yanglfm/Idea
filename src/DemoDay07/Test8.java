package DemoDay07;

import java.sql.*;

public class Test8 {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //�������
        String sql="insert into bank(username,balance) values(?,?)";
        //Ԥ����Ĳ��뷽ʽ
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //�����ݽ���ע��
        pstmt.setString(1,"����");
        pstmt.setInt(2,1280);
        int count = pstmt.executeUpdate();
        if(count>0){
            System.out.println("����ɹ�");
        }else{
            System.out.println("����ʧ��");
        }
        conn.close();

    }
}
