package Exam.Exam0825.Example.SellTicket;

import Exam.Exam0825.PrintDemo;

public class LetterThread extends Thread{
    //����ӡ����ŵ����췽������ȥ
    private PrintDemo p;

    public LetterThread (PrintDemo p) {//��ӡ������ͬһ������
        this.p= p;
    }
    public void run(){//ִ��run����
        for (char c='A'; c <='Z' ; c++) {
            p.print(c);
        }
    }
}
