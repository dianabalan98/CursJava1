package Tema8;

public class Masina extends Vehicul{

	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}
	
	@Override
	public String nume() {
		return super.getBrand();
	}
	
	@Override
	public String motorizare() {
		return String.valueOf(super.getVitezaMedie());
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + super.getBrand() + " este: " + super.getNivelPoluare() + " si"
				+ " viteza medie atinsa este de " + super.getVitezaMedie() + " km/h.");
	}

}
