package Exam.Exam0825.Example.SellTicket;

import com.day01.SellTicket;

//1��������ȫ������
//
//����������Ŀ�д���������Ĳ���������������Ʊ��������վ��
//
//��������Ʊ��100��Ʊ��4������ͬʱ��Ʊ
//
//1�����ü̳�Thread��ʵ��
public class TicketTest extends Thread{
    private String name;
    public TicketTest(String name){
        super(name);
    }
    //100��Ʊ�ǹ������Դ
    private static int tickets =100;
    //�����ԣ�ͬ������ͬ��Կ�ף�����
    private static Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                //ͬ�������
                if (tickets>0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this.getName()+"�������ڣ�"+tickets--+"��Ʊ");
                }else{
                    System.out.println("Ʊ�Ѿ�������");
                }
            }
        }
    }
    public static void main(String[] args) {
        SellTicket st1 = new SellTicket("����1");
        SellTicket st2 = new SellTicket("����2");
        SellTicket st3 = new SellTicket("����3");
        SellTicket st4 = new SellTicket("����4");

        st1.start();
        st2.start();
        st3.start();
        st4.start();

    }
}


