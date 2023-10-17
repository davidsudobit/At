package Booking;

public enum SingletonEnum{
	
	INSTANCE;
	
	private String value;
	
	private SingletonEnum() {
		this.value="DEFAULT";
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value=value;
	}
	

}
