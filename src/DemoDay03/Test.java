package DemoDay03;

public class Test {
    public static void main(String[] args) {
        Shelf shelf=new Shelf(10);
        //���峧���߳�
        Factory f1=new Factory("����1",shelf,10);
        Factory f2=new Factory("����2",shelf,10);
        //�����˿��߳�
        Customer c1=new Customer("�˿�1",shelf,5);
        Customer c2=new Customer("�˿�2",shelf,5);
        //�����߳�
        f1.start();
        f2.start();
        c1.start();
        c2.start();



    }
}
