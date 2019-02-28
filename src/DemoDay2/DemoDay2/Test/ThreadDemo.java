package DemoDay2.DemoDay2.Test;

public class ThreadDemo extends Thread {


    public static Ticket ticket=new Ticket();

    public ThreadDemo(Ticket ticket, String name) {
        super(name);
        this.ticket = ticket;
    }

    public  void  run(){
        while(true){
            synchronized (ticket){
                if(ticket.tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"�����۳���"+(ticket.tickets--)+"��Ʊ");

                }else{
                    break;
                }
                }



            }
        }

    }





