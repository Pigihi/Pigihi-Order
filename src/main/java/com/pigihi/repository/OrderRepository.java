/**
 * 
 */
package com.pigihi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pigihi.entity.OrderEntity;

/**
 * Repository class for Order
 * 
 * @author Ashish Sam T George
 *
 */
public interface OrderRepository extends MongoRepository<OrderEntity, String> {

}
