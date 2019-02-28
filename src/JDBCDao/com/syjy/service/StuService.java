package JDBCDao.com.syjy.service;

import JDBCDao.com.syjy.bean.Stu;
import JDBCDao.com.syjy.com.syjy.dao.IStuDao;
import JDBCDao.com.syjy.dao.impl.StuDaoImpl;

import java.util.ArrayList;

public class StuService {
    //定义属性
    private IStuDao stuDao;
    public void addStu(Stu stu){
        stuDao=new StuDaoImpl();
        stuDao.addStu(stu);
    }


    //有返回值 有条件 ----------------------------------------------------------------------------
    public boolean delStu(int stuid){
        stuDao=new StuDaoImpl();
        boolean b = stuDao.delStu(stuid);
        return b;
    }
    public boolean updateStu(int stuid,int age){
        stuDao=new StuDaoImpl();
        boolean b = stuDao.updateStu(stuid, age);
        return b;
    }
    public Stu findBystuid(int stuid){
        stuDao=new StuDaoImpl();
        Stu stu = stuDao.findBystuid(stuid);
        return stu;
    }
    public ArrayList<Stu> findStuInfo(int age){
        stuDao=new StuDaoImpl();
        ArrayList<Stu> list = stuDao.findStuInfo(age);
        return list;
    }
    //有返回值 无条件 ---------------------------------------------------------------------------
    public ArrayList<Stu> findAllStuInfo(){
        stuDao=new StuDaoImpl();
        ArrayList<Stu> list = stuDao.findAllStuInfo();
        return list;
    }
    public void addStu(){
        stuDao=new StuDaoImpl();
        Stu stu=new Stu();
        stuDao.addStu(stu);
    }





}
