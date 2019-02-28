package DemoDay07;

import oracle.jdbc.driver.OracleTypes;

import java.sql.*;


public class QueryEmpTest2 {

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement callstmt=null;
        try {
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            String username="tom";
            String password="123456";
            //��ȡ���������
            conn = DriverManager.getConnection(url, username, password);

            //�����洢Ԥ������ �����������
            callstmt = conn.prepareCall("{call p_findByDName(?,?)}");

            //ע�����:��������Ĳ������Ʋ�ѯԱ����Ϣ
            callstmt.setString(1, "SALES");
            //ע���������
            callstmt.registerOutParameter(2, OracleTypes.CURSOR);
            //ִ�д洢����
            callstmt.execute();
            //���ؽ��
            ResultSet rs = (ResultSet) callstmt.getObject(2);
            System.out.println( "ename"+ "\t\t" +"sal");
            while(rs.next())
                System.out.println(rs.getString(1) + "\t\t" + rs.getDouble(2));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }finally {
            try {
                //��Դ�ر�
                callstmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO �Զ����ɵ� catch ��
                e.printStackTrace();
            }
        }
    }
}
