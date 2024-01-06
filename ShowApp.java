package controller;

import java.util.Scanner;

import entity.Movie;
import service.ShoeService;
import serviceImpl.ShowServiceImpl;

public class ShowApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoeService h1 = new ShowServiceImpl();
		System.out.println("=======Welcome to Book My Show Management System=======");
		while (true) {
			System.out.println("=====menu======");
			System.out.println(
					"1.Ticket details\n2.Available Seats\n3.Allocate Seats\n4.checkout\n5.findAllCustomer\n6.Exit");
			System.out.println("Enter your option");

			int op = sc.nextInt();
			switch (op) {
			case 1:
				h1.ticketInfo();
				break;
			case 2:
				h1.availableTickets();
				break;
			case 3:
				h1.allocateSeats();
				break;
			case 4:
				h1.checkout();
				break;
			case 5:
				h1.findAllCustomer();
				break;
			case 7:
				System.out.println("thank you visit again");
				System.exit(0);

			}

			int status = 1;
			Movie movlist[] = null;
			do {
				System.out.println("=============Welcome to the cinema hall===========");
				System.out.println("1.Add Movie details");
				System.out.println("2.Search and book");
				System.out.println("3.view all");
				System.out.println("Enter your choice:");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter no. of movies: ");
					int no = sc.nextInt();
					movlist = new Movie[no];
					for (int i = 0; i < movlist.length; i++) {
						int j = i;
						System.out.println("Enter movie" + ++j + " Details");
						movlist[i] = new Movie();

					}
					System.out.println("Data saved....");
					break;

				case 2:
					boolean flag = true;
					sc.nextLine();
					System.out.println("Enter the movie name: ");
					String name = sc.nextLine();
					for (int i = 0; i < movlist.length; i++) {
						if (movlist[i].getName().equals(name)) {
							movlist[i].viewAllDetails();
							flag = true;

							System.out.println("would you like to book ticket for this movie?:");
							System.out.println("Enter 1 to book and 2 to exit:");
							int c = sc.nextInt();
							if (c == 1) {
								System.out.println("Enter the no. of tickets:");
								int tick = sc.nextInt();
								int tc = movlist[i].getCost() * tick;
								System.out.println("The bill comes up to:" + tc);
							} else
								break;

						} else
							flag = false;

					}
					if (flag == false)
						System.out.println("Not found");
					break;

				case 3:
					for (int i = 0; i < movlist.length; i++) {
						movlist[i].viewAllDetails();

					}
				default:
					System.out.println("Wrong choice...");

				}
				System.out.println("Do you want to continue(1.yes/2.No)");
				status = sc.nextInt();

			} while (status == 1);
			System.out.println("Execution completed successfully");

		}
	}

}
