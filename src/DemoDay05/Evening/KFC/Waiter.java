package DemoDay05.Evening.KFC;

public class Waiter extends Thread{
    KFC kfc;
    //KFCҪ���룬��֤ÿһ������Ա���û���ͬһ��KFC������
    public Waiter(KFC kfc) {
        this.kfc=kfc;
    }
    @Override
    public void run() {
        int size=(int)(Math.random()*5)+5;//ÿ������������
        while (true) {
            kfc.prod(size);//����ÿ������������
        }

    }

}
