package Exam;

public class TestDI {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <=10 ; i++) {
           sum+=(double)A(i)/B(i);
        }
        System.out.println(sum);//6.097960861749691

        double sum1=0;
        for (int i = 1; i <=10 ; i++) {
            sum1+=A1(i)/B1(i);
        }
        System.out.println(sum1);//6.097960861749691
    }
    public static  double  A1(int n) {//1.����������double���͵�ʱ�򣬾Ͳ������Ϊ0��������̣�
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return A1(n-1)+A1(n-2);
    }
    public static  double  B1(int n) {
        if(n==1){
            return 2;
        }
        if(n==2){
            return 3;
        }
        return B1(n-1)+B1(n-2);
    }
    public static  int  A(int n) {//2.����������Ϊ���͵Ļ���ʱ���������ѭ����ֱ�Ӽ���sum��ֵʱsum=A(i)/B(i),����ת��Ϊsum=��double��A(i)/B(i)�ͻ����Ϊ0��������̣�
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return A(n-1)+A(n-2);
    }
    public static  int  B(int n) {
        if(n==1){
            return 2;
        }
        if(n==2){
            return 3;
        }
        return B(n-1)+B(n-2);
    }
}
