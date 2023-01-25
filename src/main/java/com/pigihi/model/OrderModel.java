/**
 * 
 */
package com.pigihi.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model class for Order
 * 
 * @author Ashish Sam T George
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

	private List<OrderedProductModel> orderedProductList;
	//TODO Rather than storing address in a different database and
	// using the addressId here, store all the addresses within the
	// corresponding users itself.
	//TODO This string might be a json string or something
	private String address;
}
//TODO In the front-end, fetch the already existing addresses when the
// user types in the delivery address
