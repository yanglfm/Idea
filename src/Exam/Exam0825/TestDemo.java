package Exam.Exam0825;

public class TestDemo {
    public static void main(String[] args) {
        Object obj=new Object();//创建锁对象
        NumTest n=new NumTest(obj);
        CharTest c=new CharTest(obj);
        n.start();
        try {
            Thread.sleep(200); //设置延迟避免线程抢占
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
    }
}
