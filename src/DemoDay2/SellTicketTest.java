package DemoDay2;

public class SellTicketTest {
    public static void main(String[] args) {
        SellTicket s1=new SellTicket();//因为
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s1);
        Thread t3=new Thread(s1);
        t1.setName("窗口1");//设置线程名称
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
