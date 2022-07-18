package com.example.frosty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frosty.repository.ItemRepository;
import com.example.frosty.model.Item;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	//get items
	@GetMapping("/items")
	public List<Item> getAllItems(){
	return itemRepository.findAll();
	}
	
	//CREATE REST
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}	
	

}

