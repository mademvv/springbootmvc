package com.slashcode.employee.model;


//https://getbootstrap.com/docs/4.0/components/forms/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Generic_Fields {
	

	public Generic_Fields() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	private int docId;
	public Generic_Fields(String correlation_ID, String communication_Type) {
		super();
		this.correlation_ID = correlation_ID;
		this.communication_Type = communication_Type;
	}

	
	private String correlation_ID;
	private String communication_Type;
	private String account_Number;
	private String eCI;
	
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getCorrelation_ID() {
		return correlation_ID;
	}
	public void setCorrelation_ID(String correlation_ID) {
		this.correlation_ID = correlation_ID;
	}
	public String getCommunication_Type() {
		return communication_Type;
	}
	public void setCommunication_Type(String communication_Type) {
		this.communication_Type = communication_Type;
	}
	public String getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(String account_Number) {
		this.account_Number = account_Number;
	}
	public String geteCI() {
		return eCI;
	}
	public void seteCI(String eCI) {
		this.eCI = eCI;
	}

	
	
	

	
	
	
	
	
	
	
	
}
