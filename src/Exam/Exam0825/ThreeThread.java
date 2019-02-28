package Exam.Exam0825;
//��дһ���������������̣߳������̵߳�ID�ֱ���A��B��C��
// ÿ���߳̽��Լ���IDֵ����Ļ�ϴ�ӡ5�飬��ӡ˳����ABCABC...
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
//�ܽᣬ��3�������˼·��һ�������Ƕ���һ�����󣬽�������ͬ����ÿ����������һ���߳�������
// ����֮���и�ȫ�ֱ������߳�ͨ��ȫ�ֱ����������������߳�ִ��˳��