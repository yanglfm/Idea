package DemoDay2.DemoDay2.Test;

public class TestDemo1 {
    public static void main(String[] args) {
        Ticket1 ticket1= new Ticket1();////ticket��Ϊһ����Դ������������������
        ThreadDemo1 t1=new ThreadDemo1(ticket1,"����1");
        ThreadDemo1 t2=new ThreadDemo1(ticket1,"����1");
        ThreadDemo1 t3=new ThreadDemo1(ticket1,"����1");
        t1.start();//����
        t2.start();
        t3.start();

    }
}
