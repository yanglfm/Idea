package StudentMS.com.bochy.biz;

import StudentMS.com.bochy.entity.Student;

public interface StudentBiz {
    //���ѧ����Ϣ
    public String addStudent();
    //����ѧ��id�޸�ѧ����Ϣ
    public int updateStudent(int choice);
    //����ѧ��id��ѯѧ����Ϣ
    public Student findById();

    public int findInfo(int choice);

    public boolean delStudent(int choice);
}
