package com.capgemini.fooddeliveryapplication.cart.entity;

import java.util.List;


import com.capgemini.fooddeliveryapplication.dish.entity.Dish;

import javax.persistence.*;

@Entity
public class Cart {

	@Id
	private int orderId;
	private int dishId;
	private int price;
	private String dishName;
	private int quantity;
	private int total;
	
	private List<Dish> dish;
	
	public Cart() {
		super();
	}

	

	public Cart(int orderId, int dishId, int price,String dishName, int quantity, int total) {
		super();
		this.orderId = orderId;
		this.dishId = dishId;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.dishName=dishName;
	}

	public String getDishName() {
		return dishName;
	}



	public void setDishName(String dishName) {
		this.dishName = dishName;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public List<Dish> getDish() {
		return dish;
	}

	public void setDish(List<Dish> dish) {
		this.dish = dish;
	}
	
}
