package DemoDay03.Afternoon.Test;

public class SumDemo {//��ͷ�ʽ
public int sum(int a,int b){
    return a+b;
}
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public int sum(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    //��������
    //���������һ�ٸ���дһ���ɱ䳤�Ĳ���
    //�ɱ䳤�Ĳ���...�����е�Ŵ�����Դ��ͬ���������͵Ĳ��� �����ĸ�������
    public static void sum(int ...a){//...���Կ���һϵ�е�����
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


