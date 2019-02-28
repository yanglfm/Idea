package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer2 {
    public static void main(String[] args) throws IOException {
        //ָ�������Ķ˿ڣ�ģ�⣩
        int port = 555;
        //�������񣬾��ǽ�һ��������
        ServerSocket server = new ServerSocket(port);
        //����һ���ڵȴ�������
        System.out.println("sever��һ���ڵȴ����ӵĵ���");
        Socket socket = server.accept();//ServerSocket ����ķ���accept():����Ҫ���ӵ����׽��ֲ�������������ֵ�ǣ�Socket����
        //���������ӹ���Ҫ��socket�л�ȡ�����������������������ж�ȡ
        InputStream inputStream = socket.getInputStream();//Socket ����ķ���getInputStream()�����ش��׽��ֵ���������
        //����Ȼ��ȡ�����ˣ������������ַ�����
        byte[] bys = new byte[1024];//һ������Ϊ1024
        int len;
        //����StringBuild����StringBuffer���ַ���������ƴ��
        StringBuilder sb = new StringBuilder();
        //ѭ����ȡ����
        while ((len = inputStream.read(bys)) != -1) {//public int read(byte[] b)�������ȡ�������������ֽ������������û�и�������ݣ���Ϊ�Ѿ���������ĩβ������ -1 ��
            //ע��Ҫָ���ַ������ʽ�����ͷ��ͽ��ܷ�һ��Ҫͳһ������ʹ��UTF-8
            sb.append(new String(bys, 0, len, "UTF-8"));
        }
        //��Ϣ�Ǵӿͻ�������
        System.out.println("get message from client" + sb);

        OutputStream outputStream = socket.getOutputStream();
        //�ӷ�����ٷ��ص��ͻ��˵���Ϣ
        outputStream.write("hello client,I get you message.".getBytes("UTF-8"));
        inputStream.close();
        outputStream.close();
        socket.close();
        server.close();
    }
}

