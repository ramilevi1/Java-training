package datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// implement map interface
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		mapUtil(hMap);

	}
	
	public static void mapUtil(HashMap<Integer,String> map) {
		//1.add key-value pairs
		map.put(101, "Steve");
		map.put(007, "bond");
		map.put(102, "Rami");
		map.put(543, "Tami");
		
		//2. expose / access element
		System.out.println("see all the keys" + map.keySet());
		System.out.println("see all the key-values pairs" + map);
		System.out.println(map.get(543));

		//3. iterate through map of key-value pairs
		for (int key: map.keySet()) {
			System.out.println("[Key: "+ key + "; Value: " + map.get(key)+ "]");
		}
		


		
	}
	

}
