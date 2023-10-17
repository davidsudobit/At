package Testing;

import java.util.*;
import java.util.stream.Collectors;

public class Main01{
	public static void main(String args[]) {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		scanf.nextLine();
		List<Worker> l1=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String name=scanf.nextLine();
			String contact=scanf.nextLine();
			double cost=scanf.nextDouble();
			scanf.nextLine();
			String owner=scanf.nextLine();
			Worker w=new Worker(name,contact,cost,owner);
			l1.add(w);
		}
		
		List<Worker> l2=l1.stream().sorted().collect(Collectors.toList());
		
		l2.forEach(w1-> System.out.println(w1.getName()+" "+w1.getContactNumber()+" "+w1.getCostPerDay()+" "+w1.getOwnerName()));
	}
}

class Worker implements Comparable<Worker>{
	private String name;
	private String contactNumber;
	private double costPerDay;
	private String ownerName;
	
	public Worker() {
	}
	
	public Worker(String name,String contactNumber,double costPerDay,String ownerName) {
		this.name=name;
		this.contactNumber=contactNumber;
		this.costPerDay=costPerDay;
		this.ownerName=ownerName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", contactNumber=" + contactNumber + ", costPerDay=" + costPerDay
				+ ", ownerName=" + ownerName + "]";
	}
	
	@Override
	public int compareTo(Worker w2) {
		if(costPerDay==w2.getCostPerDay()) {
			return 0;
		}
		else if(costPerDay<w2.getCostPerDay()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
