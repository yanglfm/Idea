package DemoDay05.Evening.SellTicket;

public class MainClass {
    //java���߳�ͬ����ʹ��
    //ʾ����������Ʊ����ͬʱ����10��Ʊ
    public static void main(String[] args) {

        //ʵ����վ̨���󣬲�Ϊÿһ��վ̨ȡ����
        Station s1=new Station("����1");
        Station s2=new Station("����2");
        Station s3=new Station("����3");

        // ��ÿһ��վ̨������Կ�ʼ����
        s1.start();
        s2.start();
        s3.start();
    }
}
