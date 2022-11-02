package com.cybage.model;


public class Customer {
	int cid;
	String cname;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		System.out.println("Inside CId Setter");
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		System.out.println("Inside CName Setter");
		this.cname = cname;
	}
	
}
