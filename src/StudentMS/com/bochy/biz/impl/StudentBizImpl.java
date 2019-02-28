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
    public String addStudent() {//增加学生信息
        String str;
        System.out.println("请输入学生id:");
        int stuid = sc.nextInt();
        System.out.println("请输入学生姓名:");
        String stuName = sc.next();
        System.out.println("请输入学生性别:");
        String sex = sc.next();
        System.out.println("请输入学生年龄（只能1-120之内的数字）:");
        int age = sc.nextInt();
        System.out.println("请输入学生所属年级（只能初级、中级、高级）:");
        String classType = sc.next();
        System.out.println("请输入学生地址:");
        String address = sc.next();
        System.out.println("请输入学生联系方式（11位手机号码）:");
        String tel = sc.next();
        System.out.println("请输入学生电子邮箱（包含@和.com）:");
        String email = sc.next();
        Student stu = new Student(stuid, stuName, sex, age, classType, address, tel, email);
        StudentDao studentDao = new StudentDaoImpl();
        String s1 = matches.matchesTellphone(stu.getTel());
        String s2 = matches.matchesEmail1(stu.getEmail());
        if (s1 != null && s2 != null) {
            boolean b = studentDao.addStudent(stu);
            if (b == true) {
                str = "数据保存成功，系统将自动返回上层目录~";
                return str;
            } else {
                System.out.println("数据不符合，请重新录入");
                return addStudent();
            }
        } else {
            return addStudent();
        }

    }

    @Override
    public int updateStudent(int choice1) {//修改学生信息
        switch (choice1) {
            case 1:
                break;
            case 2:
                System.out.println("请输入要修改的id:");
                int stuid = sc.nextInt();
                System.out.println("请输入要修改的属性：");
                String str = sc.next();
                switch (str) {
                    case "stuName"://同age
                        break;
                    case "age":
                        System.out.println("请输入修改后的数据：");
                        int age = sc.nextInt();
                        if (age >= 1 && age <= 120) {
                            studentDao.updateStudent(stuid, age);
                            System.out.println("修改成功");
                            System.out.println("系统将自动返回上层目录......");
                        } else {
                            return updateStudent(choice1);
                        }
                    case "sex"://同上
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
                        System.out.println("属性输入错误，请重新输入");
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
    public Student findById() {//通过学生学号来查找信息
        return null;
    }


    @Override
    public int findInfo(int choice2) {//查询学生信息
        switch (choice2) {
            case 1://查询所有学生信息
                ArrayList<Student> list = studentDao.findStuInfo();
                for (Student student1 : list) {
                    System.out.println(student1.toString());
                }
                break;
            case 2://根据id查询学生信息
                System.out.println("请输入要查询的id:");
                int stuid2 = sc.nextInt();
                String studentinfo = studentDao.findBystuid(stuid2).toString();
                System.out.println(studentinfo);
                break;
            case 3://根据id查询学生姓名
                System.out.println("请输入要查询的id:");
                int stuid3 = sc.nextInt();
                String stuName = studentDao.findBystuid(stuid3).getStuName();
                System.out.println(stuName);
            case 4:
                return choiceMenu.choice();//返回上一层

        }
        return 1;
    }

    @Override
    public boolean delStudent(int choice) {//删除学生信息
        switch (choice){
            case 1:
                System.out.println("删除所有学生信息--不演示了");
                break;
            case 2:
                System.out.println("请输入要删除学生的id：");
                int stuid=sc.nextInt();
                studentDao.delStudent(stuid);
                return true;
            case 3:
                choiceMenu.choice();//返回上一层，可以不用return
                break;
            case 4:
                System.exit(0);
        }
        return false;
    }


}
