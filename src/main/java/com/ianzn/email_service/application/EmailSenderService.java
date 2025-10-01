package com.ianzn.email_service.application;

import com.ianzn.email_service.adapters.EmailSenderGateway;
import com.ianzn.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
        this.emailSenderGateway = emailGateway;
    }
    public void sendEmail(String to, String subject, String body) {

    }
}
