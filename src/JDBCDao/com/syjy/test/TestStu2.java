package JDBCDao.com.syjy.test;

import JDBCDao.com.syjy.bean.Stu;
import JDBCDao.com.syjy.service.StuService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
//��ɾ�Ĳ� ������ �з���ֵ����
public class TestStu2 {
    public static void main(String[] args) {
        //
        StuService stuService=new StuService();
        Scanner sc=new Scanner(System.in);
        System.out.println("���������ڣ�yyyy-mm-dd");
        String str=sc.next();
        Date date = Date.valueOf(str);
        Stu stu1=new Stu(11,"LU",20,"��", date,"13212546456", "kk@163.com.cn", "�������ڷɿƼ�԰");
        stuService.addStu(stu1);
          /*
        Scanner sc=new Scanner(System.in);
        System.out.println("���������ڣ�yyyy-mm-dd");
        String str=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = date.getTime();

        //���ѧ����Ϣ
       Stu stu1=new Stu(8,"LU",20,"��", new java.sql.Date(time),"13212546456", "kk@163.com.cn", "�������ڷɿƼ�԰");


        stuService.addStu(stu1);*/
    /*
       //����������ɾ�Ĳ飺
       //ɾ��ѧ����Ϣ
        boolean b = stuService.delStu(2);
        System.out.println(b);*/

        //�޸�ѧ����Ϣ������ѧ��ѧ���޸�����
  /*    boolean b1 = stuService.updateStu(2, 25);
        System.out.println(b1);*/

        //��ѯ����ѧ����Ϣ
        Stu stu = stuService.findBystuid(3);
        System.out.println(stu.getStuName()+"\t\t"+stu.getBirthday());

        //��ѯ����ѧ����Ϣ����������age=20
        ArrayList<Stu> list = stuService.findStuInfo(20);
        for (Stu stu5 : list) {
            System.out.println(stu5.getStuName()+"\t\t"+stu5.getAddress());
        }
        //û����������ɾ�Ĳ�
        //
        //��ѯ����ѧ����Ϣ��û������
        ArrayList<Stu> list1 = stuService.findAllStuInfo();
        for (Stu stu6 : list1) {
            System.out.println(stu6.getStuName()+"\t\t"+stu6.getAddress());
        }

    }
}
