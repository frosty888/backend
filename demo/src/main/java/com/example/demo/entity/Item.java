package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_name", nullable = false)
	private String name;
	
	@Column(name = "item_description")
	private String description;
	
	@Column(name = "item_brand")
	private String brand;
	
	@Column(name = "item_price")
	private String price;
	
	public Item() {
		
	}
	
	public Item(String name, String description, String brand, String price) {
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		String dollar = "$";
		this.price = price + dollar;
	}
	
}
