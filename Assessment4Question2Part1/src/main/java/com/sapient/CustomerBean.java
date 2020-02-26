package com.sapient;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="customer")
public class CustomerBean {
	@Id
	int customerId;
	@Column
	String name;
	@Column
	String city;
	@Column
	ArrayList<Integer> productList;
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", name=" + name + ", city=" + city + ", productList="
				+ productList + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Integer> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Integer> productList) {
		this.productList = productList;
	}
}
