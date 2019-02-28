package StudentMS.com.bochy.dao;

import StudentMS.com.bochy.entity.Student;

import java.util.ArrayList;

public interface StudentDao {
    //���ѧ��
    public boolean addStudent(Student stu);

    //�޸�ѧ����Ϣ
    public boolean  updateStudent(int stuid,int age);

    //����ѧ����ѧ�Ų�ѯ��Ӧ��ѧ����Ϣ
    public Student findBystuid(int stuid);

    public Student findInfo(int stuid);
    //��ѯ���е�ѧ����Ϣ
    public ArrayList<Student> findStuInfo();


    //ɾ��ѧ����Ϣ
    public boolean delStudent(int stuid);

}
