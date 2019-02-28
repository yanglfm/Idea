package DemoDay2.DemoDay2.Test.DemoDay2.Homework.DemeDay2.Rewriter;

public class ToiletThread {
    public static void main(String args[]) throws InterruptedException {
        Object obj = new Object(); //定义一个锁对象
        Thread in_toilet = new Thread(new InToilet(obj)); //实例化线程
        Thread out_toilet = new Thread(new OutToilet(obj)); //实例化线程
        in_toilet.start(); //线程运行
        Thread.sleep(500); //设置延迟避免线程抢占
        out_toilet.start(); //线程运行
    }
}
class InToilet implements Runnable {
    private final Object object; //声明锁对象

    InToilet(Object object) { //构造方法
        this.object = object; //接收锁对象
    }

    public void run() { //线程运行时启动的方法
        synchronized (object) { //使用object对象上锁
            for (int i = 1; i < 5; i++) { //循环
                try {
                    System.out.println("第" + i + "个用户正在使用卫生间，请等待....");
                    object.wait(); //线程等待
                    Thread.sleep(500); //线程休眠
                    object.notify(); //线程拯救
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class OutToilet implements Runnable {
    private final Object object; //声明锁对象

    OutToilet(Object object) { //构造方法
        this.object = object; //接收锁对象
    }

    public void run() {
        synchronized (object) { //上锁
            try {
                for (int i = 2; i < 6; i++) { //循环
                    System.out.println("第" + i + "个用户请求使用卫生间，要求第"+(i-1)+"个用户出来");
                    object.notify();//线程拯救
                    System.out.println("第" + (i - 1) + "个用户离开卫生间");
                    object.wait(); //线程等待
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
