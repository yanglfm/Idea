package Exam.Exam0825;

import java.io.*;

public class IO {
    public String[] read(InputStream in) throws IOException {
        String[] arr = new String[1];
        String[] temp = null;
        //��ȡ�ļ�in ��ȡ���Ĳ���
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        String line ="";
        //��ȡ������
       while ((line=br.readLine()    ) != null) {
            arr[arr.length - 1] = line;
            //��ʱ����
            temp=new String[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            //arr����ĳ��ȵ�����ʱ����ĳ���
           arr = new String[temp.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];//�ٰ�temp[i]��ֵ��arr[i]
            }
        }
         arr = new String[temp.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        br.close();
        return arr;
    }
    public static void main(String[] args) throws IOException {
        String[] arr = new IO().read(new FileInputStream("D:\\Idea\\src\\Exam\\Exam0825\\data.txt"));
        System.out.println(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }

}

