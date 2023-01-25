/**
 * 
 */
package com.pigihi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pigihi.entity.OrderEntity;
import com.pigihi.model.OrderModel;
import com.pigihi.model.OrderedProductModel;
import com.pigihi.repository.OrderRepository;

/**
 * Implementation class for Order service interface
 * 
 * @author Ashish Sam T George
 *
 */
public class CustomerOrderService implements OrderServiceInterface {
	
	@Autowired
	private OrderRepository orderRepository;

	/**
	 * Create order
	 * 
	 * @param customerId
	 * @param orderModel
	 * @return JSON string
	 * 
	 * @see OrderedProductModel
	 * @see OrderEntity
	 * 
	 * @author Ashish Sam T George
	 * 
	 */
	@Override
	public String[] createOrder(String customerId, OrderModel orderModel) {

		// Get list of products from the customer input
		List<OrderedProductModel> orderProduct = orderModel.getOrderedProductList();
		
		List<OrderedProductModel> orderedProducts = new ArrayList<OrderedProductModel>();
		double totalAmt = 0.00;
		
		//TODO Change this logic of making query to get information of each item
		
		for (OrderedProductModel item : orderProduct) {
			//TODO Accept the product details
			//TODO Only need id and price for now
			//TODO Do a get request to product microservice to get the product details
			//TODO Accept the response as json and extract the required information
//			ProductEntity prod = findProductById(item.getProdId());
			String prodId = "";
			Double prodPrice = 0.0;
			OrderedProductModel odl = new OrderedProductModel();		
//			odl.setProdId(prod.getId());
			odl.setProdId(prodId);
			odl.setShopId(item.getShopId());
			odl.setQuantity(item.getQuantity());
//			odl.setPrice(prod.getPrice());
			odl.setPrice(prodPrice);
			orderedProducts.add(odl);
			
			totalAmt += (prodPrice * item.getQuantity());
		}
		
		long time = System.currentTimeMillis();
		 
		OrderEntity order = new OrderEntity();
		order.setCustId(customerId);
		order.setProducts(orderedProducts);
		order.setTotalAmt(totalAmt);
		order.setTime(time);
		order.setAddressId(orderModel.getAddress());		 
		 
		OrderEntity savedOrder = orderRepository.save(order);
		String[] orderIdAndAmount = {savedOrder.getId(), totalAmt + ""};
		 
		//TODO Return as JSON string
		
		return orderIdAndAmount;
		
	}

}
