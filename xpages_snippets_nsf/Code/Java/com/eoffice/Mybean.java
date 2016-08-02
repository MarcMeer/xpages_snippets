package com.eoffice;

import java.io.Serializable;

public class Mybean implements Serializable {

	private static final long serialVersionUID = -3538943223480277573L;

	private String rondeOptie1T = "1";
	private String ophalenInternetT = "0";
	private String ophalenIntranetT = "1";
	public void setRondeOptie1T(String rondeOptie1T) {
		this.rondeOptie1T = rondeOptie1T;
	}
	public String getRondeOptie1T() {
		return rondeOptie1T;
	}
	public void setOphalenInternetT(String ophalenInternetT) {
		this.ophalenInternetT = ophalenInternetT;
	}
	public String getOphalenInternetT() {
		return ophalenInternetT;
	}
	public void setOphalenIntranetT(String ophalenIntranetT) {
		this.ophalenIntranetT = ophalenIntranetT;
	}
	public String getOphalenIntranetT() {
		return ophalenIntranetT;
	}
	
}
