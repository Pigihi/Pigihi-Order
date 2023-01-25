/**
 * 
 */
package com.pigihi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model class for Ordered Product
 * 
 * @author Ashish Sam T George
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedProductModel {
	
	private String prodId;
	private String shopId;
	private int quantity;
	private double price;

}
