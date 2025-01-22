package atmproject;

import java.util.Scanner;

public class Userinterface {
		private static int status;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperationImplement impl=new AtmOperationImplement();
		Scanner scan=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("Enter the atmnumber");
		int atmnumber1=scan.nextInt();
		System.out.println("Enter the atmpin");
		int atmpin1=scan.nextInt();
		if(atmnumber==atmnumber1 && atmpin==atmpin1) {
			
			while(true) {
			System.out.println("1.View balance\n 2.withdraw \n 3.Deposit Amount\n 4.viewMiniStatement\n 5.exit");
			System.out.println("Enter the choice");
			int ch=scan.nextInt();
			if(ch==1) {
				impl.viewBalance();
			}
			else if(ch==2) {
				System.out.println("Enter withdraw amount");
				double withdrawamount=scan.nextDouble();
				impl.withDrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter amount to deposit");
				double depamount=scan.nextDouble();
				impl.depositAmount(depamount);
			}
			else if(ch==4) {
				impl.viewMinistatement();
			}
			else if (ch==5){
				System.out.println("Collect your cash\n THANK YOU");
			}
			
			}
		}
			else {
			System.out.println("Incorrect Atm number or pin");
			System.exit(status);
		
			}
		
		}

	}


