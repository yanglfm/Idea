package DemoDay0911;

import java.util.Date;



public class Time {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="";

        java.util.Date utilDate=new Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        java.sql.Time sTime=new java.sql.Time(utilDate.getTime());
        java.sql.Timestamp stp=new java.sql.Timestamp(utilDate.getTime());
        System.out.println(sqlDate);//2018-09-11
        System.out.println(sTime);//10:49:27
        System.out.println(stp);//2018-09-11 10:49:27.184
       /* ���Կ���date��������
        time��ʱ�䣬��Timestamp ������+ʱ��
        ��ʹ��PreparedStatement�����������͵�����ʱ�򣬿���ʹ��setDate��������Ҳ����ʹ��setTimestamp�������档
        �����ǣ�setDate��������������ڸ�ʽ
        setTimestamp�����������+ʱ��
        ��ʵPreparedStatement����setTime��������java.sql.Time���ƣ���˼�ǽ�ʱ�䱣�浽����
        ����ʹ�ã�*/
        //��һ�ֱ������ڣ�
    /*    ptmt.setDate(1, new java.sql.Date(System.currentTimeMillis());
        //��
        java.util.Date d = new java.util.Date();
        ptmt.setDate(1, java.sql.Date.valueOf(d.toLocaleString);
        //����
        java.util.Date d = new java.util.Date();
        ptmt.setDate(1, java.sql.Date.valueOf(date.getTime());
        //�ڶ��֣���������+ʱ��
        ptmt.setTimestamp(j+1, new java.sql.Timestamp(d.getTime()));*/
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        }
}
