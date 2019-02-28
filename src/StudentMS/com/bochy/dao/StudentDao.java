package StudentMS.com.bochy.dao;

import StudentMS.com.bochy.entity.Student;

import java.util.ArrayList;

public interface StudentDao {
    //添加学生
    public boolean addStudent(Student stu);

    //修改学生信息
    public boolean  updateStudent(int stuid,int age);

    //根据学生的学号查询对应的学生信息
    public Student findBystuid(int stuid);

    public Student findInfo(int stuid);
    //查询所有的学生信息
    public ArrayList<Student> findStuInfo();


    //删除学生信息
    public boolean delStudent(int stuid);

}
