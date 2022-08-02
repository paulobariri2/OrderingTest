package com.ordering.orderingtest;

import java.sql.Date;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderingtestApplication {

	private static final Logger log = LoggerFactory.getLogger(OrderingtestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OrderingtestApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner createCustomerData(CustomerRepository repository) {
		return (args) -> {
			log.info("Creating customers...");
			Customer cust = new Customer("John Doe", "CPF", "12345678909", "123456", "Residential");
			repository.save(cust);
			repository.save(new Customer("Jane Doe", "CPF", "12345092137", "123454", "Residential"));
			repository.save(new Customer("Ozzy", "CPF", "12345665540", "345321", "Corporate"));
			repository.save(new Customer("David Gilmour", "CPF", "12345612347", "123796", "Residential"));
			
			log.info("Customers created: ");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			
		};
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public CommandLineRunner createOrderInfoData(OrderInfoRepository repository) {
		return (args) -> {
			log.info("Creating orders...");
			repository.save(new OrderInfo(new Date(121, 10, 1), new Date(2021, 10, 4), "Done", 1));
			repository.save(new OrderInfo(new Date(121, 3, 1), new Date(2021, 3, 4), "Canceled", 1));
			repository.save(new OrderInfo(new Date(122, 1, 10), new Date(2022, 1, 24), "Done", 3));
			repository.save(new OrderInfo(new Date(121, 10, 1), new Date(2021, 10, 9), "Done", 2));
			repository.save(new OrderInfo(new Date(121, 11, 3), new Date(2021, 11, 18), "Done", 3));
			repository.save(new OrderInfo(new Date(121, 4, 6), new Date(2021, 10, 5), "Canceled", 4));
			repository.save(new OrderInfo(new Date(122, 7, 9), null, "Open", 1));
			repository.save(new OrderInfo(new Date(122, 2, 26), new Date(2022, 3, 2), "Done", 2));
		};
	}

	@Bean
	public CommandLineRunner createOrderActionData(OrderActionRepository repository) {
		return (args) -> {
			log.info("Creating order actions...");
			repository.save(new OrderAction("Done", 5, "Provide"));
			repository.save(new OrderAction("Done", 5, "Provide"));
			repository.save(new OrderAction("Cancelled", 6, "Change"));
			repository.save(new OrderAction("Cancelled", 6, "Change"));
			repository.save(new OrderAction("Done", 7, "Provide"));
			repository.save(new OrderAction("Done", 8, "Provide"));
			repository.save(new OrderAction("Done", 9, "Provide"));
			repository.save(new OrderAction("Done", 9, "Change"));
			repository.save(new OrderAction("Cancelled", 10, "Provide"));
			repository.save(new OrderAction("Done", 11, "Cease"));
			repository.save(new OrderAction("Open", 11, "Cease"));
			repository.save(new OrderAction("Done", 12, "Change"));
		};
	}
	
	@Bean
	public CommandLineRunner createProductData(ProductRepository repository) {
		return (args) -> {
			log.info("Creating products...");
			
			HashMap<String, String> tvAttrs = new HashMap<>();
			tvAttrs.put("package", "HBO plus");
			tvAttrs.put("number_of_tvs", "2");
			
			HashMap<String, String> internetAttrs = new HashMap<>();
			internetAttrs.put("download", "100");
			internetAttrs.put("upload", "10");
			
			HashMap<String, String> phoneAttrs = new HashMap<>();
			phoneAttrs.put("number", "19997709876");
			
			
			repository.save(new Product(100001, 0, "TV", "Active", 13, tvAttrs));
			repository.save(new Product(100002, 0, "Internet", "Active", 14, internetAttrs));
			repository.save(new Product(100001, 1, "TV", "Cancelled", 15, tvAttrs));
			repository.save(new Product(100002, 1, "Internet", "Cancelled", 16, internetAttrs));
			repository.save(new Product(100003, 0, "TV", "Active", 17, tvAttrs));
			repository.save(new Product(100004, 0, "Internet", "Active", 18, internetAttrs));
			repository.save(new Product(100003, 1, "TV", "Active", 20, tvAttrs));
			repository.save(new Product(100005, 0, "Phone", "Active", 19, phoneAttrs));
			repository.save(new Product(100006, 0, "TV", "Cancelled", 21, tvAttrs));
			repository.save(new Product(100001, 2, "TV", "Ceased", 22, tvAttrs));
			repository.save(new Product(100002, 2, "Internet", "To be ceased", 23, internetAttrs));
			repository.save(new Product(100004, 1, "Internet", "Active", 24, internetAttrs));
		};
	}
	
}
