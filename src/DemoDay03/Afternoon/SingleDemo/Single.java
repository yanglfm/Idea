package DemoDay03.Afternoon.SingleDemo;

public class Single {
    private static final Single instance=new Single();//也用静态修饰符修饰

    //私有化构造方法
    private Single() {
    }
    //提供公共的静态方法
    public static Single getInstance(){
        if(instance==null){
            return new Single();
        }else{
            return instance;
        }
    }
}
