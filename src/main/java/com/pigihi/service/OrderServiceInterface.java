/**
 * 
 */
package com.pigihi.service;

import java.io.IOException;

import com.pigihi.model.OrderModel;

/**
 * Interface for order service
 * 
 * @author Ashish Sam T George
 *
 */
public interface OrderServiceInterface {

	String[] createOrder(String customerId, OrderModel orderModel) throws IOException, InterruptedException;

}
