package DemoDay07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
       // SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月");
        Date date=new Date();
       /* try {*/
           // date = format.parse("2009年05月");
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("" + dayOfMonth + "天");
      /*  } catch (ParseException e) {
            e.printStackTrace();
        }*/
        dayNum();

    }
    public static void dayNum(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0); //输入类型为int类型
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月有" + dayOfMonth + "天");
    }

}
