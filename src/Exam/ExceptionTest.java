package Exam;

public class ExceptionTest {
    public static void main(String[] args) {
        int  []arr={1,2,3,4,5,6};
        try {
            test(arr);
        } catch (Exception e) {
           // e.printStackTrace();//����Ǵ�ӡ������throw�����ݣ����в����쳣��λ��
            System.out.println(e.getMessage());//�����ӡ�쳣������
        }
    }
    public static void test(int []arr) throws Exception {//��̬����ֱ�ӵ���
        if(arr.length>10){
            System.out.println(arr[10]);
        }else{
            throw new Exception("�����±�Խ��");//throw ֻ���׳�һ���쳣��ͬʱ�ڷ�����ҲҪͨ��throws�׳��쳣��throws�����׳�����쳣
        }
    }

}
