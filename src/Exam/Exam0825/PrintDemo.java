package Exam.Exam0825;

import Exam.Exam0825.Example.SellTicket.LetterThread;

public class PrintDemo {
    private int  index=1;//����1��
    //ÿ�δ�ӡ�������ֵȴ���ӡһ����ĸ
    //��ӡ����
    public synchronized void print(int i){
        while(index%3==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(i);
        //�±�����
        index++;
        notifyAll();
    }
    public synchronized void print(char c){
        while(index%3!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.print(c);
        //�±�����
        index++;
        notifyAll();
    }

    public static void main(String[] args) {//������
        //������ӡ����
        PrintDemo p=new PrintDemo();
        //���������߳�
        Thread t1=new NumberThread(p);//������
        Thread t2=new LetterThread(p);
        t1.start();
        t2.start();

    }
}
