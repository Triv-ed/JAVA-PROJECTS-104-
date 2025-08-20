package task;

import java.util.Scanner;

public class PaymentGateway {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome!! please select payment option");
		System.out.println("1:UPI");
		System.out.println("2.COD");
		System.out.println("3.CARD");
		System.out.println("4.Net Banking");
		System.out.println("5.Wallet");
		System.out.println("Enter the payment option");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:System.out.println("Enter the UPIId");
				String upiId=sc.nextLine();
				sc.nextLine();
				PaymentGateway.pay(upiId);
				break;
		case 2:PaymentGateway.pay();
				break;
		case 3:System.out.println("Enter the card num");
				String cardNum=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the expiry date");
				String expDate=sc.nextLine();
				System.out.println("Enter the cvc nuber");
				int cvc=sc.nextInt();
				PaymentGateway.pay(cardNum,expDate,cvc);
				break;
		case 4:System.out.println("Enter the userid");
			   String userId=sc.nextLine();
			   sc.nextLine();
			   System.out.println("Enter the password");
			   String password=sc.nextLine();
			   PaymentGateway.pay(userId,password);
			   break;
		case 5:System.out.println("Enter the mobile number");
				long mobileNum=sc.nextLong();
				sc.nextLine();
				System.out.println("Enter the wallet company");
				String company=sc.nextLine();
				PaymentGateway.pay(mobileNum,company);
				break;
		default:System.out.println("Enter the valid option");
		
		}
		

	}
	static void pay() {
		System.out.println("Your payment is succesful via Cash on delivery");
	}
	static void pay(String upiId) {
		System.out.println("Your payment is succesful via UPI!!");
	}
	static void pay(String cardNum,String expDate,int cvc) {
		System.out.print("Your payment is successful via card!!");
	}
	static void pay(String UserId,String password) {
		System.out.println("Your payment is Succesful via NetBanking");
	}
	static void pay(long mobileNum,String company) {
		System.out.println("Your payment is succesful via Wallet");
	}
	
	

}
