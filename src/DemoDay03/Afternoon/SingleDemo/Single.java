package DemoDay03.Afternoon.SingleDemo;

public class Single {
    private static final Single instance=new Single();//Ҳ�þ�̬���η�����

    //˽�л����췽��
    private Single() {
    }
    //�ṩ�����ľ�̬����
    public static Single getInstance(){
        if(instance==null){
            return new Single();
        }else{
            return instance;
        }
    }
}
