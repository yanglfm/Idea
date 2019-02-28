package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Test {
    //定义卫生间个数
    public static void main(String[] args) {
        Toilet toilet=new Toilet(1);
        //定义用户线程
        User u1=new User("用户1",toilet);
        User u2=new User("用户2",toilet);
        User u3=new User("用户3",toilet);
        u1.start();
        u2.start();
        u3.start();
    }




}
