package com.ordering.orderingtest;

import java.util.ArrayList;
import java.util.List;

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
	private OrderingServices orderingServices;
	
	@GetMapping(path="/{customerId}")
	public @ResponseBody Iterable<OrderInfo> getOrderInfoByCustomerId(@PathVariable Integer customerId) {
		return orderingServices.findOrders(customerId);
	}
	
	@GetMapping
	public @ResponseBody Iterable<OrderInfo> getAllOrders() {
		return orderingServices.findOrders(null);
	}
	
	@GetMapping(path="/{orderId}/order-actions")
	public @ResponseBody List<String> getOrderActionsDetails(@PathVariable Integer orderId) {
		List<String> orderActionsDetails = new ArrayList<>();
		orderActionsDetails.add("| 100001 | Provide | Done |  13 | Active       | TV       |       0 | ");
		orderActionsDetails.add("| 100001 | Provide | Done |  14 | Active       | TV       |       0 | ");
		return orderActionsDetails;
	}
	
}
