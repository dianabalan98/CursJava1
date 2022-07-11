package Curs11;

public class TestStatus {

	public Status status;
	
	public TestStatus(Status status) {
		this.status = status;
	}
	
	public void getStatus() {
		switch(status) {
		
		case PASS:
			System.out.println("Test passed!");
		break;
		case FAIL:
			System.out.println("Test failed!");
		break;
		case SKIPPED:
			System.out.println("Test skipped!");
		break;
		default:
			System.out.println("Invalid status!");
		}
	}
	
	public static void main(String[] args) {
		
		String status = "FAIL";
		TestStatus test = new TestStatus(Status.valueOf(status));
		test.getStatus();

	}

}
