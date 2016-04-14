package my.webapp.bean;

public class Book {
	
	public String name;
	public Double price;
	public boolean available;
	
	public Book(String name, Double price, boolean available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
