package serviceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.ShowRepo;
import entity.Movie;
import entity.customer;
import service.ShoeService;

public class ShowServiceImpl implements ShoeService, ShowRepo {
	private static final String Cname = null;
	Scanner ip = new Scanner(System.in);
	{
		for (int i = 1; i <= 10; i++) {
			ns.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			vips.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			bs.put(i, null);
		}
	}

	@Override
	public void ticketInfo() {
		// TODO Auto-generated method stub
		System.out.println("===========Normal Seats==========");
		System.out.println("Sleeper seat:No");
		System.out.println("AC:No");
		System.out.println("Food menu order:No");
		System.out.println("Price:60 Rs");
		System.out.println("===========VIP Seats==========");
		System.out.println("Sleeper seat:Yes");
		System.out.println("AC:Yes");
		System.out.println("Food menu order:Yes");
		System.out.println("Price:500 Rs");
		System.out.println("===========Balcony Seats==========");
		System.out.println("Sleeper seat:Yes");
		System.out.println("AC:Yes");
		System.out.println("Food menu order:No");
		System.out.println("Price:300 Rs");

	}

	public void checkSeats(LinkedHashMap<Integer, customer> l1) {
		boolean flag = false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele) == null) {
				System.out.println(ele + " ");
				flag = true;
			}
		}
		System.out.println();
		if (flag == false) {
			System.out.println("No Rooms available");
		}
	}

	@Override
	public void availableTickets() {
		System.out.println("===============Available Seats==========");
		System.out.println("===============Normal Seats==========");
		checkSeats(ns);
		System.out.println("===============VIP Seats==========");
		checkSeats(vips);
		System.out.println("===============Balcony Seats==========");
		checkSeats(bs);

	}

	customer createCustomer() {
		System.out.println("====Enter customer details=======");
		System.out.println("Enter customer name:");
		String cname = ip.next();
		System.out.println("Enter customer phoneno");
		long Cphno = ip.nextLong();
		System.out.println("Enter the name of movie:");
		String name = ip.next();
		System.out.println("Enter the theater name:");
		String theatername = ip.next();
		System.out.println("Enter the no. of tickets:");
		int nooftickets = ip.nextInt();
		System.out.println("Enter the cost per ticket:");
		int cost = ip.nextInt();
		System.out.println("Allocated");
		Movie m = new Movie(name, theatername, nooftickets, cost);
		return new customer(Cname, Cphno, m);

	}

	void mapRoom(LinkedHashMap<Integer, customer> l1, int seatNo, double amt) {
		if (l1.get(seatNo) == null) {
			customer c = createCustomer();
			a1.add(c);
			l1.put(seatNo, c);
			c.setCamt(amt);
			System.out.println("Seat No:" + seatNo + "had been allocated ");
			System.out.println("==========================================");

		} else {
			System.out.println("Seat is not available");
		}
	}

	@Override
	public void allocateSeats() {
		System.out.println("============Menu=========");
		System.out.println("1.Normal Seats\n2.VIP Seats\n3.Balcony Seats");
		int op = ip.nextInt();
		switch (op) {
		case 1:
			System.out.println("Enter the Seat No");
			int seatNo1 = ip.nextInt();
			if (seatNo1 >= 1 && seatNo1 <= 25) {
				mapRoom(ns, seatNo1, 60);
			} else {
				System.out.println("Enter correct seat No");
			}
			break;

		case 2:
			System.out.println("Enter the seat no");
			int seatNo2 = ip.nextInt();
			if (seatNo2 >= 1 && seatNo2 <= 50) {
				mapRoom(vips, seatNo2, 500);
			} else {
				System.out.println("Enter correct seat No");
			}
			break;

		case 3:
			System.out.println("Enter the seat no");
			int seatNo3 = ip.nextInt();
			if (seatNo3 >= 1 && seatNo3 <= 50) {
				mapRoom(bs, seatNo3, 300);
			} else {
				System.out.println("Enter correct seat No");
			}
			break;
		default:
			System.out.println("Invallid option....");

		}

	}

	void unMapSeat(LinkedHashMap<Integer, customer> l1, int seatNo) {
		if (l1.get(seatNo) != null) {
			customer c1 = l1.get(seatNo);
			System.out.println(c1);
			System.out.println(c1.getName() + "need to pay" + c1.getCamt() + " Rs.");
			l1.put(seatNo, null);
		} else {
			System.out.println("Invallid seatNo...!!!");
		}
	}

	@Override
	public void checkout() {
		System.out.println("============Menu=========");
		System.out.println("1.Normal Seat\n2.VIP Seat\n3.Balcony Seat");
		int op = ip.nextInt();
		System.out.println("Enter the Seat No:");
		int seatno = ip.nextInt();
		switch (op) {
		case 1:
			if (seatno >= 1 && seatno <= 25) {
				unMapSeat(ns, seatno);

			} else {
				System.out.println("Invalid seat No");
			}
			break;
		case 2:
			if (seatno >= 1 && seatno <= 50) {
				unMapSeat(vips, seatno);

			} else {
				System.out.println("Invalid seat No");
			}
			break;

		case 3:
			if (seatno >= 1 && seatno <= 50) {
				unMapSeat(bs, seatno);

			} else {
				System.out.println("Invalid Seat No");
			}
			break;
		}
	}

	@Override
	public void findAllCustomer() {
		if (a1.size() == 0) {
			System.out.println("Database is empty");
		} else {
			for (customer ele : a1) {
				System.out.println(ele);
			}
		}

	}

}