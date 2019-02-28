package Exam.Exam0825;

import java.io.*;

public class FileFindDemo {
    public static void main(String[] args) {
        File file=new File("D:\\Demo");
        FileFindDemo.find(file);
    }
    public  static void find(File file){
        //判断是不是文件
        //判断是不是txt文件
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                find(file1);
            }else {
                if (file1.getName().endsWith(".txt")){
                    System.out.println(file1.getName());
                    try {
                        BufferedReader br=new BufferedReader(new FileReader(file1));
                        String str;
                        while((str=br.readLine())!=null){
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println();
                }
            }
        }
    }

}
