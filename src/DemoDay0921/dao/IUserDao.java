package DemoDay0921.dao;

import DemoDay0921.bean.Users;

import java.util.List;

public interface IUserDao {
    public boolean login (String username,String password);
    public boolean login(Users u);
    public Users login2(Users u);
    public List<Users> findAllUser();
    //�����û��������û�����
    public Users findByUserName(String userName);
}
