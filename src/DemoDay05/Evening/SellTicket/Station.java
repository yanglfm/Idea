package DemoDay05.Evening.SellTicket;
//������Ʊ����ͬʱ����20��Ʊ;
// ���������
//1.Ʊ��Ҫʹ��ͬһ����ֵ̬
//2.Ϊ��֤�����������ͬһ��Ʊ����Ҫjava���߳�ͬ������
//
//���˼·��
// 1.����һ��վ̨��Station���̳�Thread����дrun��������run��������ִ����Ʊ������
// ��ƱҪʹ��ͬ����������һ��վ̨������Ʊʱ������վ̨Ҫ������Ʊ���꣡
//2.����������������
public class Station extends Thread{
    //ͨ�����췽�����߳����ָ�ֵ
    public Station(String name) {
        super(name);//���߳����ָ�ֵ
    }
    //Ϊ�˱���Ʊ����һ�£�Ʊ��Ҫ��̬
    static int ticket=20;
    //����һ����̬Կ��
    static Object ob=new Object();//ֵ�������
    //��дrun������ʵ����Ʊ����
    @Override
    public void run() {
       while(ticket>0){
           synchronized (ob){//�������Ҫ������ʹ��һ����
               //��ȥ���˻��Կ���������ϣ�������Ű�Կ���ó���
               if(ticket>0){
                   System.out.println(getName()+"�����˵�"+(ticket--)+"��Ʊ");
               }else{
                   System.out.println("Ʊ������");
               }
           }
           try {
               sleep(1000);//��Ϣһ��
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
