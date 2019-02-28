package StudentMS.com.bochy.menu;

import StudentMS.com.bochy.biz.StudentBiz;
import StudentMS.com.bochy.biz.impl.StudentBizImpl;
import StudentMS.com.bochy.dao.StudentDao;
import StudentMS.com.bochy.dao.impl.AdminDaoImpl;
import StudentMS.com.bochy.dao.impl.StudentDaoImpl;
import StudentMS.com.bochy.entity.Student;

import java.util.Scanner;

public class ChoiceMenu {

    public static int choice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************请选择要操作的信息对应数字**********************************");
        System.out.println("*1.查看学生信息"+"\t\t"+"2.添加学生信息"+"\t\t"+"3.删除学生信息"+"\t\t"+"4.修改学生信息"+"\t\t"+"5.退出*");
        System.out.println("***************************************************************************************************");
        System.out.println("请选择：");
        int choice=sc.nextInt();
        getChoice(choice);
        return 1;
    }
    public static int getChoice(int i){
        Scanner sc = new Scanner(System.in);
        StudentBiz studentBiz=new StudentBizImpl();

        switch (i){
            case 1:
                System.out.println("-----------------------------------------查询学生信息---------------------------------------");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+    1.查看所有学生信息"+"\t\t"+"2.根据id学生信息"+"\t\t"+"3.根据id查询学生姓名"+"\t\t"+"4.返回上一层"+"\t\t+");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("请选择菜单:");
                int choice1=sc.nextInt();
                studentBiz.findInfo(choice1);
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("数据查询完毕，系统将自动返回目录......");
                return getChoice(i);

            case 2:
                System.out.println("*************************************添加学生信息**********************************************");
                String s2 = studentBiz.addStudent();
                System.out.println(s2);
                return choice();

            case 3:
                System.out.println("--------------------------------------删除学生信息---------------------------------------------");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("1.删除所有学生信息"+"\t\t"+"2.根据学生id删除信息"+"\t\t"+"3.返回上级目录"+"\t\t"+"4.系统退出"+"\t\t");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("请选择：");
                int choice3=sc.nextInt();
                boolean b = studentBiz.delStudent(choice3);
                if (b){
                    System.out.println("数据删除完毕，系统将自动返回目录......");
                }
                return choice();
            case 4:
                System.out.println("----------------------------------------修改学生信息------------------------------------------");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("1.根据id修改学生全部信息"+"\t\t"+"2.根据id修改学生部分信息"+"\t\t"+"3.返回上级目录"+"\t\t"+"4.系统退出"+"\t\t");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("请选择:");
                int choice4=sc.nextInt();
                studentBiz.updateStudent(choice4);

                return choice();

            case 5://系统退出
                System.out.println("系统退出");
                System.exit(0);
                break;
        }
        return 1;
    }


    }


