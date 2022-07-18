package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@Controller
public class ItemController {
		
		private ItemService itemService;

		public ItemController(ItemService itemService) {
			super();
			this.itemService = itemService;
		}
		
		//handler
		@GetMapping("/items")
		public String listItems(Model model) { 
			model.addAttribute("items", itemService.getAllItems());
			return "items";
		
		}
		
		@GetMapping("/items/new")
		public String createItemForm(Model model) {
			
			//obj holds item from data
			Item item = new Item();
			model.addAttribute("item", item);
			return "create_item";
		}
		
		@PostMapping("/items")
		public String saveItem(@ModelAttribute("item") Item item) {
			itemService.saveItem(item);
			return "redirect:/items";
			
		}
		
		@GetMapping("/items/edit/{id}")
		public String editItemForm(@PathVariable Long id, Model model) {
			 model.addAttribute("item", itemService.getItemById(id));
			 return "edit_item";
		}
		
		@PostMapping("/items/{id}")
		public String updateItem(@PathVariable Long id, @ModelAttribute("item") Item item, Model model) {
			String d = item.getPrice();
			int count = 0;
			  for(int i=0; i < d.length(); i++)
			    {    if(d.charAt(i) == '$')
			            count++;
			    }
			String dollarlessPrice = d.substring(0, d.length()-(count));
			Item existingItem = itemService.getItemById(id);
			existingItem.setId(id);
			existingItem.setName(item.getName());
			existingItem.setDescription(item.getDescription());
			existingItem.setBrand(item.getBrand());
			existingItem.setPrice(dollarlessPrice);
			
			itemService.updateItem(existingItem);
			return "redirect:/items";
		}
		
		//handler delete
		@GetMapping("/items/{id}")
		public String deleteItem(@PathVariable Long id) {
			itemService.deleteItemById(id);
			return "redirect:/items";
		}
		
}