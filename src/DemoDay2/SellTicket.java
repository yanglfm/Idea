package DemoDay2;

public class SellTicket implements Runnable {
    private int tickets=50;
    private Object obj=new Object();

    @Override
    public void run() {//���δʵ�ֵķ����������ƾ�ʾ
    while (true){
        synchronized (obj){
            if(tickets>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"�����۳���"+(tickets--)+"��Ʊ");

            }else{
                break;
            }
        }

    }
    }
}
