package Curs9;

public class MobilePhone extends Product {

	int buyingPrice;
	int TVA;
	
	public MobilePhone(int buyingPrice, int TVA) {
		setBuyingPrice(buyingPrice);
		setTVA(TVA);
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

	@Override
	public int calculatePrice() {
		return buyingPrice + TVA;
	}

}
