package com.example.produit;

public class Produit {
	
	private double price;
	private String name;
	private String supplier;
	
	public Produit(String name, double price, String supplier) {
		this.name=name;
		this.price=price;
		this.supplier=supplier;
	}
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}
