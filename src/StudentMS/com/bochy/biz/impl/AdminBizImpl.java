package StudentMS.com.bochy.biz.impl;

import StudentMS.com.bochy.biz.AdminBiz;
import StudentMS.com.bochy.dao.AdminDao;
import StudentMS.com.bochy.dao.impl.AdminDaoImpl;
import StudentMS.com.bochy.entity.Admin;

import java.util.Scanner;

public class AdminBizImpl implements AdminBiz {

    @Override
    public Admin login() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.next();
        System.out.println("请输入密码：");
        String password=sc.next();
        Admin admin=new Admin(username,password);
        AdminDao adminDao=new AdminDaoImpl();
        Admin admin1 = adminDao.Login(admin);
        return admin1;
    }
}
