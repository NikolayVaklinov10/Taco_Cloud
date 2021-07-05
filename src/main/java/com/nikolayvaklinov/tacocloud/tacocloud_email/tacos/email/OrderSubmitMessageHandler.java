package com.nikolayvaklinov.tacocloud.tacocloud_email.tacos.email;

import java.util.Map;

import org.springframework.integration.handler.GenericHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderSubmitMessageHandler
        implements GenericHandler<OrderEmail> {

    private RestTemplate rest;
    private ApiProperties apiProps;

    public OrderSubmitMessageHandler(ApiProperties apiProps, RestTemplate rest) {
        this.apiProps = apiProps;
        this.rest = rest;
    }

    @Override
    public Object handle(OrderEmail orderEmail, MessageHeaders headers) {
        rest.postForObject(apiProps.getUrl(), orderEmail, String.class);
        return null;
    }



}

