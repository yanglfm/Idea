package Exam.Exam0825;

public class Test3 {
    public static void main(String[] args) {
        //定义分子分母
        int a=1;
        int b=2;
        //定义临时变量 分子变分母上的值
        int temp=0;
        //总和
        double sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum+=(double)a/b;
            temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println(sum);
        }

    }

