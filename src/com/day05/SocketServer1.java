package com.day05;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer1 {

	//��������һ�����������
	public static void main(String[] args) throws Exception {
		//ָ�������Ķ˿�
		int port = 5555;
		//��������
		ServerSocket server = new ServerSocket(port);
		//����һ���ڵȴ�������
		System.out.println("server��һֱ�ȴ����ӵĵ���");
		Socket socket = server.accept();
		//���������ӹ���Ҫ��socket�л�ȡ�������������������������ж�ȡ
		InputStream inputStream = socket.getInputStream();
		//�����ַ�����
		byte [] bys = new byte[1024];
		int len;
		//�ַ���������ƴ��
		StringBuilder sb = new StringBuilder();
		//ѭ����ȡ����
		while((len = inputStream.read(bys))!=-1) {
			//ע��ָ���ַ������ʽ�����ͷ��ͽ��ܷ�һ��Ҫͳһ ����ʹ��UTF-8
			sb.append(new String(bys, 0, len, "UTF-8"));
		}
		//��Ϣ�Ǵӿͻ�������
		System.out.println("get message from client:"+sb);
		//�ر���
		inputStream.close();
		socket.close();
		server.close();
	}
}
