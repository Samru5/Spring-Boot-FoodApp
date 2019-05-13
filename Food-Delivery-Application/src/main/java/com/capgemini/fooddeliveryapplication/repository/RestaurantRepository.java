package com.capgemini.fooddeliveryapplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.fooddeliveryapplication.entity.Restaurant;


public interface RestaurantRepository  extends JpaRepository<Restaurant, Integer>{

}
