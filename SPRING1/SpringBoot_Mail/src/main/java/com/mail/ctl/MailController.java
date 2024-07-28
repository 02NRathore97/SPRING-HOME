package com.mail.ctl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	private JavaMailSender sender;

	@PostMapping("/send")
	public String sendMail() {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		try {

			helper.setTo("rathoreneeraj448@gmail.com");
			helper.setText("Hii this is Neeraj.....");
			helper.setSubject("SpringBootmailTesting");
		} catch (Exception e) {
			e.printStackTrace();
			return "error in sending email....";
		}
		sender.send(message);
		return "Mail sent successfully.....";
	}
}
