/**
 * 
 */
package com.pigihi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pigihi.model.OrderModel;
import com.pigihi.service.OrderServiceInterface;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Controller class for handling order API requests
 * 
 * @author Ashish Sam T George
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/user/order")
public class OrderController {
	
	@Autowired
	private OrderServiceInterface customerOrderService;
	
	//TODO Create order
	//TODO Check whether CoD
	//TODO Initiate paytm transaction only if not CoD
	//TODO Returns JSON response along with orderId
	
	/**
	 * Create order
	 * 
	 * @param orderModel
	 * @param request
	 * @return JSON string
	 * 
	 * @author Ashish Sam T George
	 * 
	 */
	// Currently supports only orders from customers
	@PostMapping
	public String createOrder(@RequestBody OrderModel orderModel,
			HttpServletRequest request) {
		String customerId = request.getHeader("X-Pigihi-User-Subject");
		
		System.out.println("Address Received: " + orderModel.getAddress());
		
		//TODO Create endpoint in product service for finding sum of price of all the products
		
		//TODO Try to change this logic. Avoid using string array
		String[] orderIdAndAmount = customerOrderService.createOrder(customerId, orderModel);
		
		//TODO Call payment microservice
//		String response = paytmInitiate.initiateTransaction(orderIdAndAmount[0], orderIdAndAmount[1]);
		String response = "";
		
		//TODO Add orderId to response JSON and then return resonseJSON
		return response;
	
	}

}
//TODO Send delivery address to queue only if the order is paid and it is not take-away

//TODO Update order after payment
