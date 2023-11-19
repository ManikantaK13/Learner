package com.customerdetails.customerdata.customer;

import com.customerdetails.customerdata.customerbillbean.*;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;



@Getter
@Setter
@Entity
@Table(name="customer")
public class CustomerBean extends CustomerBillBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id",nullable=false)
	public int id;
	@Column(name="FirstName")
	public String firstName;
	@Column(name="LastName")
	public String lastName;
	@Column(name="Grocery")
	public String grocery;
	@Column(name="Money")
	public String money;
	
	
	public List<CustomerBillBean> customerbillbean;
//	public String billCode = CustomerBillBean.getBillCode();
//	public String invoiceId = CustomerBillBean.getInvoiceId();

	public CustomerBean(int id, String firstName, String lastName, String grocery,String money,String billCode,String invoiceId) {
		super(id,billCode,invoiceId);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grocery = grocery;
		this.money = money;
	}

}
