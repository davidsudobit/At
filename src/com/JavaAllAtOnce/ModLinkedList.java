package com.JavaAllAtOnce;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ModLinkedList<T> extends AbstractSequentialList<T> implements List<T>{
	
	private ModLinkedList.ModNode<T> start;
	
	public void addFirst(T value) {
		
		if(start==null) {
			add(value);
			return;
		}
		
		ModNode<T> current=start;
		
		start=new ModNode<>(current.prev==null?current:current.prev,value,current);
		current.prev=start;
		
	}
	
	public void addLast(T value) {
		
		add(value);
		
	}
	
	public boolean add(T value) {
		
		if(start==null) {
			
			start=new ModLinkedList.ModNode<T>(null, value, null);
			return true;
			
		}
		
		ModNode<T> current=start;
		
		while(current.next!=null) {
			current=current.next;
		}
		
		current.next=new ModNode<T>(current,value,null);
		start.prev=current.next;
		
		return true;
		
	}
	
	public T get(int index) {
		
		int size=size();
		
		if(size>0 && index<size) {
			
			ModNode<T> current=start;
			
			for(int i=0;i!=index;i++) {
				current=current.next;
			}
			
			return current.value;
			
		}
		
		return null;
		
	}
	
	public int size() {
		
		ModNode<T> current=start;
		
		int size=0;
		
		while(current!=null){
			current=current.next;
			size++;
		}
		
		return size;
		
	}
	
	@Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private ModNode<T> current = start;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T data = current.value;
                current = current.next;
                return data;
            }
        };
    }
	
	public Stream<T> stream() {
        Iterable<T> iterable = () -> iterator();
        return StreamSupport.stream(iterable.spliterator(), false);
    }
	
	private static class ModNode<T>{
		
		private ModNode<T> prev;
		
		private T value;
		
		private ModNode<T> next;
		
		public ModNode() {
			
		}
		
		public ModNode(ModNode<T> prev,T value,ModNode<T> next) {
			
			this();
			this.prev=prev;
			this.value=value;
			this.next=next;
			
		}
		
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		
		return new ListIterator<T>() {
			
			ModNode<T> current=start;

			@Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T data = current.value;
                current = current.next;
                return data;
            }

			@Override
			public boolean hasPrevious() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T previous() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int nextIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int previousIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void set(T e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void add(T e) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
	}

}
