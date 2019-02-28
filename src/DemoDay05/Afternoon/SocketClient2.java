package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient2 {
    public static void main(String[] args) throws IOException {
        //首先是连接到服务器上的IP地址
        String host="127.0.0.2";
        int port=555;//端口要一致，否则打不通
        //要与服务器建立连接
        Socket socket=new Socket(host,port);//（网络地址，端口号）
        //建立连接后要获取的输出流
        OutputStream out = socket.getOutputStream();
        //
        String message="你好 张三!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        //通过shutdownOutput()高速服务器已发送完数据，后续只能接受数据
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        //读取数据
        byte[] bys = new byte[1024];
        int len;
        StringBuilder sb=new StringBuilder();
        while((len=inputStream.read(bys))!=-1){
            sb.append(new String(bys,0,len,"UTF-8"));
        }
        //输出从服务端带回的信息
        System.out.println("get message from server："+sb);
        //关闭流
        inputStream.close();
        out.close();
        socket.close();
    }
}
