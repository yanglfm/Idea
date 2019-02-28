package StudentMS.com.bochy.biz.impl;

import StudentMS.com.bochy.biz.StudentBiz;
import StudentMS.com.bochy.dao.StudentDao;
import StudentMS.com.bochy.dao.impl.StudentDaoImpl;
import StudentMS.com.bochy.entity.Student;
import StudentMS.com.bochy.menu.ChoiceMenu;
import StudentMS.com.bochy.util.Matches;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentBizImpl implements StudentBiz {
    StudentDao studentDao = new StudentDaoImpl();
    Matches matches = new Matches();
    Scanner sc = new Scanner(System.in);
    ChoiceMenu choiceMenu = new ChoiceMenu();

    @Override
    public String addStudent() {//����ѧ����Ϣ
        String str;
        System.out.println("������ѧ��id:");
        int stuid = sc.nextInt();
        System.out.println("������ѧ������:");
        String stuName = sc.next();
        System.out.println("������ѧ���Ա�:");
        String sex = sc.next();
        System.out.println("������ѧ�����䣨ֻ��1-120֮�ڵ����֣�:");
        int age = sc.nextInt();
        System.out.println("������ѧ�������꼶��ֻ�ܳ������м����߼���:");
        String classType = sc.next();
        System.out.println("������ѧ����ַ:");
        String address = sc.next();
        System.out.println("������ѧ����ϵ��ʽ��11λ�ֻ����룩:");
        String tel = sc.next();
        System.out.println("������ѧ���������䣨����@��.com��:");
        String email = sc.next();
        Student stu = new Student(stuid, stuName, sex, age, classType, address, tel, email);
        StudentDao studentDao = new StudentDaoImpl();
        String s1 = matches.matchesTellphone(stu.getTel());
        String s2 = matches.matchesEmail1(stu.getEmail());
        if (s1 != null && s2 != null) {
            boolean b = studentDao.addStudent(stu);
            if (b == true) {
                str = "���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~";
                return str;
            } else {
                System.out.println("���ݲ����ϣ�������¼��");
                return addStudent();
            }
        } else {
            return addStudent();
        }

    }

    @Override
    public int updateStudent(int choice1) {//�޸�ѧ����Ϣ
        switch (choice1) {
            case 1:
                break;
            case 2:
                System.out.println("������Ҫ�޸ĵ�id:");
                int stuid = sc.nextInt();
                System.out.println("������Ҫ�޸ĵ����ԣ�");
                String str = sc.next();
                switch (str) {
                    case "stuName"://ͬage
                        break;
                    case "age":
                        System.out.println("�������޸ĺ�����ݣ�");
                        int age = sc.nextInt();
                        if (age >= 1 && age <= 120) {
                            studentDao.updateStudent(stuid, age);
                            System.out.println("�޸ĳɹ�");
                            System.out.println("ϵͳ���Զ������ϲ�Ŀ¼......");
                        } else {
                            return updateStudent(choice1);
                        }
                    case "sex"://ͬ��
                        break;
                    case "classType":
                        break;
                    case "address":
                        break;
                    case "tel":
                        break;
                    case "email":
                        break;
                    default:
                        System.out.println("���������������������");
                        return updateStudent(choice1);
                }
            case 3:
                return choiceMenu.choice();
            case 4:
                System.exit(0);

        }
        return 1;
    }

    @Override
    public Student findById() {//ͨ��ѧ��ѧ����������Ϣ
        return null;
    }


    @Override
    public int findInfo(int choice2) {//��ѯѧ����Ϣ
        switch (choice2) {
            case 1://��ѯ����ѧ����Ϣ
                ArrayList<Student> list = studentDao.findStuInfo();
                for (Student student1 : list) {
                    System.out.println(student1.toString());
                }
                break;
            case 2://����id��ѯѧ����Ϣ
                System.out.println("������Ҫ��ѯ��id:");
                int stuid2 = sc.nextInt();
                String studentinfo = studentDao.findBystuid(stuid2).toString();
                System.out.println(studentinfo);
                break;
            case 3://����id��ѯѧ������
                System.out.println("������Ҫ��ѯ��id:");
                int stuid3 = sc.nextInt();
                String stuName = studentDao.findBystuid(stuid3).getStuName();
                System.out.println(stuName);
            case 4:
                return choiceMenu.choice();//������һ��

        }
        return 1;
    }

    @Override
    public boolean delStudent(int choice) {//ɾ��ѧ����Ϣ
        switch (choice){
            case 1:
                System.out.println("ɾ������ѧ����Ϣ--����ʾ��");
                break;
            case 2:
                System.out.println("������Ҫɾ��ѧ����id��");
                int stuid=sc.nextInt();
                studentDao.delStudent(stuid);
                return true;
            case 3:
                choiceMenu.choice();//������һ�㣬���Բ���return
                break;
            case 4:
                System.exit(0);
        }
        return false;
    }


}
