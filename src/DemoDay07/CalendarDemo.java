package DemoDay07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
       // SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��");
        Date date=new Date();
       /* try {*/
           // date = format.parse("2009��05��");
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("" + dayOfMonth + "��");
      /*  } catch (ParseException e) {
            e.printStackTrace();
        }*/
        dayNum();

    }
    public static void dayNum(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("���������");
        int year = scanner.nextInt();
        System.out.println("�������·�");
        int month = scanner.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0); //��������Ϊint����
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "��" + month + "����" + dayOfMonth + "��");
    }

}
