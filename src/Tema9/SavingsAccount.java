package Tema9;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}

	@Override
	public void withdraw(double sum) throws InsuficientFundsException {
		
		try {
			
			if(sum > balance) {
				throw new InsuficientFundsException();
			} else {
				balance -= sum;
				System.out.println("Your new balance is: " + balance);
			}
			
		} catch(InsuficientFundsException e) {
			e.printStackTrace();
		}
		
	}
	

}
