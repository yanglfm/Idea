package Exam.Exam0825;
//2.���߳�ѭ��10�Σ����߳�ѭ��100�Σ�Ȼ�����߳�ѭ��10�Σ����߳�ѭ��100�Σ�����ѭ��50�Σ�
//
//����˼·���������Ǹ�һ����Ҳ��synchornized+wait��notify������
//         �ѵ��������̵߳���������Ҫstart������
//         ��Ϊ����������main��������ִ����������ʱ�����߳��Ѿ������ˣ�
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
    private boolean flag=true;//flag��trueʱִ��sub������flag��falseʱִ��main1����
    public synchronized void sub(){///���flag==false��˵����һ���߳�ӵ�иö������������sub�ķ�����������ֱ����һ���߳��ͷ��������Ѹ��̡߳�
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
