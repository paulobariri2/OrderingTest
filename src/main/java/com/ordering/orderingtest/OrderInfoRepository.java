package com.ordering.orderingtest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderInfoRepository extends CrudRepository<OrderInfo, Integer> {
	
	public List<OrderInfo> findByCustomerId(Integer customerId);

}
