package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Exam2 extends Thread{
    private Object obj;
    public  Exam2(Object obj){//���췽��
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=2;i<6;i++) {
                    System.out.println("��"+(i)+"���û������ϲ�����Ҫ���"+(i-1)+"���û�����");
                    obj.notify();
                   System.out.println("��"+(i-1)+"���û��뿪������");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object obj=new Object();//����������
        Exam1 ex1=new Exam1(obj);
        Exam2 ex2=new Exam2(obj);
        ex1.start();
        try {
            Thread.sleep(500); //�����ӳٱ����߳���ռ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ex2.start();
    }
}
