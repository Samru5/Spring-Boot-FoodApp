package com.capgemini.fooddeliveryapplication.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.fooddeliveryapplication.cart.entity.Cart;
import com.capgemini.fooddeliveryapplication.cart.service.CartService;
import com.capgemini.fooddeliveryapplication.dish.entity.Dish;
import com.capgemini.fooddeliveryapplication.dish.service.DishService;

@RestController
@CrossOrigin("*")
public class CartController {

	@Autowired
	private CartService service;
	
	@Autowired
	private DishService dishService;
	
	

	@GetMapping("cart/dishes")
public ResponseEntity<List<Dish>> getDishes()
	{
		List<Dish> dishes = service.getDishInformation();
		return new ResponseEntity<List<Dish>>(dishes, HttpStatus.OK);
	}
	
//	  public Cart addToCart(@RequestBody Dish dishes)
//	 public  ResponseEntity<Cart> addToCart(@RequestBody Dish dishes) {
//		 Cart cart=service.addToCart(dishes);
//	 Cart cart=repo.save(new Dish(dishes.getDishId(),dishes.getDishName(),dishes.getDishPrice()));
//		Cart cart=  repo.saveAll(dishes);
//	 
//	    return new ResponseEntity<Cart>(cart, HttpStatus.OK);
//	  }
	
	
	
//	 
//	 @PostMapping("cart/dishes/add/{id}")
//
//	 public ResponseEntity<Cart> addNew(@PathVariable(value="id") Integer dishId) {
////		 Cart cart = service.add(dish.getDishId());
//		 Cart cart = service.add(dishId);
//
//
//		 return new ResponseEntity<Cart>(cart, HttpStatus.OK);
//		}
//	
	
	
	@PutMapping("add/{id}")
	public ResponseEntity<Cart> update(@PathVariable(value="id") Integer dishId,@RequestBody Dish dish){
		//List<Dish> dish=service.getDishInformation();
	Cart cart=new Cart();	
	Dish dish1=service.getDishById(dishId);
	cart.setDishName(dish1.getDishName());
	cart.setPrice(dish1.getDishPrice());
	
//	if(dish1.getDishId()==dishId) {
		
		cart.setQuantity(cart.getQuantity());
		
		
//	}
		
		
		return ResponseEntity.ok(service.add(cart));
		
	}
}
