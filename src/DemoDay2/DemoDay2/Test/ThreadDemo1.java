package DemoDay2.DemoDay2.Test;

public class ThreadDemo1 extends Thread {


    private Ticket1 ticket ;//��Ticket������Ϊ������

    public ThreadDemo1(Ticket1 ticket, String name) {
        super(name);
        this.ticket = ticket;
    }

    public  void  run(){
        while(ticket.getTickets()!=0){
            synchronized (ticket){
                if(ticket.getTickets()!=0){
                    System.out.println(getName()+"�����۳���"+(50-ticket.getTickets())+"��Ʊ");//getName�����ǻ�������̵߳�����

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





