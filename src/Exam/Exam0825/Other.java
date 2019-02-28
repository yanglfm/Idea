package Exam.Exam0825;

import java.io.*;

public class Other {
    public static void main(String[] args) throws IOException {
        //先创建文件
        File file=new File("D:\\Idea\\src\\Exam\\Exam0825\\data.txt");
        //创建d读取流
        BufferedReader br=new BufferedReader(new FileReader(file));
        String []arr=new String[1];//字符数组
        String []temp=null;
        String  line;
        while((line=br.readLine())!=null){
            arr[arr.length-1]=line;
            System.out.println(arr[0]);
            temp=new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i]=arr[i];
                System.out.println(temp[i]+"---------i");
            }

            for (int i = 0; i <arr.length ; i++) {
                arr[i]=temp[i];
                System.out.println(arr[i]+"---------j");
            }
        }

        arr=new String[temp.length-1];
        System.out.println("------");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("------");
            arr[i]=temp[i];
            System.out.println(arr[i]+"---------2");
        }


        br.close();



    }



}
