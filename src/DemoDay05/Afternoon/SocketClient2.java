package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient2 {
    public static void main(String[] args) throws IOException {
        //���������ӵ��������ϵ�IP��ַ
        String host="127.0.0.2";
        int port=555;//�˿�Ҫһ�£������ͨ
        //Ҫ���������������
        Socket socket=new Socket(host,port);//�������ַ���˿ںţ�
        //�������Ӻ�Ҫ��ȡ�������
        OutputStream out = socket.getOutputStream();
        //
        String message="��� ����!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        //ͨ��shutdownOutput()���ٷ������ѷ��������ݣ�����ֻ�ܽ�������
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        //��ȡ����
        byte[] bys = new byte[1024];
        int len;
        StringBuilder sb=new StringBuilder();
        while((len=inputStream.read(bys))!=-1){
            sb.append(new String(bys,0,len,"UTF-8"));
        }
        //����ӷ���˴��ص���Ϣ
        System.out.println("get message from server��"+sb);
        //�ر���
        inputStream.close();
        out.close();
        socket.close();
    }
}
