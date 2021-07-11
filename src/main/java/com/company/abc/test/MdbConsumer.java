package com.company.abc.test;

import javax.ejb.*;
import javax.jms.*;

//@MessageDriven(activationConfig = {
//    @ActivationConfigProperty(propertyName = "resourceAdapter", propertyValue = "artemis-rar"),
//    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
//    @ActivationConfigProperty(propertyName = "destination", propertyValue = "SOMEQUEUE")})
public class MdbConsumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        
        System.out.println("Got some message");
    }
    
}
