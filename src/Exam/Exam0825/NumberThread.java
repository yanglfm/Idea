package Exam.Exam0825;

public class NumberThread extends Thread {
    private PrintDemo p;

    public NumberThread (PrintDemo p) {
       this.p= p;
    }
    public void run(){
        for (int i = 1; i <=52 ; i++) {
            p.print(i);
        }
    }
}
