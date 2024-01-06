package controller;

import java.util.Scanner;
import serviceImpl.HotelServiceImpl;
import service.HotelService;



public class HotelApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HotelService h1=new HotelServiceImpl();
		System.out.println("=======welcome to management system=======");
		while(true) {
			System.out.println("=====menu======");
			System.out.println("1.Room details\n2.Available Rooms\n3.Allocate Room\n4.checkout\n5.findAllCustomer\n6.getCustomerById\n7.Exit");
			System.out.println("Enter your option");

			int op=sc.nextInt();
			switch(op) {
			case 1:h1.roomInfo();break;
			case 2:h1.availableRooms();break;
			case 3:h1.allocateRoom();
			break;
			case 4:h1.checkout();
			break;
			case 5:h1.findAllCustomer();
			break;
			case 6:h1.getCustomerById();
			break;
			case 7:System.out.println("thank you visit again");
			System.exit(0);
			}
			
		}
	}

}
