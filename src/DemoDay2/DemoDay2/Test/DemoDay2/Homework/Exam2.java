package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Exam2 extends Thread{
    private Object obj;
    public  Exam2(Object obj){//构造方法
        this.obj=obj;
    }
    public void run(){
        synchronized (obj){
            for (int i=2;i<6;i++) {
                    System.out.println("第"+(i)+"个用户请求上厕所，要求第"+(i-1)+"个用户出来");
                    obj.notify();
                   System.out.println("第"+(i-1)+"个用户离开卫生间");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object obj=new Object();//创建锁对象
        Exam1 ex1=new Exam1(obj);
        Exam2 ex2=new Exam2(obj);
        ex1.start();
        try {
            Thread.sleep(500); //设置延迟避免线程抢占
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ex2.start();
    }
}
