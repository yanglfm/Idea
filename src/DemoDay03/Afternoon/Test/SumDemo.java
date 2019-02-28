package DemoDay03.Afternoon.Test;

public class SumDemo {//求和方式
public int sum(int a,int b){
    return a+b;
}
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    //方法重载
    //假如参数有一百个，写一个可变长的参数
    //可变长的参数...，其中点号代表可以存放同类数据类型的参数 参数的个数不定
    public static void sum(int ...a){//...可以看成一系列的数据
    int sum=0;
    for(int i=0;i<a.length;i++){
        sum+=a[i];
    }
        System.out.println(sum);
    }
    public static void main(String[] args) {
    SumDemo.sum(10,12,20,30);
    }
}


