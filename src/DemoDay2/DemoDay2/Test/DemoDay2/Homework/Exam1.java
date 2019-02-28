package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Exam1 extends Thread {
    private Object obj;
    public  Exam1(Object obj){//是否是同一个对象
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=1;i<5;i++) {
                try {
                    System.out.println("第"+(i)+"个用户正在使用卫生间，请等待....");
                    obj.wait();
                    Thread.sleep(500); //线程休眠
                    obj.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
