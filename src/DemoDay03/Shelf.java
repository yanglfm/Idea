package DemoDay03;

import java.util.ArrayList;

//�û���
public class Shelf {//��������
    //��������ϵ���Ŀ�����ֵ�������ԷŶ��ٸ�����
    private int count;
    //��������ϻ����Ϊ������ֶ����������ü��ϱ�ʾ
    private ArrayList<Product>products=new ArrayList<Product>();
    //�ϻ�������

    public Shelf(int count) {
        this.count = count;

    }

    public synchronized void in(Product p){//����Ʒ��Ϊ��ʽ����������
        while(products.size()>=count){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.add(p);
        System.out.println(Thread.currentThread().getName()+"���ڼӻ�����������"+products.size()+"��ô����Ʒ");
        notifyAll();

    }
    public synchronized void out(){
        //�������ǿյģ������߾͵ȴ�
        while(products.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products.remove(0);//���ܲ��ǿյĻ������������߻���
        System.out.println(Thread.currentThread().getName()+"������Ʒ����ǰ�����ϵ���Ʒ��"+products.size()+"��");
        notifyAll();//����


    }
}
