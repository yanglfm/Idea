package DemoDay03.Afternoon.Factory;

public class Factory {//�����ṩ���ַ���

    public static void main(String[] args) {
       //���÷������õ��ӿ�
        Send s1=Factory.getEmailSend();//�ýӿ������ܷ��صĶ���
        s1=Factory.getSmsSend();
        s1.send();
    }
    public static Send getEmailSend(){//���ؽӿڶ���
          return new EmailSend();
    }
    public static Send getSmsSend(){//���ؽӿڶ���
        return new SmsSend();
    }
}
