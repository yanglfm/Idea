package DemoDay05.Afternoon;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer3 {
    public static void main(String[] args) throws IOException {
        //ָ�������Ķ˿ڣ�ģ�⣩
        int port = 5555;
        //�������񣬾��ǽ�һ��������
        ServerSocket server = new ServerSocket(port);
        //����һ���ڵȴ�������
        System.out.println("sever��һ���ڵȴ����ӵĵ���");
        Socket socket = server.accept();//ServerSocket ����ķ���accept():����Ҫ���ӵ����׽��ֲ�������������ֵ�ǣ�Socket����
        //���������ӹ���Ҫ��socket�л�ȡ�����������������������ж�ȡ
        InputStream inputStream = socket.getInputStream();//Socket ����ķ���getInputStream()�����ش��׽��ֵ���������
        //����Ȼ��ȡ�����ˣ������������ַ�����

        //������ǰ��׼��������
       //�����ַ�����
        byte[] bys ;
        while(true){
            //��������Ҫ��ȡ�����ֽڱ�ʾ�ĳ���
            int first=inputStream.read();
            //�����ȡ��ֵΪ-1��˵����������ĩβ��Socket�Ѿ����ر��ˣ���ʱ���ٴ�ȥ��ȡ
            if(first==-1){
                break;
            }
            int second =inputStream.read();
            int length = (first<<8) + second;

            //Ȼ����һ��ָ�����ȵ�byte����
            bys = new byte[length];
            //����ȡָ�����ȵ���Ϣ����
            inputStream.read(bys);
            System.out.println("get message from client"+new String (bys,"UTF-8"));
        }
        inputStream.close();
        socket.close();
        server.close();
    }
}
