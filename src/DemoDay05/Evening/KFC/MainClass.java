package DemoDay05.Evening.KFC;

public class MainClass {
    public static void main(String[] args) {
        // ֻʵ����һ��KFC���󣬱�֤ÿһ������Ա���û���ͬһ��KFC������
        KFC kfc = new KFC();

        //ʵ����4���ͻ�����
        Customers c1 = new Customers(kfc);
        Customers c2 = new Customers(kfc);
        Customers c3 = new Customers(kfc);
        Customers c4 = new Customers(kfc);

        //ʵ����3������Ա����
        Waiter waiter1 = new Waiter(kfc);
        Waiter waiter2 = new Waiter(kfc);
        Waiter waiter3 = new Waiter(kfc);

        //�����еĶ�����̶߳���ʼ����
        waiter1.start();
        waiter2.start();
        waiter3.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
