package JDBCDao.com.syjy.test;

import JDBCDao.com.syjy.bean.Stu;
import JDBCDao.com.syjy.service.StuService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
//增删改查 带条件 有返回值类型
public class TestStu2 {
    public static void main(String[] args) {
        //
        StuService stuService=new StuService();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入日期：yyyy-mm-dd");
        String str=sc.next();
        Date date = Date.valueOf(str);
        Stu stu1=new Stu(11,"LU",20,"男", date,"13212546456", "kk@163.com.cn", "苏州市腾飞科技园");
        stuService.addStu(stu1);
          /*
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入日期：yyyy-mm-dd");
        String str=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = date.getTime();

        //添加学生信息
       Stu stu1=new Stu(8,"LU",20,"男", new java.sql.Date(time),"13212546456", "kk@163.com.cn", "苏州市腾飞科技园");


        stuService.addStu(stu1);*/
    /*
       //有条件的增删改查：
       //删除学生信息
        boolean b = stuService.delStu(2);
        System.out.println(b);*/

        //修改学生信息：根据学生学号修改年龄
  /*    boolean b1 = stuService.updateStu(2, 25);
        System.out.println(b1);*/

        //查询单条学生信息
        Stu stu = stuService.findBystuid(3);
        System.out.println(stu.getStuName()+"\t\t"+stu.getBirthday());

        //查询多条学生信息：有条件：age=20
        ArrayList<Stu> list = stuService.findStuInfo(20);
        for (Stu stu5 : list) {
            System.out.println(stu5.getStuName()+"\t\t"+stu5.getAddress());
        }
        //没有条件的增删改查
        //
        //查询多条学生信息：没有条件
        ArrayList<Stu> list1 = stuService.findAllStuInfo();
        for (Stu stu6 : list1) {
            System.out.println(stu6.getStuName()+"\t\t"+stu6.getAddress());
        }

    }
}
