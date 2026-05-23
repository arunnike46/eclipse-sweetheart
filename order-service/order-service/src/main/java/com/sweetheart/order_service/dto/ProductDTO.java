package com.sweetheart.order_service.dto;

public class ProductDTO {

    private Long id;
    private String name;
    private double price;

    // No Argument Constructor

    // All Argument Constructor
   public ProductDTO(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}