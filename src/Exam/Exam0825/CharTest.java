package Exam.Exam0825;

public class CharTest extends Thread{
    private Object obj;
    public  CharTest(Object obj){//构造方法
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=65;i<=90;i++) {
                System.out.print((char)i);
                obj.notify();
               // System.out.print("j"+(char)i);
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
