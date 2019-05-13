package com.capgemini.fooddeliveryapplication.dish.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fooddeliveryapplication.dish.entity.Dish;
import com.capgemini.fooddeliveryapplication.dish.repository.DishRepository;
import com.capgemini.fooddeliveryapplication.dish.service.DishService;

@Service
public class DishServiceImpl implements DishService{

	@Autowired
	private DishRepository dish;
	
	@Override
	public List<Dish> getDishes() {
		return dish.findAll();
	}

	@Override
	public Dish getDishById(int dishId) {
		return dish.findById(dishId).get();
	}

	
	
	
}
