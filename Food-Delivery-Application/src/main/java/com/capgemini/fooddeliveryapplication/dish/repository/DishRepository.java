package com.capgemini.fooddeliveryapplication.dish.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.fooddeliveryapplication.dish.entity.Dish;


public interface DishRepository extends JpaRepository<Dish, Integer> {

}
