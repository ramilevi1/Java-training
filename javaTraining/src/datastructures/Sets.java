package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main (String[] args) {
		//LinkedHashset - in order that they were entered.
		//Hashset - complete random order
		//TreeSet- rearrange based on alphabetic order.
			
		
		//1. define the collection
		Set<String> animals = new LinkedHashSet<String>();
		//2. add elements 
		animals.add("dog");
		animals.add("cat");
		animals.add("hog");
		animals.add("snake");
		animals.add("pig");
		animals.add("capivara");
		animals.add("eagle");
		//System.out.println(animals + " " + animals.size());
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");
		System.out.println("Animals set is : " + " " +animals + " ="+ animals.size());
		
		//3.create a new set that use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		farmAnimals.add("cat");
		farmAnimals.add("goose");

		System.out.println("Farm animals set is : " + farmAnimals + " ="+ farmAnimals.size());

		//what is the intersection between the animals set and farm animals set
		//1. copy existing set into a new set (And)
		Set<String> intersectionSet = new HashSet<String>(animals);
		//System.out.println(intersectionSet);
		//2. retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("the intersetion set is : " +intersectionSet + " ="+intersectionSet.size());
	
		//3. what is the union of both (Or)
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("the union set is : " +unionSet +" ="+ unionSet.size());

		//what is the difference (animals but not farm animals)
		Set<String> differenceSetAnotB = new HashSet<String>(animals);
		differenceSetAnotB.removeAll(farmAnimals);
		System.out.println("the difference set (A not B) is (animals but not farm animals) : " +differenceSetAnotB +" ="+ differenceSetAnotB.size());

		//what is the difference (farm animal but not animals)
		Set<String> differenceSetBnotA = new HashSet<String>(farmAnimals);
		differenceSetBnotA.removeAll(animals);
		System.out.println("the difference set is (B not A) (farm animals but not animals) : " +differenceSetBnotA +" ="+ differenceSetBnotA.size());
	
	}

}
