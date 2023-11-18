package com.customerdetails.customerdata.customer;

import com.customerdetails.customerdata.customerbillbean.*;
import lombok.*;
import java.util.*;



@Getter
@Setter
public class CustomerBean extends CustomerBillBean {

	
	public int id;
	public String firstName;
	public String lastName;
	public String grocery;
	public String money;
	public List<CustomerBillBean> customerbillbean;
//	public String billCode = CustomerBillBean.getBillCode();
//	public String invoiceId = CustomerBillBean.getInvoiceId();

	public CustomerBean(int id, String firstName, String lastName, String grocery,String money,String billCode,String invoiceId) {
		super(billCode,invoiceId);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grocery = grocery;
		this.money = money;
	}

	public CustomerBean() {
		super();
	}

}
