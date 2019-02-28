package Exam.Exam0825.Example.SellTicket;

import Exam.Exam0825.PrintDemo;

public class LetterThread extends Thread{
    //将打印对象放到构造方法里面去
    private PrintDemo p;

    public LetterThread (PrintDemo p) {//打印对象是同一个对象
        this.p= p;
    }
    public void run(){//执行run方法
        for (char c='A'; c <='Z' ; c++) {
            p.print(c);
        }
    }
}
