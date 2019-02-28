package com.day03;

public class SenderFactory2 {

	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		SenderFactory2 f = new SenderFactory2();
		Sender s = f.produceMail();
		s=f.produceSms();
		s.sender();
	}
	
}
