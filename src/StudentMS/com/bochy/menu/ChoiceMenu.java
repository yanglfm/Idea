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
        System.out.println("****************************************��ѡ��Ҫ��������Ϣ��Ӧ����**********************************");
        System.out.println("*1.�鿴ѧ����Ϣ"+"\t\t"+"2.���ѧ����Ϣ"+"\t\t"+"3.ɾ��ѧ����Ϣ"+"\t\t"+"4.�޸�ѧ����Ϣ"+"\t\t"+"5.�˳�*");
        System.out.println("***************************************************************************************************");
        System.out.println("��ѡ��");
        int choice=sc.nextInt();
        getChoice(choice);
        return 1;
    }
    public static int getChoice(int i){
        Scanner sc = new Scanner(System.in);
        StudentBiz studentBiz=new StudentBizImpl();

        switch (i){
            case 1:
                System.out.println("-----------------------------------------��ѯѧ����Ϣ---------------------------------------");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("+    1.�鿴����ѧ����Ϣ"+"\t\t"+"2.����idѧ����Ϣ"+"\t\t"+"3.����id��ѯѧ������"+"\t\t"+"4.������һ��"+"\t\t+");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("��ѡ��˵�:");
                int choice1=sc.nextInt();
                studentBiz.findInfo(choice1);
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");
                return getChoice(i);

            case 2:
                System.out.println("*************************************���ѧ����Ϣ**********************************************");
                String s2 = studentBiz.addStudent();
                System.out.println(s2);
                return choice();

            case 3:
                System.out.println("--------------------------------------ɾ��ѧ����Ϣ---------------------------------------------");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("1.ɾ������ѧ����Ϣ"+"\t\t"+"2.����ѧ��idɾ����Ϣ"+"\t\t"+"3.�����ϼ�Ŀ¼"+"\t\t"+"4.ϵͳ�˳�"+"\t\t");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("��ѡ��");
                int choice3=sc.nextInt();
                boolean b = studentBiz.delStudent(choice3);
                if (b){
                    System.out.println("����ɾ����ϣ�ϵͳ���Զ�����Ŀ¼......");
                }
                return choice();
            case 4:
                System.out.println("----------------------------------------�޸�ѧ����Ϣ------------------------------------------");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("1.����id�޸�ѧ��ȫ����Ϣ"+"\t\t"+"2.����id�޸�ѧ��������Ϣ"+"\t\t"+"3.�����ϼ�Ŀ¼"+"\t\t"+"4.ϵͳ�˳�"+"\t\t");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("��ѡ��:");
                int choice4=sc.nextInt();
                studentBiz.updateStudent(choice4);

                return choice();

            case 5://ϵͳ�˳�
                System.out.println("ϵͳ�˳�");
                System.exit(0);
                break;
        }
        return 1;
    }


    }


