package Exam.Exam0825;

public class NumDemo extends Thread{
    Second s;

    public NumDemo(Second s) {
        this.s = s;
    }
    public void run(){
            try {
                s.showNum(s);
                s.wait();
                s.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

