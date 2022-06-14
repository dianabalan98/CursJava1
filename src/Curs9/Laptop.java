package Curs9;

public class Laptop extends Product {

	int buyingPrice;
	int TVA;
	int adaosComercial;
	
	public Laptop(int buyingPrice, int TVA, int adaosComercial) {
		setBuyingPrice(buyingPrice);
		setTVA(TVA);
		setAdaosComercial(adaosComercial);
	}
	
	public int getBuyingPrice() {
		return buyingPrice;
	}


	private void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}


	public int getTVA() {
		return TVA;
	}


	private void setTVA(int tVA) {
		TVA = tVA;
	}


	public int getAdaosComercial() {
		return adaosComercial;
	}


	private void setAdaosComercial(int adaosComercial) {
		this.adaosComercial = adaosComercial;
	}


	@Override
	public int calculatePrice() {
		return buyingPrice + TVA + adaosComercial;
	}

	
}
