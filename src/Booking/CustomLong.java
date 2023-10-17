package Booking;

public class CustomLong extends Number{
	
	private Number value;

	/**
	 * @serial
	 */
	private static final long serialVersionUID = -6442891241220516038L;
	
	private CustomLong(Number value) {
		this.value=value;
	}
	
	static CustomLong loadValue(Number value) {
		return new CustomLong(value);
	}

	@Override
	public int intValue() {
		return value.intValue();
	}

	@Override
	public long longValue() {
		return value.longValue();
	}

	@Override
	public float floatValue() {
		return value.floatValue();
	}

	@Override
	public double doubleValue() {
		return value.doubleValue();
	}
	
	

}
