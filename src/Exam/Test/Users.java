package Exam.Test;

public class Users {
	private int userid;
	private String username;
	private String password;
	private String tel;
	private String isAdmin;

	public Users() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Users(int userid, String username, String password, String tel, String isAdmin) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.isAdmin = isAdmin;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

}
