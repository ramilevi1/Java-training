package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		//1. create a collection
		ArrayList<String> cities = new ArrayList<String>();
		//2. add some elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		cities.add("NY");

		//3. iterate through the collection
		for (String city: cities) {
			System.out.println(city);
		}
		//4. get the size
		System.out.println("there are "+cities.size() + " in the collection" + "\n");
		
		//5. retrieve specific element
		System.out.println(cities.get(1));		
	
		//6. remive 
		cities.remove(0);
		int size = cities.size();
		System.out.println("there are "+cities.size() + " in the collection" + "\n");
		for (String city: cities) {
			System.out.println(city);
		}

			
	
	}

}
