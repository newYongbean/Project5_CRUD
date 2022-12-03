package com.mycompany.myapp.vo;

import java.util.Date;

public class ITEMSVO { // productName, image, price, discount, quantity, brandName, phoneNum, brandemail, brandAddress, descriptions
	private int seq;
	private String productName;
	private String image;
	private int price;
	private double discount;
	private int quantity;
	private String brandName;
	private String phoneNum;
	private String brandemail;
	private String brandAddress;
	private String descriptions;
	private Date regdate;


	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBrandemail() {
		return brandemail;
	}

	public void setBrandemail(String brandemail) {
		this.brandemail = brandemail;
	}

	public String getBrandAddress() {
		return brandAddress;
	}

	public void setBrandAddress(String brandAddress) {
		this.brandAddress = brandAddress;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}
