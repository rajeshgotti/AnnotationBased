package com.rajesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerBean {
	
	private int CustomerId;
	private String CustomerName;
   public CustomerBean () {
	   System.out.println("++ CustomerBean Constructor ++");
   }
public int getCustomerId() {
	return CustomerId;
}
@Value("200")
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}@Value("Customer NAME IS yakub")
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public CustomerBean(int customerId, String customerName) {
	super();
	CustomerId = customerId;
	CustomerName = customerName;
}
@Override
public String toString() {
	return "CustomerBean [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + "]";
}
public void print2() {
	System.out.println("CustomerId : "+CustomerId);
	System.out.println(CustomerName);
}
   
}
