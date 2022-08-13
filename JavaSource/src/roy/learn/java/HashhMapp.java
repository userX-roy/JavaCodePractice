package roy.learn.java;

import java.util.HashMap;
import java.util.Map;

public class HashhMapp {

	public static void main(String[] args) {
		
		Map<Integer, String> namMap = new HashMap<>();
		
		namMap.put(1, "Saikat");
		namMap.put(42, "Roni");
		namMap.put(34, "Rakesh");
		
		System.out.println(namMap.get(42));
		
		System.out.println(namMap.containsKey(342)); //tell us if a particular key is avilable or not

	}

}
