package com.capgemini.fooddeliveryapplication.dish.entity;

import javax.persistence.*;

@Entity
public class Dish {

	@Id
	private int dishId;
	private String dishName;
	private int dishPrice;
	

	public Dish() {
		super();
	}

	public Dish(int dishId,  String dishName, int dishPrice) {
		super();
		this.dishId = dishId;

		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}

	

}
