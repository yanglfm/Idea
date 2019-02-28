package DemoDay03.Afternoon.Factory;

public class SmsSend implements Send {
    @Override
    public void send() {
        System.out.println("这是SmsSend里面的方法");
    }
}
