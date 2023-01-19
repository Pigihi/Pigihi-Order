/**
 * 
 */
package com.pigihi.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pigihi.model.OrderedProductModel;

import lombok.Data;

/**
 * @author Ashish Sam T George
 *
 */
@Document(collection = "order_collection")
@Data
public class OrderEntity {
	
	@Id
	private String id;
	private String custId;
	private List<OrderedProductModel> products;
	private double totalAmt;
	private long time;
	private OrderStatusEnum status = OrderStatusEnum.PENDING;
	private String txnToken;
	private String addressId;

}
