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
    public static  double  A1(int n) {//1.这个如果定义double类型的时候，就不会出现为0的情况（√）
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
    public static  int  A(int n) {//2.这个如果定义为整型的话的时候，在上面的循环上直接计算sum的值时sum=A(i)/B(i),可以转化为sum=（double）A(i)/B(i)就会出现为0的情况（√）
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
