package DemoDay03.Afternoon.Test;


import java.util.Date;

public class Test2<c> {//�ɱ䳤������ϰ
    public static void main(String[] args) {

        Test2.show("����","����","����","����");
        //��������
        String  []strs={"����","����","����","����"};
        Test2.show(strs);
        //����ֱ�Ӵ��Σ���������
        //����ͬ���͵����ݴ������
        Date  d=new Date();
        Object obj=new Object();
        String str=new String();
        Test2.show1(d,obj,str);//ͨ��������дObject�ĳ���������
        Test2.show2(Date.class,Object.class,String.class);
        //����дΪ
        Test2.show2(d.getClass(),obj.getClass(),str.getClass());
    }
    //��дString���͵Ŀɱ䳤����
    public static void show(String...strings){//�ɱ䳤��������strings���������Ĳ�������һ�������ˣ���һ��ѭ������Ϳ�����
        for(int i=0;i<strings.length;i++){//����һ������
            System.out.println(strings[i]);
        }
    }
    //����ò����Ƕ��󣿣�����Date String Demo
    public static void show1(Object...objects){//�ɱ䳤��������strings���������Ĳ�������һ�������ˣ���һ��ѭ������Ϳ�����
        for(int i=0;i<objects.length;i++){//����һ������
            System.out.println(objects[i]);
        }
    }
    //��Class��ʾ����дClass���͵Ŀɱ䳤����
    public static void show2(Class...c){//�ɱ䳤��������strings���������Ĳ�������һ�������ˣ���һ��ѭ������Ϳ�����
        for(int i=0;i<c.length;i++){//����һ������
            System.out.println(c[i]);
        }
    }
}
