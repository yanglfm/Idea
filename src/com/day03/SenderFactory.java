package com.day03;

public class SenderFactory {

	public Sender produce(String type) {
		if(type.equals("mail")) {
			
			return new MailSender();
		}else if(type.equals("sms")) {
			return new SmsSender();
		}else {
			System.out.println("输入的类型不正确！！！");
			return null;
		}
	}
	
	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		
		Sender send = factory.produce("mail21");
		
		send.sender();
	}
}
