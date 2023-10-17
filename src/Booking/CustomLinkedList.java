package Booking;

import java.util.StringJoiner;

public class CustomLinkedList<T> {
	
	private InternalDataHolder start;
	
	public String add(T value) {
		
		if(start==null) {
			start=new InternalDataHolder(value);
			
			return "Added";
		}
		else {
			InternalDataHolder current=start;
			
			while(current.next!=null) {
				current=current.next;
			}
			
			current.next=new InternalDataHolder(value);
			
			return "Added";
		}
		
	}
	
	public boolean set(long index,T value) {
		
		if((index+1)>size()) {
			throw new IndexOutOfBoundsException("Index out of range: "+index+" ,size: "+size());
		}
		
		InternalDataHolder current=start;
		
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		
		current.data=value;
		
		return true;
		
	}
	
	public T get(int index) {
		
		if((index+1)>size()) {
			throw new IndexOutOfBoundsException("Index out of range: "+index+" ,size: "+size());
		}
		
		int count=0;
		InternalDataHolder targetDataHolder=start;
		
		while(count<index) {
			targetDataHolder=targetDataHolder.next;
			count++;
		}
		
		return targetDataHolder.data;
		
	}
	
	public boolean contains(T value) {
		InternalDataHolder current=start;
		
		while(current!=null&&current.data!=value) {
			current=current.next;
		}
		
		return (current==null)?false:true;
	}
	
	public long size() {
		
		long count=0;
		InternalDataHolder current=start;
		
		while(current!=null) {
			count++;
			current=current.next;
		}
		
		return count;
		
	}
	
	@Override
	public String toString() {
		StringJoiner listOfData=new StringJoiner(", ", "< ", " >");
		InternalDataHolder current=start;
		
		for(int i=0;i<size();i++) {
			listOfData.add(String.valueOf(current.data));
			current=current.next;
		}
		
		return listOfData.toString();
		
	}
	
	private class InternalDataHolder{
		
		private T data;
		private InternalDataHolder next;
		
		private InternalDataHolder(T value) {
			this.data=value;
		}
		
	}

}
