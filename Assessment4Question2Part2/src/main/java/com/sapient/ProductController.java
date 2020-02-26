package com.sapient;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductInterface ci;

	@GetMapping(value = "product/{productId}")
	public ProductBean getCustomer(@PathVariable int productId) {
		HashMap<Integer, ProductBean> data = new HashMap<>();
		ProductController ob = new ProductController();
		data = ob.initialiseData();
		ProductBean bean = data.get(productId);
		System.out.println(bean);

		if (bean == null)
			return null;
		else
			return bean;
	}

	public HashMap<Integer, ProductBean> initialiseData() {
		HashMap<Integer, ProductBean> data = new HashMap<>();
		ProductBean c1 = new ProductBean();
		ProductBean c2 = new ProductBean();
		ProductBean c3 = new ProductBean();
		ProductBean c4 = new ProductBean();
		ProductBean c5 = new ProductBean();
		c1.productId = 1;
		c1.name="Mortein";
		c1.price = 100.0f;
		c1.productId = 1;
		c2.name = "Coalgate";
		c2.price = 50.0f;
		c2.productId = 2;
		c3.name = "Nirma";
		c3.price = 300.0f;
		c3.productId = 3;
		c4.name = "Chawmanpraash";
		c4.price = 150.0f;
		c4.productId = 4;
		c5.name = "Bornvita";
		c5.price = 125.0f;
		c5.productId = 5;
		data.put(c1.productId, c1);
		data.put(c2.productId, c2);
		data.put(c3.productId, c3);
		data.put(c4.productId, c4);
		data.put(c5.productId, c5);
		return data;
	}

}
