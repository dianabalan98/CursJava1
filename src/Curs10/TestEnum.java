package Curs10;

import Curs10.EnumExample;

public class TestEnum {

	public static void main(String[] args) {

		System.out.println(EnumExample.DEV.getUrl());
		
		for(EnumExample env : EnumExample.values()) {
			
			System.out.println(env.name() + " : " + env.getUrl());
			
		}
		
	}

}
