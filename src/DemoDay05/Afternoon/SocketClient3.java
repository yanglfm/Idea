package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient3 {
    public static void main(String[] args) throws IOException {
        //首先是连接到服务器上的IP地址
        String host="127.0.0.1";
        int port=5555;//端口要一致，否则打不通
        //要与服务器建立连接
        Socket socket=new Socket(host,port);//（网络地址，端口号）
        //建立连接后要获取的输出流
        OutputStream outputStream = socket.getOutputStream();
        //
        String message="你好 张三!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        //首先计算得知消息的长度
        byte []sendBytes=message.getBytes("UTF-8");
        //然后将消息的长度优先发送出去
        outputStream.write(sendBytes.length>>8);
        outputStream.write(sendBytes.length);
        //然后将消息再次发送回去
        outputStream.write(sendBytes);
        outputStream.flush();

        //此处重复发送一次消息
        message="这是第二条消息";
        sendBytes=message.getBytes("UTF-8");
        outputStream.write(sendBytes.length>>8);//往右移八位
        outputStream.write(sendBytes.length);
        outputStream.flush();

        message="这是第三条消息";
        sendBytes=message.getBytes("UTF-8");
        outputStream.write(sendBytes.length>>8);//往右移八位
        outputStream.write(sendBytes.length);

        outputStream.close();
        socket.close();
    }
}
