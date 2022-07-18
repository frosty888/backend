package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Item item1 = new Item("Pencil", "Writing object", "Bic", "1.5$");
		itemRepository.save(item1);
		
		Item item2 = new Item("Another pencil", "Also a writing object", "offbrand Bic", "1.5$");
		itemRepository.save(item2);
		
		Item item3 = new Item("We only have pencils", "All are writing objects", "multiple brands", "30$");
		itemRepository.save(item3); 
		*/
	}

}
