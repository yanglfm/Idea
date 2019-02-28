package JDBCDao.com.syjy.com.syjy.dao;

import JDBCDao.com.syjy.bean.Stu;

import java.util.ArrayList;

public interface IStuDao {
    //有返回值类型 有条件 -----------------------------------

    //添加学生
    public boolean addStu(Stu stu);

    //删除学生
    public  boolean delStu(int stuid);

    //修改学生信息
    public boolean  updateStu(int  stuid,int age);

    //根据学生的学号查询对应的学生信息
    public Stu findBystuid(int stuid);

    //查询多条学生信息--带有条件：age=20
    public ArrayList<Stu> findStuInfo(int age);


    //有返回值类型 无条件 -----------------------------------
    //添加学生
    public boolean addStu();
    //删除学生  无条件
    public  boolean delStu();

    //修改学生信息 无条件
    public boolean updateStu();

    //查询多条学生信息 无条件
    public ArrayList<Stu> findAllStuInfo();


    //无返回值类型 有条件 void -----------------------------------（方法后面加1）
    //添加学生
    public void addStu1(Stu stu);

    //删除学生
    public void delStu1(int stuid);

    //修改学生信息
    public void  updateStu1(int stuid,int age);

    //根据学生的学号查询对应的学生信息
    public void findBystuid1(int stuid);

    //无返回值类型 无参数 void -----------------------------------（方法后面加2）
//添加学生
    public void addStu2();

    //删除学生
    public void delStu2();

    //修改学生信息
    public void  updateStu2();

    //根据学生的学号查询对应的学生信息
    public void findBystuid2();

}
