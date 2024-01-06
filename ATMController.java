package controller;
import java.util.Scanner;

import Service.ATMService;
import entity.Account;
import service_impl.ATMServiceImpl;


public class ATMController {
	
    private ATMService atmService;
    private Account account;

    public ATMController(ATMService atmService, Account account) {
        this.atmService = atmService;
        this.account = account;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
        	
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            
        }
    }
    public static void main(String[] args) {
		ATMService atmService =new ATMServiceImpl();
		Account account =new Account("1111121","manis");
		System.out.println("-----------");
		ATMController atmc =new ATMController(atmService,account);
		//atmc.start();
		
		Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
        	System.out.println("==================Manu================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:System.out.print("Your Current Balance is: ");
            System.out.println(atmService.checkBalance(account));break;
            case 2:
            	System.out.println("Inter deposit Amount: ");
            	double dep_amt=sc.nextDouble();
                atmService.deposit(account,dep_amt);break;
            case 3:
            	System.out.println("Inter withdraw Amount: ");
            	double with_amt=sc.nextDouble();
                atmService.withdraw(account, with_amt);break;
            case 4:
                System.out.println(atmService.getTransactionHistory(account));break;
            case 0: System.out.println("=====Thank you visit again=====");
	        System.exit(0);break;

            }
            
            
        }
		
	}
}