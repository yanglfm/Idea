package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient3 {
    public static void main(String[] args) throws IOException {
        //���������ӵ��������ϵ�IP��ַ
        String host="127.0.0.1";
        int port=5555;//�˿�Ҫһ�£������ͨ
        //Ҫ���������������
        Socket socket=new Socket(host,port);//�������ַ���˿ںţ�
        //�������Ӻ�Ҫ��ȡ�������
        OutputStream outputStream = socket.getOutputStream();
        //
        String message="��� ����!!!";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        //���ȼ����֪��Ϣ�ĳ���
        byte []sendBytes=message.getBytes("UTF-8");
        //Ȼ����Ϣ�ĳ������ȷ��ͳ�ȥ
        outputStream.write(sendBytes.length>>8);
        outputStream.write(sendBytes.length);
        //Ȼ����Ϣ�ٴη��ͻ�ȥ
        outputStream.write(sendBytes);
        outputStream.flush();

        //�˴��ظ�����һ����Ϣ
        message="���ǵڶ�����Ϣ";
        sendBytes=message.getBytes("UTF-8");
        outputStream.write(sendBytes.length>>8);//�����ư�λ
        outputStream.write(sendBytes.length);
        outputStream.flush();

        message="���ǵ�������Ϣ";
        sendBytes=message.getBytes("UTF-8");
        outputStream.write(sendBytes.length>>8);//�����ư�λ
        outputStream.write(sendBytes.length);

        outputStream.close();
        socket.close();
    }
}
