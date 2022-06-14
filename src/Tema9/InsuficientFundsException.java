package Tema9;

public class InsuficientFundsException extends Exception{

	public InsuficientFundsException() {
		super("Insuficient funds for transaction");
	}
}
