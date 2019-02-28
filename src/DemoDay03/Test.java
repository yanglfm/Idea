package DemoDay03;

public class Test {
    public static void main(String[] args) {
        Shelf shelf=new Shelf(10);
        //定义厂家线程
        Factory f1=new Factory("厂家1",shelf,10);
        Factory f2=new Factory("厂家2",shelf,10);
        //创建顾客线程
        Customer c1=new Customer("顾客1",shelf,5);
        Customer c2=new Customer("顾客2",shelf,5);
        //开启线程
        f1.start();
        f2.start();
        c1.start();
        c2.start();



    }
}
