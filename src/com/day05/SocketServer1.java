package com.day05;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer1 {

	//假设这是一个网络服务器
	public static void main(String[] args) throws Exception {
		//指定监听的端口
		int port = 5555;
		//创建服务
		ServerSocket server = new ServerSocket(port);
		//服务一致在等待连接中
		System.out.println("server将一直等待连接的到来");
		Socket socket = server.accept();
		//建立好连接过后，要从socket中获取输入流，并建立缓冲区并进行读取
		InputStream inputStream = socket.getInputStream();
		//创建字符数组
		byte [] bys = new byte[1024];
		int len;
		//字符串的内容拼接
		StringBuilder sb = new StringBuilder();
		//循环读取内容
		while((len = inputStream.read(bys))!=-1) {
			//注意指定字符编码格式，发送方和接受方一定要统一 建议使用UTF-8
			sb.append(new String(bys, 0, len, "UTF-8"));
		}
		//信息是从客户端来的
		System.out.println("get message from client:"+sb);
		//关闭流
		inputStream.close();
		socket.close();
		server.close();
	}
}
