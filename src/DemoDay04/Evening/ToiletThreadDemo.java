package DemoDay04.Evening;

public class ToiletThreadDemo {
    public static void main(String[] args) {
        Object obj=new Object();//����һ��������
//        Thread inToilet=new Thread(new )
    }


}
class InToilet implements Runnable{
    private final Object object;//����������

    InToilet(Object object) {//���췽��
        this.object = object;//����������
    }

    @Override
    public void run() {//�߳�����ʱ�����ķ���
        synchronized (object){//ʹ��object��������
            for (int i = 1; i <5 ; i++) {//ѭ��
                try {
                    System.out.println("��"+i+"���û�����ʹ�������䣬��ȴ�...");
                    object.wait();//�̵߳ȴ�
                    Thread.sleep(500);//�߳�����
                    object.notify();//�߳�����
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*class OutToilet implements Runable{
    private final Object object;//����������

    OutToilet(Object object) {//���췽��
        this.object = object;//����������
    }

}*/
