package DemoDay03.Afternoon.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //�����
        Class c1=Class.forName("java.util.Date");//����Date��
        Object obj=c1.newInstance();//����ʵ����������obj����
        Date date=(Date)obj;
        if(obj instanceof Date){//�ж�obj�Ƿ�����Date��
            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh: mm :ss").format(date));
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh: mm :ss");
        System.out.println(sdf.format(date));
    }
}
