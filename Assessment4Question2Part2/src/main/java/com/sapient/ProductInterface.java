package com.sapient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInterface extends JpaRepository<ProductBean, Integer>{

}
