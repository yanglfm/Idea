package Exam.Exam0825;

public class Test3 {
    public static void main(String[] args) {
        //������ӷ�ĸ
        int a=1;
        int b=2;
        //������ʱ���� ���ӱ��ĸ�ϵ�ֵ
        int temp=0;
        //�ܺ�
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

