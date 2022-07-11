package Curs10;

public enum EnumExample {

	DEV("http://dev.com"),
	QA("http://qa.com"),
	PP("http://pp.com"),
	PROD("http://prod.com");

	private String url;
	
	EnumExample(String s){
		this.url = s;
	}
	
	public String getUrl() {
		return url;
	}
}
