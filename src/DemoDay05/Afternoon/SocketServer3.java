package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer3 {
    public static void main(String[] args) throws IOException {
        //指定监听的端口（模拟）
        int port = 5555;
        //创建服务，就是建一个服务器
        ServerSocket server = new ServerSocket(port);
        //服务一致在等待连接中
        System.out.println("sever将一致在等待连接的到来");
        Socket socket = server.accept();//ServerSocket 里面的方法accept():侦听要连接到此套接字并接受它。返回值是：Socket类型
        //建立好连接过后，要从socket中获取输入流，并建立缓冲区进行读取
        InputStream inputStream = socket.getInputStream();//Socket 里面的方法getInputStream()：返回此套接字的输入流。
        //流既然读取出来了，接下来创建字符数组

        //以上是前期准备的内容
       //创建字符数组
        byte[] bys ;
        while(true){
            //首先我们要读取两个字节表示的长度
            int first=inputStream.read();
            //如果读取的值为-1，说明到了流的末尾，Socket已经被关闭了，此时将再次去读取
            if(first==-1){
                break;
            }
            int second =inputStream.read();
            int length = (first<<8) + second;

            //然后构造一个指定长度的byte数组
            bys = new byte[length];
            //随后读取指定长度的消息即可
            inputStream.read(bys);
            System.out.println("get message from client"+new String (bys,"UTF-8"));
        }
        inputStream.close();
        socket.close();
        server.close();
    }
}
