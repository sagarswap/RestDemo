package com.sapient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerInterface ci;

	@GetMapping(value="customer/{customerId}")
	public CustomerBean getCustomer(@PathVariable int customerId) {
		HashMap<Integer, CustomerBean> data=new HashMap<>();
		CustomerController ob=new CustomerController();
		data=ob.initialiseData();
		CustomerBean bean=data.get(customerId);
		System.out.println(bean);
		
		if(bean==null)
			  return null;
		else
			return bean;
	}
	
	public HashMap<Integer, CustomerBean> initialiseData(){
		HashMap<Integer, CustomerBean> data=new HashMap<>();
		CustomerBean c1=new CustomerBean();
		CustomerBean c2=new CustomerBean();
		CustomerBean c3=new CustomerBean();
		CustomerBean c4=new CustomerBean();
		CustomerBean c5=new CustomerBean();
		c1.name="Swapnil";
		c1.city="Ranchi";
		c1.customerId=1;
		c1.productList=new ArrayList<>();
		c1.productList.add(1);
		c1.productList.add(2);
		c2.name="Garvit";
		c2.city="Mumbai";
		c2.customerId=2;
		c2.productList=new ArrayList<>();
		c2.productList.add(1);
		c2.productList.add(2);
		c2.productList.add(3);
		c3.name="Rohit";
		c3.city="Coimbatore";
		c3.customerId=3;
		c3.productList=new ArrayList<>();
		c3.productList.add(1);
		c3.productList.add(2);
		c3.productList.add(3);
		c3.productList.add(4);
		c4.name="Bruce";
		c4.city="Gotham";
		c4.customerId=4;
		c4.productList=new ArrayList<>();
		c4.productList.add(1);
		c4.productList.add(2);
		c4.productList.add(3);
		c4.productList.add(4);
		c4.productList.add(5);
		c5.name="Clark";
		c5.city="Metropolis";
		c5.customerId=5;
		c5.productList=new ArrayList<>();
		c5.productList.add(3);
		c5.productList.add(4);
		c5.productList.add(5);
		data.put(c1.customerId, c1);
		data.put(c2.customerId, c2);
		data.put(c3.customerId, c3);
		data.put(c4.customerId, c4);
		data.put(c5.customerId, c5);
		return data;
	}

}
