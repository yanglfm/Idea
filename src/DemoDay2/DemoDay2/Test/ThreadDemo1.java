package DemoDay2.DemoDay2.Test;

public class ThreadDemo1 extends Thread {


    private Ticket1 ticket ;//将Ticket对象作为锁对象

    public ThreadDemo1(Ticket1 ticket, String name) {
        super(name);
        this.ticket = ticket;
    }

    public  void  run(){
        while(ticket.getTickets()!=0){
            synchronized (ticket){
                if(ticket.getTickets()!=0){
                    System.out.println(getName()+"正在售出第"+(50-ticket.getTickets())+"张票");//getName（）是获得运行线程的名称

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }



            }
        }

    }

    }





