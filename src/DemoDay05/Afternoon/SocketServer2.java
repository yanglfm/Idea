package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer2 {
    public static void main(String[] args) throws IOException {
        //指定监听的端口（模拟）
        int port = 555;
        //创建服务，就是建一个服务器
        ServerSocket server = new ServerSocket(port);
        //服务一致在等待连接中
        System.out.println("sever将一致在等待连接的到来");
        Socket socket = server.accept();//ServerSocket 里面的方法accept():侦听要连接到此套接字并接受它。返回值是：Socket类型
        //建立好连接过后，要从socket中获取输入流，并建立缓冲区进行读取
        InputStream inputStream = socket.getInputStream();//Socket 里面的方法getInputStream()：返回此套接字的输入流。
        //流既然读取出来了，接下来创建字符数组
        byte[] bys = new byte[1024];//一般设置为1024
        int len;
        //利用StringBuild或者StringBuffer将字符串的内容拼接
        StringBuilder sb = new StringBuilder();
        //循环读取内容
        while ((len = inputStream.read(bys)) != -1) {//public int read(byte[] b)结果：读取到缓冲区的总字节数，或者如果没有更多的数据，因为已经到达流的末尾，则是 -1 。
            //注意要指定字符编码格式，发送方和接受方一定要统一，建议使用UTF-8
            sb.append(new String(bys, 0, len, "UTF-8"));
        }
        //信息是从客户端来的
        System.out.println("get message from client" + sb);

        OutputStream outputStream = socket.getOutputStream();
        //从服务端再返回到客户端的消息
        outputStream.write("hello client,I get you message.".getBytes("UTF-8"));
        inputStream.close();
        outputStream.close();
        socket.close();
        server.close();
    }
}

