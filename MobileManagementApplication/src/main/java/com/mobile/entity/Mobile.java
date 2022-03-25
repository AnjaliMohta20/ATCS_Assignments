package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Annotations
@Table(name="MobileX")
public class Mobile {
	@Id
	@Column(name="id",length=10)
	private int mobileId;                                     //Mobile table
	@Column(name="mobileNameX",length=10)
	private String mobileName;                               //in the database the column names and table will be shown
	@Column(name="mobileTypeX",length=10)
	private String mobileType;
	@Column(name="mobilePriceX",length=10)
	private int mobilePrice;
	@Column(name="mobileWarenty",length=10)
	private int mobileWarenty;                          //in the post man the real names are used instead of column name
	@Column(name="mobileIMEINumberX",length=10)
	private int mobileIMEINumber;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {      //methods
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileWarenty() {
		return mobileWarenty;
	}
	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileId, String mobileName, String mobileType, int mobilePrice, int mobileWarenty,
			int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	

}
