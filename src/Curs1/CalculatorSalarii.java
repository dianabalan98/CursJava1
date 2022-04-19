package Curs1;

public class CalculatorSalarii {
	
	public int orePeSaptamana = 40;
	public int orePeZi = 8;
	
	public int CalculSalariuZilnic(int ratePerHour) {
		return ratePerHour * orePeZi;
	}
	
	public int CalculSalariuSaptamanal(int ratePerHour) {
		return ratePerHour * orePeSaptamana;
	}
	
	

	public static void main(String[] args) {
		
		CalculatorSalarii calculator = new CalculatorSalarii();
		
		Tester tester1 = new Tester();
		tester1.setName("Oana");
		tester1.setRatePerHour(50);
		
		Tester tester2 = new Tester("Ion");
		tester2.setRatePerHour(25);
		
		int salariuSapt1 = calculator.CalculSalariuSaptamanal(tester1.getRatePerHour());
		int salariuZi1 = calculator.CalculSalariuZilnic(tester1.getRatePerHour());
		int salariuSapt2 = calculator.CalculSalariuSaptamanal(tester2.getRatePerHour());
		int salariuZi2 = calculator.CalculSalariuZilnic(tester2.getRatePerHour());
		System.out.println("Testerul "+tester1.getName() + " castiga " + salariuZi1+ " RON pe zi.");
		System.out.println("Testerul "+tester1.getName() + " castiga " + salariuSapt1+ " RON pe saptamana.");
		System.out.println("Testerul "+tester2.getName() + " castiga " + salariuZi2+ " RON pe zi.");
		System.out.println("Testerul "+tester2.getName() + " castiga " + salariuSapt2+ " RON pe saptamana.");

	}

}
