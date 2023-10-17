package Booking;

import java.util.List;

public class MethodGenericsPrac<T,R> {
	
	@SuppressWarnings("unchecked")
	public <O extends Number> O getInstance(List<? extends Number> l1,List<O> l2) {
		return (O) Short.valueOf(String.valueOf(l1.size()));
	}

}
