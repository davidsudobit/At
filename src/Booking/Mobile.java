package Booking;

import java.time.LocalDate;

public class Mobile implements Comparable<Mobile>{
	
	private String name;
	
	private String model;
	
	private Double price;
	
	private LocalDate manufacturingDate;

	public String getName() {
		return name;
	}

	public Mobile(String name, String model, Double price, LocalDate manufacturingDate) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	@Override
	public int compareTo(Mobile o){
		
			if(this.name.compareTo(o.name)==0) {
				if(this.model.compareTo(o.model)==0) {
					return o.manufacturingDate.compareTo(this.manufacturingDate);
				}
				return this.model.compareTo(o.model);
			}
			return this.name.compareTo(o.name);
		
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", price=" + price + ", manufacturingDate="
				+ manufacturingDate + "]";
	}

}