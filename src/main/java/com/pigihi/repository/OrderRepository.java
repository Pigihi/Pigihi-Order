/**
 * 
 */
package com.pigihi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pigihi.entity.OrderEntity;

/**
 * @author Ashish Sam T George
 *
 */
public interface OrderRepository extends MongoRepository<OrderEntity, String> {

}
