package com.ordering.orderingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/order")
public class OrderingController {
	
	@Autowired
	private OrderInfoRepository orderInfoRepository;
	
	@GetMapping(path="/{customerId}")
	public @ResponseBody Iterable<OrderInfo> getOrderInfoByCustomerId(@PathVariable Integer customerId) {
		return orderInfoRepository.findByCustomerId(customerId);
	}
	
	@GetMapping
	public @ResponseBody Iterable<OrderInfo> getAllOrders() {
		return orderInfoRepository.findAll();
	}
	
}
