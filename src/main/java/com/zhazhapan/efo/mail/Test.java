package com.zhazhapan.efo.mail;

public class Test {

	public static void sendMail(String to,  String content){

		//StringWriter sw = new StringWriter();
		//这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.qq.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("mixfuc@foxmail.com");

		// 开通smtp等服务时，设置你的邮箱授权码
		// 此时输入的为邮箱的授权码，而不是你的邮箱密码
		mailInfo.setPassword("mzfwwhzijfombbeh");
		mailInfo.setFromAddress("mixfuc@foxmail.com");
		mailInfo.setToAddress(to);
		mailInfo.setSubject("登录信息找回");
		mailInfo.setContent(content);
		//这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		//sms.sendTextMail(mailInfo);//发送文体格式


		sms.sendHtmlMail(mailInfo);//发送html格式
	}

}
