package Exam.Exam0825;

public class TestDemo {
    public static void main(String[] args) {
        Object obj=new Object();//����������
        NumTest n=new NumTest(obj);
        CharTest c=new CharTest(obj);
        n.start();
        try {
            Thread.sleep(200); //�����ӳٱ����߳���ռ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
    }
}
