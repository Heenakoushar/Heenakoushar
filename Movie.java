package entity;

import java.util.Scanner;

public class Movie {
	private String name;
	private String theatername;
	private int nooftickets;
	private int cost;

	public Movie(String name, String theatername, int nooftickets, int cost) {
		super();
		this.name = name;
		this.theatername = theatername;
		this.nooftickets = nooftickets;
		this.cost = cost;
	}

	public Movie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of movie:");
		String name = sc.nextLine();
		System.out.println("Enter the theater name:");
		String theatername = sc.nextLine();
		System.out.println("Enter the no. of tickets:");
		int nooftickets = sc.nextInt();
		System.out.println("Enter the cost per ticket:");
		int cost = sc.nextInt();

		this.name = name;
		this.theatername = theatername;
		this.nooftickets = nooftickets;
		this.cost = cost;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", theatername=" + theatername + ", nooftickets=" + nooftickets + ", cost="
				+ cost + "]";
	}

	public void viewAllDetails() {
		System.out.println("Name :" + name);
		System.out.println("Theater Name :" + theatername);
		System.out.println("No of tickets :" + nooftickets);
		System.out.println("Name :" + cost);
	}

}
