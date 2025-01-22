package atmproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImplement implements Atminterface {
	atm at=new atm();
	Map<Double,String> ministmt=new HashMap<> ();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance:"+at.getBalance());
		}

	@Override
	public void withDrawAmount(double withdrawAmount) {
		
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=at.getBalance()) {
				System.out.println("collect the cash"+withdrawAmount);
				at.setBalance(at.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
			}else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Enter amount in terms of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Deposited amount is"+depositAmount);
		at.setBalance(at.getBalance()+depositAmount);
		ministmt.put(depositAmount, "Deposited Successfully");
		viewBalance();
		
	}

	@Override
	public void viewMinistatement() {
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
		
	}

}
