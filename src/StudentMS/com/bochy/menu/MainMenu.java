package StudentMS.com.bochy.menu;

import StudentMS.com.bochy.biz.AdminBiz;
import StudentMS.com.bochy.biz.impl.AdminBizImpl;
import StudentMS.com.bochy.entity.Admin;

import java.util.Scanner;

public class MainMenu {
    public static Admin mainMenu() {
        ChoiceMenu choiceMenu=new ChoiceMenu();
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------��ӭ��¼ѧ����Ϣ����ϵͳ---------------------");
        System.out.println("1.��¼"+"\t\t"+"2.�˳�");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("��ѡ��:");
        int choice=sc.nextInt();
        AdminBiz adminLogin=new AdminBizImpl();
        Admin admin = adminLogin.login();
        switch (choice){
            case 1:
                if (admin==null) {
                    return mainMenu();
                }else {
                    System.out.println("��¼�ɹ�");
                    System.out.println("��ӭ����"+admin.getUsername());
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
