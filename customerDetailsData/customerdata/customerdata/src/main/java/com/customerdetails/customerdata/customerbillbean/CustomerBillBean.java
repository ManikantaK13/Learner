package com.customerdetails.customerdata.customerbillbean;

import lombok.*;

@Getter
@Setter
public class CustomerBillBean {
	public static String invoiceId;
	public static String billCode;

	public CustomerBillBean(String invoiceId, String billCode) {
		this.invoiceId = invoiceId;
		this.billCode = billCode;
	}

	public CustomerBillBean() {
		super();
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

	public  void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	
}
