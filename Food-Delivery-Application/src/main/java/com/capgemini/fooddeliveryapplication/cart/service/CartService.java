package com.capgemini.fooddeliveryapplication.cart.service;

import java.util.List;


import com.capgemini.fooddeliveryapplication.cart.entity.Cart;
import com.capgemini.fooddeliveryapplication.dish.entity.Dish;

public interface CartService {
	public List<Dish> getDishInformation();
	
//	public Cart addToCart(Dish dishes);

//	public Cart add(Cart carts);
	
	public Dish getDishById(int dishId);
	
	public Cart add(Cart cart);

}
