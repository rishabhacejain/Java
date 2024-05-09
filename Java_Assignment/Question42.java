package Java_Assignment;

class InsufficientBalanceException extends Exception{
	int reqAmount;
	public InsufficientBalanceException(int reqAmount) {
		this.reqAmount = reqAmount;
	}

}
class BankAcc{
	int balance;

	public BankAcc(int balance) {
		this.balance=balance;
	}
	
		public void withdraw(int amt) throws InsufficientBalanceException{
			
			if(amt>balance){
				int reqAmount = amt-balance;
				throw new InsufficientBalanceException(reqAmount);
			}
			else {
				balance -= amt;
				System.out.println("Amount deducted from account balance: " + amt);

			}
		}
	}






public class Question42{
	public static void main(String[] args) {

		int accBalance = 4000;
		int withdrawAmount = 2500;

		BankAcc acc1 = new BankAcc(accBalance);

		try {
			acc1.withdraw(withdrawAmount);
		}catch(InsufficientBalanceException e) {
			int reqAmount= e.reqAmount;	
			System.out.println("Sorry, insufficient balance, you need more " + reqAmount + " Rs. To perform this transaction.");
		}

	}
}




