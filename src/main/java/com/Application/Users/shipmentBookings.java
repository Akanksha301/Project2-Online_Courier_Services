package com.Application.Users;

public class shipmentBookings {
	
	String username ;
	String datetime ;

	String paddress  ;
	String pcountry  ;
	long ppincode  ;
	
	String daddress  ;
	String dcountry  ;
	long dpincode  ;
	
	double height ;
	double width ;
	double weight ;
	
	String deliveryType ;

	public shipmentBookings(String username, String datetime, String paddress, String pcountry, long ppincode, String daddress,
			String dcountry, long dpincode, double height, double width, double weight, String deliveryType) {
		super();
		this.username = username;
		this.datetime = datetime;
		this.paddress = paddress;
		this.pcountry = pcountry;
		this.ppincode = ppincode;
		this.daddress = daddress;
		this.dcountry = dcountry;
		this.dpincode = dpincode;
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.deliveryType = deliveryType;
	}

	public shipmentBookings() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setId(String username) {
		this.username = username;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getPcountry() {
		return pcountry;
	}

	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}

	public long getPpincode() {
		return ppincode;
	}

	public void setPpincode(long ppincode) {
		this.ppincode = ppincode;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String getDcountry() {
		return dcountry;
	}

	public void setDcountry(String dcountry) {
		this.dcountry = dcountry;
	}

	public long getDpincode() {
		return dpincode;
	}

	public void setDpincode(long dpincode) {
		this.dpincode = dpincode;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	
}
