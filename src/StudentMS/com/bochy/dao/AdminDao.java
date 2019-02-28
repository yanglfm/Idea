package StudentMS.com.bochy.dao;

import StudentMS.com.bochy.entity.Admin;

public interface AdminDao {

  //登录对象与数据库连接
    Admin Login(Admin admin);

}
