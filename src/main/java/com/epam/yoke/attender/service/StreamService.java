package com.epam.yoke.attender.service;

import com.epam.yoke.attender.NotifierProcessor;
import com.epam.yoke.attender.model.rq.AttenderEventBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(NotifierProcessor.class)
public class StreamService {

    @Autowired
    private NotifierProcessor notifierProcessor;

    public void addAttenderToEvent(AttenderEventBody eventAttender) {
        notifierProcessor.addEventAttender().send(MessageBuilder.withPayload(eventAttender).build());
    }

    public void deleteAttenderFromEvent(AttenderEventBody eventAttender) {
        notifierProcessor.deleteEventAttender().send(MessageBuilder.withPayload(eventAttender).build());
    }
}
