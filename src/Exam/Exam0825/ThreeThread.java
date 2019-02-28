package Exam.Exam0825;
//编写一个程序，启动三个线程，三个线程的ID分别是A，B，C；
// 每个线程将自己的ID值在屏幕上打印5遍，打印顺序是ABCABC...
public class ThreeThread extends Thread {
    public static void main(String[] args) {
        MyObject my=new MyObject();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++) {
                    my.printA();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++) {
                    my.printB();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=0; i<10;i++) {
                    my.printC();
                }
            }
        }).start();
    }
}
class MyObject{
    private int flag=1;
    public synchronized void printA(){
        while(flag!=1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("A");
        flag=2;
        this.notifyAll();
    }
    public synchronized void printB(){
        while (flag!=2){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("B");
        flag=3;
        this.notifyAll();
    }
    public synchronized void printC(){
        while (flag!=3){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("C");
        flag=1;
        this.notifyAll();
    }
}
//总结，这3个程序的思路都一样，都是定义一个对象，将方法都同步，每个方法都用一个线程启动，
// 对象之间有个全局变量，线程通过全局变量的设置来控制线程执行顺序。