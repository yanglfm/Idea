package DemoDay2.DemoDay2.Test;

public class TestDemo1 {
    public static void main(String[] args) {
        Ticket1 ticket1= new Ticket1();////ticket作为一种资源，来被三个窗口争夺
        ThreadDemo1 t1=new ThreadDemo1(ticket1,"窗口1");
        ThreadDemo1 t2=new ThreadDemo1(ticket1,"窗口1");
        ThreadDemo1 t3=new ThreadDemo1(ticket1,"窗口1");
        t1.start();//启动
        t2.start();
        t3.start();

    }
}
