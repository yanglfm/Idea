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
                wait();//û��λ�þ͵ȴ�
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        users.remove(user);
        users.add(user);//��λ�þ����
        System.out.println(Thread.currentThread().getName()+"�����ϲ�������ȴ�...");
        notifyAll();

    }
}
