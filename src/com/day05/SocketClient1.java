package com.day05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient1 {

	public static void main(String[] args) throws Exception, IOException {
		//首先是连接到服务器上的IP地址
		String host="127.0.0.1";
		int port = 5555;
		//要与服务器建立连接
		Socket socket = new Socket(host, port);
		
		//建立连接后要获取的输出流
	 	OutputStream out = socket.getOutputStream();
	 	
	 	String message="你好 张三！！！";
	 	socket.getOutputStream().write(message.getBytes("UTF-8"));
	 	
	 	//关闭流
	 	out.close();
	 	socket.close();
	}
}
