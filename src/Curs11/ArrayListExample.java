package Curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("oana");
		list.add("ion");
		list.add("maria");
		list.add("gheorghe");
		System.out.println(list.size());
		
		list.add(0, "bogdan"); //permuteaza ordinea
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		System.out.println("-----------------------------------------");
		
		// get element via index
		System.out.println(list.get(4));
		list.remove(4);
		int index = 0;
		for(String nume : list) {
			System.out.println((index++) + " " + nume);
		}
		
		System.out.println("-----------------------------------------");
		list.clear();
		for(String nume : list) {
			System.out.println((index++) + " " + nume);
		}

	}

}
