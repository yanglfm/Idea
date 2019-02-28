package DemoDay07;

import oracle.jdbc.OracleTypes;


import java.sql.*;

public class Test11 {
    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
       //�����洢Ԥ������ �����������
        CallableStatement callstmt = conn.prepareCall("{call p_findByDName(?,?)}");
        //ע�����
        callstmt.setString(1,"SALES");
        //ע���������
        callstmt.registerOutParameter(2, OracleTypes.CURSOR);
        // ִ�д洢����
        callstmt.execute();
        //���ؽ��
        ResultSet rs = (ResultSet)callstmt.getObject(2);
        while(rs.next()){
           // String  ename =rs.getString();
            Double sal=rs.getDouble(2);
            System.out.println(sal);
        }


    }
}
