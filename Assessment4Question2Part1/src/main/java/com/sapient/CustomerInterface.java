package com.sapient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInterface extends JpaRepository<CustomerBean, Integer>{

}
