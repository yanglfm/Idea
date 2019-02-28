package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

import java.util.ArrayList;

public class Toilet {
    private int max;
    private ArrayList<User> users=new ArrayList<User>();
    public Toilet(int max){
        this.max=max;
    }
    public synchronized void line(User user){
        while(max==0){
            try {
                wait();//没有位置就等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        users.remove(user);
        users.add(user);//有位置就添加
        System.out.println(Thread.currentThread().getName()+"正在上厕所，请等待...");
        notifyAll();

    }
}
