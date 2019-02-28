package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient1 {
    public static void main(String[] args) throws IOException {
        //首先是连接到服务器上的IP地址
        String host="127.0.0.1";
        int port=5555;//端口要一致，否则打不通
        //要与服务器建立连接
        Socket socket=new Socket(host,port);//（网络地址，端口号）
        //建立连接后要获取的输出流
        OutputStream out = socket.getOutputStream();
        //
        String message="你好 张三!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
       //关闭流
        out.close();
        socket.close();
    }
    //先开启服务端，再开启客户端
}
