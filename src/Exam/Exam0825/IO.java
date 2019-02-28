package Exam.Exam0825;

import java.io.*;

public class IO {
    public String[] read(InputStream in) throws IOException {
        String[] arr = new String[1];
        String[] temp = null;
        //读取文件in 读取它的参数
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        String line ="";
        //读取的行数
       while ((line=br.readLine()    ) != null) {
            arr[arr.length - 1] = line;
            //临时数组
            temp=new String[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            //arr数组的长度等于临时数组的长度
           arr = new String[temp.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = temp[i];//再把temp[i]的值给arr[i]
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

