package com.sweetheart.product_service.entity;


//import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence. Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class Product{

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;

		    private String name;
		    private int price;

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    public int getPrice() {
		        return price;
		    }

		    public void setPrice(int price) {
		        this.price = price;
		    }
//	 @Column(name= "name")
//     private String name;
//	 
//	 @Column(name= "price")
//     private Double price;
}
