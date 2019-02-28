package Exam.Exam0825;
//2.子线程循环10次，主线程循环100次，然后子线程循环10次，主线程循环100次，这样循环50次；
//
//　　思路：跟上面那个一样，也是synchornized+wait，notify方法；
//         难点在于主线程的启动不需要start方法，
//         因为程序的入口是main方法，在执行这个程序的时候，主线程已经启动了；
public class SubMain {
    public static void main(String[] args) {
        MyObject2 my=new MyObject2();
        new Thread(new Runnable() {
            @Override
            public void run() {
                my.sub();
            }
        }).start();
        for (int i = 0; i <5 ; i++) {
            my.mian1();
        }

    }
}
class MyObject2{
    private boolean flag=true;//flag是true时执行sub方法，flag是false时执行main1方法
    public synchronized void sub(){///如果flag==false，说明另一个线程拥有该对象的锁，调用sub的方法被阻塞，直到另一个线程释放锁，唤醒该线程。
        while(flag==false){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print("s");
        }
        System.out.println();
        flag=false;
        this.notify();
    }
    public synchronized void mian1(){
        while(flag==true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i <100 ; i++) {
            System.out.print("m");
        }
        System.out.println();
        flag=true;
        this.notify();
    }

}
