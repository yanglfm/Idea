package com.day03;

public class SenderFactory3 {

	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
	
	public static void main(String[] args) {
		
		Sender s = SenderFactory3.produceMail();
		s.sender();
	}
	
}
