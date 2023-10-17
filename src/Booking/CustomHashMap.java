package Booking;

public class CustomHashMap<K,V> {
	
	private CustomLinkedList<LinkedListKeyHolder> bucket;
	private final int initialCapacity;
	
	public CustomHashMap() {
		initialCapacity=16;
	}
	
	public CustomHashMap(int initialCapacity) {
		this.initialCapacity=initialCapacity;
		this.bucket=new CustomLinkedList<>();
		
		for(int i=0;i<initialCapacity;i++) {
			this.bucket.add(null);
		}
		
	}
	
	public String put(K key,V value) {
		int index=hashValue(key);
		System.out.println(index);
		
		if(this.bucket.get(index)==null) {
			this.bucket.set(index, new LinkedListKeyHolder(key,value,String.valueOf(key.hashCode()),null));
			return "Added";
		}
		else {
			
			if(!containsKey(key)) {
				LinkedListKeyHolder keyHolder=this.bucket.get(index);
				keyHolder.getCurrent().next=new LinkedListKeyHolder(key,value,String.valueOf(key.hashCode()),null);
			}
			else {
				LinkedListKeyHolder keyHolder=this.bucket.get(index);
				keyHolder.updateValue(key, value);
			}
			
			return "Added";
		}
		
	}
	
	public boolean containsKey(K key) {
		
		int index=hashValue(key);
		
		LinkedListKeyHolder keyHolder=this.bucket.get(index);
		
		return keyHolder.isKeyPresent(key);
		
	}
	
	public V getValue(K key) {
		
		int index=hashValue(key);
		
		if(this.bucket.get(index)==null) {
			return null;
		}
		
		LinkedListKeyHolder keyHolder=this.bucket.get(index);
		return keyHolder.getValue(key);
		
	}
	
	private int hashValue(K key) {
		return key.hashCode()%initialCapacity;
	}
	
	private class LinkedListKeyHolder{
		
		private K key;
		private V value;
		private String hashValue;
		private LinkedListKeyHolder next;
		
		public LinkedListKeyHolder(K key, V value, String hashValue, LinkedListKeyHolder next) {
			super();
			this.key = key;
			this.value = value;
			this.hashValue = hashValue;
			this.next = next;
		}
		
		public boolean isKeyPresent(K key) {
			
			LinkedListKeyHolder current=this;
			
			while(current!=null&&!current.key.equals(key)&&!current.hashValue.equals(String.valueOf(key.hashCode()))) {
				current=current.next;
			}
			
			return current==null?false:true;
			
		}
		
		public LinkedListKeyHolder getCurrent() {
			
			LinkedListKeyHolder current=this;
			
			while(current.next!=null) {
				current=current.next;
			}
			
			return current;
			
		}
		
		public void updateValue(K key,V value) {
			
			LinkedListKeyHolder current=this;
			
			while(current.key!=key) {
				current=current.next;
			}
			
			current.value=value;
			
		}
		
		public V getValue(K key) {
			
			if(isKeyPresent(key)) {
				
				LinkedListKeyHolder current=this;
				
				while(current.key!=key) {
					current=current.next;
				}
				
				return current.value;
				
			}
			

			this.hashValue=String.valueOf(this.hashValue);
			
			return null;
			
		}
		
	}

}
