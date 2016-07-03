package com.endava.application;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class AccountConsumer {

	public static final void main(String[] args) throws Exception {

		CamelContext context = new DefaultCamelContext();
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost:6181");
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("").to("jms:incomingOrders");
			}
		});
		context.start();
		Thread.sleep(10000);
		context.stop();
	}
}
