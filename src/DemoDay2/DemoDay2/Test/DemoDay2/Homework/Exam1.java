package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Exam1 extends Thread {
    private Object obj;
    public  Exam1(Object obj){//�Ƿ���ͬһ������
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=1;i<5;i++) {
                try {
                    System.out.println("��"+(i)+"���û�����ʹ�������䣬��ȴ�....");
                    obj.wait();
                    Thread.sleep(500); //�߳�����
                    obj.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
