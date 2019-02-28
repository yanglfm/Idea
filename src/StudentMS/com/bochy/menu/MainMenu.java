package StudentMS.com.bochy.menu;

import StudentMS.com.bochy.biz.AdminBiz;
import StudentMS.com.bochy.biz.impl.AdminBizImpl;
import StudentMS.com.bochy.entity.Admin;

import java.util.Scanner;

public class MainMenu {
    public static Admin mainMenu() {
        ChoiceMenu choiceMenu=new ChoiceMenu();
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------欢迎登录学生信息管理系统---------------------");
        System.out.println("1.登录"+"\t\t"+"2.退出");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("请选择:");
        int choice=sc.nextInt();
        AdminBiz adminLogin=new AdminBizImpl();
        Admin admin = adminLogin.login();
        switch (choice){
            case 1:
                if (admin==null) {
                    return mainMenu();
                }else {
                    System.out.println("登录成功");
                    System.out.println("欢迎您，"+admin.getUsername());
                }
                choiceMenu.choice();
                break;
            case 2:
                System.exit(0);
                break;
        }
      return admin;

    }

}
