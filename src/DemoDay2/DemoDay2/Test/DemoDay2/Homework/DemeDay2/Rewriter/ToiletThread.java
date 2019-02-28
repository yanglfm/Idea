package DemoDay2.DemoDay2.Test.DemoDay2.Homework.DemeDay2.Rewriter;

public class ToiletThread {
    public static void main(String args[]) throws InterruptedException {
        Object obj = new Object(); //����һ��������
        Thread in_toilet = new Thread(new InToilet(obj)); //ʵ�����߳�
        Thread out_toilet = new Thread(new OutToilet(obj)); //ʵ�����߳�
        in_toilet.start(); //�߳�����
        Thread.sleep(500); //�����ӳٱ����߳���ռ
        out_toilet.start(); //�߳�����
    }
}
class InToilet implements Runnable {
    private final Object object; //����������

    InToilet(Object object) { //���췽��
        this.object = object; //����������
    }

    public void run() { //�߳�����ʱ�����ķ���
        synchronized (object) { //ʹ��object��������
            for (int i = 1; i < 5; i++) { //ѭ��
                try {
                    System.out.println("��" + i + "���û�����ʹ�������䣬��ȴ�....");
                    object.wait(); //�̵߳ȴ�
                    Thread.sleep(500); //�߳�����
                    object.notify(); //�߳�����
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class OutToilet implements Runnable {
    private final Object object; //����������

    OutToilet(Object object) { //���췽��
        this.object = object; //����������
    }

    public void run() {
        synchronized (object) { //����
            try {
                for (int i = 2; i < 6; i++) { //ѭ��
                    System.out.println("��" + i + "���û�����ʹ�������䣬Ҫ���"+(i-1)+"���û�����");
                    object.notify();//�߳�����
                    System.out.println("��" + (i - 1) + "���û��뿪������");
                    object.wait(); //�̵߳ȴ�
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
