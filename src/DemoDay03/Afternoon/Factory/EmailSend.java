package DemoDay03.Afternoon.Factory;

public class EmailSend implements Send {


    @Override
    public void send() {
        System.out.println("这是EmailSend里面的方法");
    }
}
