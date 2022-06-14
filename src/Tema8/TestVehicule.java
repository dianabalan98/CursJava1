package Tema8;

public class TestVehicule {

	public static void main(String[] args) {
		
		Vehicul bicicleta = new Bicicleta("BMX", 0, 15);
		Vehicul masina = new Masina("Mercedes", 5, 80);
		
		System.out.println("Bicicleta -------------------------------------------------");	
		verificaMotorizarea(bicicleta);
		bicicleta.detaliiVehicul();
		
		System.out.println("Masina -------------------------------------------------");
		verificaMotorizarea(masina);
		masina.detaliiVehicul();
		
	}
	
	public static void verificaMotorizarea(Vehicul vehicul) {
		
		System.out.println("Numele vehiculului este: " + vehicul.nume());
		System.out.println("Motorizarea vehiculului este: " + vehicul.motorizare());
	}

}
