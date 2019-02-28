package StudentMS.com.bochy.biz;

import StudentMS.com.bochy.entity.Student;

public interface StudentBiz {
    //添加学生信息
    public String addStudent();
    //根据学生id修改学生信息
    public int updateStudent(int choice);
    //根据学生id查询学生信息
    public Student findById();

    public int findInfo(int choice);

    public boolean delStudent(int choice);
}
