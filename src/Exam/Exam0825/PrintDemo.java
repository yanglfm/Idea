package Exam.Exam0825;

import Exam.Exam0825.Example.SellTicket.LetterThread;

public class PrintDemo {
    private int  index=1;//设置1是
    //每次打印两个数字等待打印一个字母
    //打印数字
    public synchronized void print(int i){
        while(index%3==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(i);
        //下标自增
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
        //下标自增
        index++;
        notifyAll();
    }

    public static void main(String[] args) {//测试类
        //创建打印对象
        PrintDemo p=new PrintDemo();
        //创建两根线程
        Thread t1=new NumberThread(p);//对象共享
        Thread t2=new LetterThread(p);
        t1.start();
        t2.start();

    }
}
