package JDBCDao.com.syjy.com.syjy.dao;

import JDBCDao.com.syjy.bean.Stu;

import java.util.ArrayList;

public interface IStuDao {
    //�з���ֵ���� ������ -----------------------------------

    //���ѧ��
    public boolean addStu(Stu stu);

    //ɾ��ѧ��
    public  boolean delStu(int stuid);

    //�޸�ѧ����Ϣ
    public boolean  updateStu(int  stuid,int age);

    //����ѧ����ѧ�Ų�ѯ��Ӧ��ѧ����Ϣ
    public Stu findBystuid(int stuid);

    //��ѯ����ѧ����Ϣ--����������age=20
    public ArrayList<Stu> findStuInfo(int age);


    //�з���ֵ���� ������ -----------------------------------
    //���ѧ��
    public boolean addStu();
    //ɾ��ѧ��  ������
    public  boolean delStu();

    //�޸�ѧ����Ϣ ������
    public boolean updateStu();

    //��ѯ����ѧ����Ϣ ������
    public ArrayList<Stu> findAllStuInfo();


    //�޷���ֵ���� ������ void -----------------------------------�����������1��
    //���ѧ��
    public void addStu1(Stu stu);

    //ɾ��ѧ��
    public void delStu1(int stuid);

    //�޸�ѧ����Ϣ
    public void  updateStu1(int stuid,int age);

    //����ѧ����ѧ�Ų�ѯ��Ӧ��ѧ����Ϣ
    public void findBystuid1(int stuid);

    //�޷���ֵ���� �޲��� void -----------------------------------�����������2��
//���ѧ��
    public void addStu2();

    //ɾ��ѧ��
    public void delStu2();

    //�޸�ѧ����Ϣ
    public void  updateStu2();

    //����ѧ����ѧ�Ų�ѯ��Ӧ��ѧ����Ϣ
    public void findBystuid2();

}
