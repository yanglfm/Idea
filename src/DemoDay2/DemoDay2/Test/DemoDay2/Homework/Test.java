package DemoDay2.DemoDay2.Test.DemoDay2.Homework;

public class Test {
    //�������������
    public static void main(String[] args) {
        Toilet toilet=new Toilet(1);
        //�����û��߳�
        User u1=new User("�û�1",toilet);
        User u2=new User("�û�2",toilet);
        User u3=new User("�û�3",toilet);
        u1.start();
        u2.start();
        u3.start();
    }




}
