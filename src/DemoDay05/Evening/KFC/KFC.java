package DemoDay05.Evening.KFC;

import java.util.ArrayList;
import java.util.List;

public class KFC {//����һ��KFC�࣬������ʳ�������ʳ��ķ���
    //ʳ�������
    String []names={"����", "�հ�", "����", "����" };
    //���������ֵ������������Ϣ
    static final int Max=20;
    //���ʳ��ļ���
    List foods=new ArrayList();
    //����ʳ��ķ���
    public void prod(int index) {
        synchronized (this){
            //���ʳ����������20
            while(foods.size()>Max){
                System.out.println("ʳ�Ĺ���");
                this.notifyAll();//�����������������ߺ������ߣ���all
                try {
                    this.wait();//�������������������ߣ�û��all
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"������");
            }
        }
        //��ʼ����ʳ��
        System.out.println("��ʼ����ʳ��");
        for (int i = 0; i <index ; i++) {
            Food food=new Food(names[(int)(Math.random()*4)]);
            foods.add(food);
            System.out.println("������"+food.getName()+foods.size());
        }
    }
    //����ʳ��ķ���
    public void consu(int index){
        synchronized (this){
            while(foods.size()<index){
                System.out.println("ʳ�Ĳ�����");
                this.notifyAll();//�����������������ߺ������ߣ���all
                try {
                    this.wait();//�����������������ߣ�û��all
                    System.out.println(Thread.currentThread().getName()+"������");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //�㹻����
            System.out.println("��ʼ����");
            for (int i = 0; i <index ; i++) {
              //  Food food=foods.remove(foods.size()-1);
                System.out.println("������һ��");
            }
        }
    }

}
