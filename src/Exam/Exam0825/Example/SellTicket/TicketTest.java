package Exam.Exam0825.Example.SellTicket;

import com.day01.SellTicket;

//1、并发安全性问题
//
//互联网的项目中存在这大量的并发案例，如卖火车票，电商网站等
//
//范例：火车票有100张票，4个窗口同时卖票
//
//1）采用继承Thread来实现
public class TicketTest extends Thread{
    private String name;
    public TicketTest(String name){
        super(name);
    }
    //100张票是共享的资源
    private static int tickets =100;
    //类属性，同步锁（同步钥匙）对象
    private static Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                //同步代码块
                if (tickets>0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"正在卖第："+tickets--+"张票");
                }else{
                    System.out.println("票已经卖完了");
                }
            }
        }
    }
    public static void main(String[] args) {
        SellTicket st1 = new SellTicket("窗口1");
        SellTicket st2 = new SellTicket("窗口2");
        SellTicket st3 = new SellTicket("窗口3");
        SellTicket st4 = new SellTicket("窗口4");

        st1.start();
        st2.start();
        st3.start();
        st4.start();

    }
}


