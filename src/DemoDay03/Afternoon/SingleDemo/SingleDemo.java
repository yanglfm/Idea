package DemoDay03.Afternoon.SingleDemo;

public class SingleDemo {
    public static void main(String[] args) {
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();
        System.out.println(s1==s2);//说明这是同一个对象

    }
}
