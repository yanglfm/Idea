package Exam.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class UserDaoImpl extends BaseDao implements IUserDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	//public static Logger logger = Logger.getLogger(UserDaoImpl.class);
	@Override
	public boolean login(String username, String password) {
		boolean flag = false;
		try {
			// 开启数据库连接
			conn = getConn();
			// 书写查询语句
			String sql = "select * from users where username=? and password=?";
			// 预编译
			pstmt = conn.prepareStatement(sql);
			// 注入参数
			pstmt.setString(1, username);
			pstmt.setString(2, password);

			// 执行
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 代表找到
				if (rs.getString(2).equals(username) && rs.getString(3).equals(password)) {
					flag = true;
				}

			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean login(Users u) {
		boolean flag = false;
		try {
			// 开启数据库连接
			conn = getConn();
			// 书写查询语句
			String sql = "select * from users where username=? and password=?";
			// 预编译
			pstmt = conn.prepareStatement(sql);
			// 注入参数
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2, u.getPassword());

			// 执行
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 代表找到
				if (rs.getString(2).equals(u.getUsername()) && rs.getString(3).equals(u.getPassword())) {
					flag = true;
				}

			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Users login2(Users u) {
		Users u2 = null;
		try {
			// 开启数据库连接
			conn = getConn();
			// 书写查询语句
			String sql = "select * from users where username=? and password=?";
			// 预编译
			pstmt = conn.prepareStatement(sql);
			// 注入参数
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2, u.getPassword());

			// 执行
			rs = pstmt.executeQuery();
			if (rs != null) {
				// 代表找到
				u2 = u;

			}

		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return u2;
	}

	@Override
	public List<Users> findAllUser() {
		List<Users> users = new ArrayList<>();
		try {
			// 开启数据库连接
			conn = getConn();
			// 书写查询语句
			String sql = "select * from users";
		//	logger.info(sql);
			// 预编译
			pstmt = conn.prepareStatement(sql);
			// 执行
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int userid = rs.getInt(1);
				String username = rs.getString(2);
				String password = rs.getString(3);
				String tel = rs.getString(4);
				String isAdmin = rs.getString(5);
				Users u = new Users(userid, username, password, tel, isAdmin);
				users.add(u);

			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public Users findByUserName(String userName) {
		Users user = null;
		List<Users> users = findAllUser();
		for (Users u : users) {
		//	logger.info("用户名比较："+u.getUsername()+":"+userName);
			if (u.getUsername().equals(userName)) {
				user = u;
				break;
			}
		}
		return user;
	}

	public static void main(String[] args) {
		IUserDao dao = new UserDaoImpl();
		// System.out.println(dao.login("zhangsan", "123456"));

		// Users u = new Users();
		// u.setUsername("lisi");
		// u.setPassword("123456");
		// System.out.println(dao.login(u));

		// Users u = new Users();
		// u.setUsername("jack");
		// u.setPassword("123456");
		// Users u2 = dao.login2(u);
		// System.out.println(u2.getUsername() + " " + u2.getPassword());

		List<Users> users = dao.findAllUser();
		System.out.println(users.size());
	}

	@Override
	public boolean modifyUserById(String username, Users user) {
		int index = -1;
		List<Users> users = findAllUser();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(username)) {
				// 记录相同名字对应元素的下标
				index = i;
				break;
			}
		}
		if (index != -1) {
			users.set(index, user);
			// 修改
			try {
				conn = getConn();
				String sql = "update users set isAdmin=? where username=?";
				pstmt = conn.prepareStatement(sql);
				// 注入参数
				pstmt.setString(1, user.getIsAdmin());
				pstmt.setString(2, user.getUsername());
		//		logger.info(sql);
				// 执行
				pstmt.executeUpdate();
				System.out.println("修改成功");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}

			return true;
		}
		return false;
	}

	/**
	 * 分页方法
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<Users> findUsers(int currentPage, int pageSize) {

		List<Users> listpage = new ArrayList();
		List<Users> list = findAllUser();
		int listLength = list.size();
		if (currentPage < 1) {
			currentPage = 1;
		}
		int startIndex = (currentPage - 1) * pageSize;
		int endIndex = startIndex + pageSize;

		if (endIndex >= listLength) {
			endIndex = listLength;
		}
		listpage = list.subList(startIndex, endIndex);
		return listpage;
	}

}
