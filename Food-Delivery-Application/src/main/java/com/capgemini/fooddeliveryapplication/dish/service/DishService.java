package com.capgemini.fooddeliveryapplication.dish.service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.fooddeliveryapplication.dish.entity.Dish;


public interface DishService {

	public List<Dish> getDishes();
	
	public Dish getDishById(int dishId);

}
