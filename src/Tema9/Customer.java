package Tema9;

public class Customer {
	
	private String name;
	private String address;
	private String email;
	
	public Customer(String name, String address, String email) {
		setName(name);
		setAddress(address);
		setEmail(email);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}
	
}
