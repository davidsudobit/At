package Testing;

import java.io.File;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		Scanner scanf=new Scanner(System.in);
		int n=scanf.nextInt();
		scanf.nextLine();
		List<Stall> l1=new LinkedList<>();
//		int i=0;
		for(int i=0;i<n;i++) {
			String name=scanf.nextLine();
			String detail=scanf.nextLine();
			String type=scanf.nextLine();
			String ownerName=scanf.nextLine();
//			Thread.sleep(8000);
			List<Integer> l23=Arrays.asList(1,2,3);
			
			String str="abc";
			String str01=new String("abcd");
			if(str.equals(str01)) {
				System.out.println("1");
			}
			
			Stall s1=new Stall(name,detail,type,ownerName);
			l1.add(s1);
		}
		
		try {
		}
		catch(Exception e){
			
		}
		
		Iterator<Stall> it1=l1.iterator();
		
		while(it1.hasNext()) {
			Stall temp=it1.next();
			if(temp.getName().toLowerCase().startsWith("test")) {
				l1.remove(temp);
			}
		}
		
		l1.forEach(s1 -> System.out.println(s1.getName()+" "+s1.getDetail()+" "+s1.getType()+" "+s1.getOwnerName()));
	}
}

class Stall{
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	
	public Stall() {
	}
	
	public Stall(String name, String detail, String type, String ownerName) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Stall [name=" + name + ", detail=" + detail + ", type=" + type + ", ownerName=" + ownerName + "]";
	}
}
