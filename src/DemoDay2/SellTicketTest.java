package DemoDay2;

public class SellTicketTest {
    public static void main(String[] args) {
        SellTicket s1=new SellTicket();//��Ϊ
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s1);
        Thread t3=new Thread(s1);
        t1.setName("����1");//�����߳�����
        t2.setName("����2");
        t3.setName("����3");

        t1.start();
        t2.start();
        t3.start();


    }
}
