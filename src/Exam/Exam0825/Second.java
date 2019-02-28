package Exam.Exam0825;

public class Second {
    //定义一个对象
    Second s;
    public static  int i=1;
    public static  int j=65;
   /* //创建构造方法
    public Second(Second s) {
        this.s = s;
    }*/
    public synchronized  void showNum(Second s){
        while (i<52) {
            System.out.print(i+(++i));
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public synchronized  void showCharacter(Second s){
        while (j<90) {
            System.out.print((char)j);
            j++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
