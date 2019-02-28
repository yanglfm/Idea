package DemoDay05.Evening.SellTicket;

public class MainClass {
    //java多线程同步锁使用
    //示例：三个售票窗口同时出售10张票
    public static void main(String[] args) {

        //实例化站台对象，并为每一个站台取名字
        Station s1=new Station("窗口1");
        Station s2=new Station("窗口2");
        Station s3=new Station("窗口3");

        // 让每一个站台对象各自开始工作
        s1.start();
        s2.start();
        s3.start();
    }
}
