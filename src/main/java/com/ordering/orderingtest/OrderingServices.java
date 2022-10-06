package com.ordering.orderingtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderingServices {
	@Autowired
	private OrderInfoRepository orderInfoRepository;
	
	
	public Iterable<OrderInfo> findOrders(Integer customerId) {
		if (customerId != null) {
			return orderInfoRepository.findByCustomerId(customerId);
		}
		return orderInfoRepository.findAll();
	}
	
	public List<String> retrieveOrderActionsDetails(String orderId) {
	    return null;	
	}


}
