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
       /* 可以看出date是年月日
        time是时间，而Timestamp 是日期+时间
        在使用PreparedStatement保存日期类型的数据时候，可以使用setDate方法保存也可以使用setTimestamp方法保存。
        区别是：setDate方法保存的是日期格式
        setTimestamp保存的是日期+时间
        其实PreparedStatement还有setTime方法，和java.sql.Time类似，意思是将时间保存到表中
        具体使用：*/
        //第一种保存日期：
    /*    ptmt.setDate(1, new java.sql.Date(System.currentTimeMillis());
        //或
        java.util.Date d = new java.util.Date();
        ptmt.setDate(1, java.sql.Date.valueOf(d.toLocaleString);
        //或者
        java.util.Date d = new java.util.Date();
        ptmt.setDate(1, java.sql.Date.valueOf(date.getTime());
        //第二种：保存日期+时间
        ptmt.setTimestamp(j+1, new java.sql.Timestamp(d.getTime()));*/
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
        }
        }
}
