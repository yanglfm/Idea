package DemoDay03.Afternoon.Factory;

public class Factory {//工厂提供两种方法

    public static void main(String[] args) {
       //调用方法，得到接口
        Send s1=Factory.getEmailSend();//用接口来接受返回的对象
        s1=Factory.getSmsSend();
        s1.send();
    }
    public static Send getEmailSend(){//返回接口对象
          return new EmailSend();
    }
    public static Send getSmsSend(){//返回接口对象
        return new SmsSend();
    }
}
