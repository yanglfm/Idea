package Exam.Exam0825;

public class NumTest extends Thread{
    private Object obj;
    public   NumTest(Object obj){//�Ƿ���ͬһ�������̵߳�����
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=1;i<=52;i=i+2) {
                int j=i+1;
                try {
                    System.out.print(i);
                    System.out.print(j);
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
