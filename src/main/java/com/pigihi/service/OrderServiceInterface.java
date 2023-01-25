/**
 * 
 */
package com.pigihi.service;

import com.pigihi.model.OrderModel;

/**
 * Interface for order service
 * 
 * @author Ashish Sam T George
 *
 */
public interface OrderServiceInterface {

	String[] createOrder(String customerId, OrderModel orderModel);

}
