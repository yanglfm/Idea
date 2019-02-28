package DemoDay04;

public class DateDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //������
        Class c = Class.forName("java.util.Date");
        Class superclass = c.getSuperclass();//��ȡ����
        System.out.println("��������"+superclass.getSimpleName());
        Class[] interfaces = c.getInterfaces();//��ȡ���ӿ�
        System.out.print("���ӿ�����");
        for (Class inter : interfaces) {
            System.out.print(inter.getSimpleName()+"\t");
        }
    }
}
