package com.capgemini.fooddeliveryapplication.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.fooddeliveryapplication.cart.entity.Cart;


public interface CartRepository extends JpaRepository<Cart, Integer>  {


//	public Cart saveAll(Dish dishes);

}
