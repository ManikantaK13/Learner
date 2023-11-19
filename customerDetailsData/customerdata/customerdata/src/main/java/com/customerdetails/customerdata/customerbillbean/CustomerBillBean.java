package com.customerdetails.customerdata.customerbillbean;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="customerbill")
public class CustomerBillBean {
	
	@Id
	@Column(name = "Id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public static int id;
	@Column(name = "InvoiceId", nullable = false)
	public static String invoiceId;
	@Column(name = "BillCode", nullable = false)
	public static String billCode;

	public CustomerBillBean(int id,String invoiceId, String billCode) {
		this.id=id;
		this.invoiceId = invoiceId;
		this.billCode = billCode;
	}



	public static String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public static String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

}
