package serviceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Address;
import entity.customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService,HotelRepo {
	Scanner ip=new Scanner(System.in);
	{
		for(int i=1;i<=10;i++) {
			cm.put(i, null);
		}
		for(int i=1;i<=8;i++) {
			sm.put(i, null);
		}
		for(int i=1;i<=5;i++) {
			dm.put(i, null);
		}
	}


	@Override
	public void roomInfo() {
		// TODO Auto-generated method stub
		System.out.println("===========Classic Room==========");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("TV:No");
		System.out.println("wifi:No");
		System.out.println("Price:2000 Rs");
		System.out.println("===========Standard Room==========");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("TV:Yes");
		System.out.println("wifi:No");
		System.out.println("Price:25000 Rs");
		System.out.println("===========Deluxe Room==========");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:Yes");
		System.out.println("TV:Yes");
		System.out.println("wifi:Yes");
		System.out.println("Price:3000 Rs");
		
	}
	public void checkRoom(LinkedHashMap<Integer,customer> l1) {
		boolean flag=false;
		for(Integer ele:l1.keySet()) {
			if(l1.get(ele)==null) {
				System.out.println(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false) {
			System.out.println("No Rooms available");
		}
	}
	
	
	@Override
	public void availableRooms() {
		System.out.println("===============Available Rooms==========");
		System.out.println("===============Classic Rooms==========");
		checkRoom(cm);
		System.out.println("===============Standard Rooms==========");
		checkRoom(sm);
		System.out.println("===============deluxe Rooms==========");
		checkRoom(dm);
		
		
	}
	customer createCustomer() {
		System.out.println("====Enter customer details=======");
		System.out.println("Enter customer id:");
		int cid=ip.nextInt();
		System.out.println("Enter customer name:");
		String cname=ip.next();
		System.out.println("Enter customer age:");
		String cage=ip.next();
		System.out.println("Enter customer phno:");
		long cphno=ip.nextLong();
		System.out.println("Enter customer email:");
		String cemail=ip.next();
		System.out.println("Enter customer door No:");
		String doorno=ip.next();
		System.out.println("Enter customer street address:");
		ip.next();
		String street=ip.next();
		System.out.println("Enter customer district:");
		String dst=ip.next();
		System.out.println("Enter customer state:");
		String state=ip.next();
		System.out.println("Enter customer pincode:");
		int pincode=ip.nextInt();
		Address a=new Address(doorno,street,dst,state,pincode);
		return new customer(cid,cname,cage,cphno,cemail,a);
		
	}
	
	
	
	
	
	 void mapRoom(LinkedHashMap<Integer,customer> l1,int roomNo,double amt) {
		if(l1.get(roomNo)==null) {
			customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Room No:"+roomNo+"had been allocated for"+c.getCname());
			System.out.println("==========================================");
			
		}
		else {
			System.out.println("Room is not available");
		}
	}
	
	@Override
	public void allocateRoom() {
		System.out.println("============Menu=========");
		System.out.println("1.Classic Room\n2.Standard Room\n3.deluxe Room");
		int op=ip.nextInt();
		switch(op) {
		case 1:System.out.println("Enter the room no");
		int roomNo1=ip.nextInt();
		if(roomNo1>=1&&roomNo1<=10) {
			mapRoom(cm,roomNo1,2000);
		}
		else {
			System.out.println("Enter correct room No");
		}
		break;
		
		case 2:System.out.println("Enter the room no");
		int roomNo2=ip.nextInt();
		if(roomNo2>=1&&roomNo2<=10) {
			mapRoom(sm,roomNo2,2500);
		}
		else {
			System.out.println("Enter correct room No");
		}
		break;
		
		
		case 3:System.out.println("Enter the room no");
		int roomNo3=ip.nextInt();
		if(roomNo3>=1&&roomNo3<=10) {
			mapRoom(dm,roomNo3,3000);
		}
		else {
			System.out.println("Enter correct room No");
		}
		break;
		default:System.out.println("Invallid option....");
	
		
		
		
		}
		
		
		
	}
	
	
	void unMapRoom(LinkedHashMap<Integer,customer>l1,int roomNo) {
		if(l1.get(roomNo)!=null) {
			customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+"need to pay"+c1.getCamt()+" Rs.");
			l1.put(roomNo, null);
		}
		else {
			System.out.println("Invallid RoomNo...!!!");
		}
	}
	@Override
	public void checkout() {
		System.out.println("============Menu=========");
		System.out.println("1.Classic Room\n2.Standard Room\n3.deluxe Room");
		int op=ip.nextInt();
		System.out.println("Enter the Room No:");
		int roomno=ip.nextInt();
		switch(op) {
		case 1:if(roomno>=1&&roomno<=10) {
			unMapRoom(cm,roomno);
			
		}
		else {
			System.out.println("Invalid room No");
		}
		break;
		case 2:if(roomno>=1&&roomno<=8) {
			unMapRoom(cm,roomno);
			
		}
		else {
			System.out.println("Invalid room No");
		}
		break;
		
		case 3:if(roomno>=1&&roomno<=5) {
			unMapRoom(cm,roomno);
			
		}
		else {
			System.out.println("Invalid room No");
		}
		break;	
		}	
	}
	@Override
	public void findAllCustomer() {
		if(a1.size()==0) {
			System.out.println("Database is empty");
		}
		else {
			for(customer ele:a1) {
				System.out.println(ele);
			}
		}
		
	}
	@Override
	public void getCustomerById() {
		boolean flag=false;
		System.out.println("Enter customer id:");
		int cid=ip.nextInt();
		for(customer ele:a1) {
			if(ele.getCid()==cid) {
				System.out.println(ele);
				flag=true;
				break;
			}
		}
		
	}
	
	
	
	
	
	


	

}
