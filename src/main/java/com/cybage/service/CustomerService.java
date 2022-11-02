package com.cybage.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.cybage.model.Customer;

public class CustomerService implements InitializingBean, DisposableBean {

	private Customer customer;
	
	
	public CustomerService() {
		System.out.println("Inside Default Constructor of CustomerService Class");
	}

	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void destroy() throws Exception {
		System.out.println("Inside EmployService Destroy Method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing to Dummy Value");
		if(customer.getCname()==null) {
			customer.setCname("Sam");
			customer.setCid(101);
		}
		
		
	}

}
