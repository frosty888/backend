package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Item;
 
public interface ItemService {
	List<Item> getAllItems();
	
	Item saveItem(Item item);
	
	Item getItemById(Long id);
	Item updateItem(Item item);
	void deleteItemById(Long id);

}
