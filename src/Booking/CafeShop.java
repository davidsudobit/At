package Booking;

public class CafeShop implements Comparable<CafeShop>{
	
	private String drinkName;
	private Double drinkPrice;
	private Long quantity;
	
	public CafeShop() {
		
	}

	public CafeShop(String drinkName, Double drinkPrice, Long quantity) {
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
		this.quantity = quantity;
	}

	public String getDrinkName() {
		return drinkName;
	}
	
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
	public Double getDrinkPrice() {
		return drinkPrice;
	}
	
	public void setDrinkPrice(Double drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CafeShop [drinkName=" + drinkName + ", drinkPrice=" + drinkPrice + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(CafeShop o) {
		
		if(o.getDrinkPrice().compareTo(this.drinkPrice)==0) {
			return o.getQuantity().compareTo(this.quantity);
		}
		
		return o.getDrinkPrice().compareTo(this.drinkPrice);
		
	}
	
	

}
