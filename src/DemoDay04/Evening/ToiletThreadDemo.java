package DemoDay04.Evening;

public class ToiletThreadDemo {
    public static void main(String[] args) {
        Object obj=new Object();//定义一个锁对象
//        Thread inToilet=new Thread(new )
    }


}
class InToilet implements Runnable{
    private final Object object;//声明锁对象

    InToilet(Object object) {//构造方法
        this.object = object;//接受锁对象
    }

    @Override
    public void run() {//线程运行时启动的方法
        synchronized (object){//使用object对象上锁
            for (int i = 1; i <5 ; i++) {//循环
                try {
                    System.out.println("第"+i+"个用户正在使用卫生间，请等待...");
                    object.wait();//线程等待
                    Thread.sleep(500);//线程休眠
                    object.notify();//线程拯救
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*class OutToilet implements Runable{
    private final Object object;//声明锁对象

    OutToilet(Object object) {//构造方法
        this.object = object;//接受锁对象
    }

}*/
