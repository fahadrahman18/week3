package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		System.out.println("Axis Bank Deposit ACcount - Axis Bank");

	}

	public static void main(String[] args) {
		
		
		AxisBank override = new AxisBank();
		
		override.saving();
		override.fixed();
		override.deposit();
		

	}

}
