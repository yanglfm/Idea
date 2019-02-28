package Exam.Exam0825;
//一 当多个线程需要协同完成一件事时，可以加锁+wait，notify一起完成。
//
//　　1.写两个线程，一个线程打印1~52，另一个线程打印A~Z，打印顺序是12A34B...5152Z；
//
//　　思路分析:一个线程打印数字，每次打印两个数字，26次打印完，另一个线程打印字母，也是26次打印完；
//             可以创建两个方法，一个方法打印数字，一个打印字母；
//             还有创建一个全局变量用来控制具体执行的是哪个线程；
//             每个方法都被执行26次。
public class NumCharThread {
    public static void main(String[] args) {
        MyObject1 my=new MyObject1();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <26 ; i++) {
                    my.printNum();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 26; i++) {
                    my.printA();
                }
            }
        }).start();

    }

}
class MyObject1{
    private static boolean flag=true;
    public static int  count=1;//public int  count=1;这个也可以
    public synchronized void printNum(){
        while(flag==false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((2*count-1));
        System.out.print(2*count);
        flag=false;
        this.notify();
    }
    public synchronized void printA(){
        while(flag==true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char)(count+'A'-1));
        count++;
        flag=true;
        this.notify();
    }

}
