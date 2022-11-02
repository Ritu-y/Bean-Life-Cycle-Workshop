package com.cybage.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cybage.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println("Spring Context initialized");
    	CustomerService customerService=(CustomerService) ctx.getBean("customerService");
    	System.out.println("Bean retrieved from Spring Context");
    	System.out.println("Customer Name:"+customerService.getCustomer().getCname()+" Customer Id: "+customerService.getCustomer().getCid());
    	((ClassPathXmlApplicationContext) ctx).close();
    	System.out.println("Spring Context Closed");
    	
    }
}
