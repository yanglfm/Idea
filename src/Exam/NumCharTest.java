package Exam;

public class NumCharTest {
    //同步方法
    public static int i=1;
    public static boolean flag=true;
    public synchronized void showNum(){
        while(flag==false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(2*i-1+""+2*i);
        flag=false;
        notify();
    }
    public synchronized void showChar(){
        while (flag==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char)('A'+(i-1)));
        i++;
        flag=true;
        notify();

    }
    public static void main(String[] args) {
        NumCharTest test=new NumCharTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=26 ; i++) {
                    test.showNum();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <=26 ; j++) {
                    test.showChar();
                }
            }
        }).start();
    }
}


