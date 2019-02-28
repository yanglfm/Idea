package Exam.Exam0825;

public class First {
    public static void main(String[] args) {
       First.flower();
    }
    public static void flower(){

        for (int i = 100; i <999 ; i++) {
            int a=i%10;//个位
            int b=i/10%10;//十位
            int c=i/100;//百位
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
