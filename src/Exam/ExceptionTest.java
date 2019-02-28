package Exam;

public class ExceptionTest {
    public static void main(String[] args) {
        int  []arr={1,2,3,4,5,6};
        try {
            test(arr);
        } catch (Exception e) {
           // e.printStackTrace();//这个是打印出错误throw的内容，还有产生异常的位置
            System.out.println(e.getMessage());//这个打印异常的内容
        }
    }
    public static void test(int []arr) throws Exception {//静态方法直接调用
        if(arr.length>10){
            System.out.println(arr[10]);
        }else{
            throw new Exception("数组下标越界");//throw 只能抛出一个异常，同时在方法上也要通过throws抛出异常，throws可以抛出多个异常
        }
    }

}
