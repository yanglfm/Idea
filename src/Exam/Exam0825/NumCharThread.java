package Exam.Exam0825;
//һ ������߳���ҪЭͬ���һ����ʱ�����Լ���+wait��notifyһ����ɡ�
//
//����1.д�����̣߳�һ���̴߳�ӡ1~52����һ���̴߳�ӡA~Z����ӡ˳����12A34B...5152Z��
//
//����˼·����:һ���̴߳�ӡ���֣�ÿ�δ�ӡ�������֣�26�δ�ӡ�꣬��һ���̴߳�ӡ��ĸ��Ҳ��26�δ�ӡ�ꣻ
//             ���Դ�������������һ��������ӡ���֣�һ����ӡ��ĸ��
//             ���д���һ��ȫ�ֱ����������ƾ���ִ�е����ĸ��̣߳�
//             ÿ����������ִ��26�Ρ�
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
    public static int  count=1;//public int  count=1;���Ҳ����
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
