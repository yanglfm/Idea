package DemoDay07;

import oracle.jdbc.driver.OracleTypes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class QueryEmpTest3 {
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
            callstmt = conn.prepareCall("{call p_findByDeptid(?,?,?)}");

            //ע�����
            callstmt.setInt(1, 7499);
            //ע���������
            callstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            callstmt.registerOutParameter(3, OracleTypes.DOUBLE);

            //ִ�д洢����
            callstmt.execute();
            //��ȡ����
            String ename = callstmt.getString(2);
            Double sal= callstmt.getDouble(3);

            System.out.println(ename+"\t\t"+sal);

        } catch (ClassNotFoundException e) {
            // java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver �����Ҳ���
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
