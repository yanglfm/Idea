package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient1 {
    public static void main(String[] args) throws IOException {
        //���������ӵ��������ϵ�IP��ַ
        String host="127.0.0.1";
        int port=5555;//�˿�Ҫһ�£������ͨ
        //Ҫ���������������
        Socket socket=new Socket(host,port);//�������ַ���˿ںţ�
        //�������Ӻ�Ҫ��ȡ�������
        OutputStream out = socket.getOutputStream();
        //
        String message="��� ����!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
       //�ر���
        out.close();
        socket.close();
    }
    //�ȿ�������ˣ��ٿ����ͻ���
}