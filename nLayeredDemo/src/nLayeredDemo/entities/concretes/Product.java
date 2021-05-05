package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	
	private int id ;
	private int categoryid;
	private String name ;
	private double unitPrice;
	private int unitInStock;
	public Product () {}
	
	
	public Product(int id, int categoryid, String name, double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.categoryid = categoryid;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getUnitInStock() {
		return unitInStock;
	}


	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	

}
