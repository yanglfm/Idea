package DemoDay2;

public class SellTicket implements Runnable {
    private int tickets=50;
    private Object obj=new Object();

    @Override
    public void run() {//添加未实现的方法，点击红灯警示
    while (true){
        synchronized (obj){
            if(tickets>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售出第"+(tickets--)+"张票");

            }else{
                break;
            }
        }

    }
    }
}
