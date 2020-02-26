package com.sapient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="product")
public class ProductBean {
	@Id
	int productId;
	@Column
	String name;
	@Column
	float price;
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
