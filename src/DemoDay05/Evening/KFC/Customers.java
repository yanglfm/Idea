package DemoDay05.Evening.KFC;

public class Customers extends Thread {
    KFC kfc;
    //KFCҪ���룬��֤ÿһ������Ա���û���ͬһ��KFC������
    public Customers(KFC kfc) {
        this.kfc=kfc;
    }
    @Override
    public void run() {
        int size=(int)(Math.random()*5);//ÿ��Ҫ���ѵ�ʳ�������
        while (true) {
            kfc.consu(size);//�����ѵķ������洫�����
        }

    }

}
