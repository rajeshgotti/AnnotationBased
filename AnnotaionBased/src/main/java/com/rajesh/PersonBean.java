package com.rajesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonBean {

	private int PersonId;
	private String PersonName;
	
	public int getPersonId() {
		return PersonId;
	}
	@Value("101")
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	@Value("RAJESH")
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	
	
	public PersonBean() {
System.out.println("++ Person Bean Constructor ++");
	}
	public void print() {
		System.out.println("PersonId : "+PersonId);
		System.out.println("PersonName :"+PersonName);
	}
	
}
