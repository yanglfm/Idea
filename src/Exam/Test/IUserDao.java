package Exam.Test;

import java.util.List;



public interface IUserDao {

	public boolean login(String username, String password);
	
	public boolean login(Users u);
	
	public Users login2(Users u);

	public List<Users> findAllUser();
	
	//�����û��������û�����
	public Users findByUserName(String userName);
	
	public boolean modifyUserById(String userName, Users user);
	
	//��ҳ
	public List<Users> findUsers(int currentPage, int pageSize);
}
