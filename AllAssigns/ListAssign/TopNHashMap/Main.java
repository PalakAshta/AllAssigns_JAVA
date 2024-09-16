package TopNHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mp=new HashMap<String,Integer>();
		//mp.put("Apple", 1);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<15;i++) {
			System.out.println("Enter a String");
			String input=sc.next();
			if(mp.containsKey(input)) {
				mp.put(input, mp.get(input)+1);
			}
			else {
				mp.put(input, 1);
			}
		}
		

		List<String> li=sortByValue(mp);
		System.out.println("The sorted keys are "+li);
		
		System.out.println(mp);
	}
	public static List<String> sortByValue(Map<String, Integer> mp) {
        // Create a list of the keys
        List<String> keys = new ArrayList<>(mp.keySet());

        // Sort the list of keys based on the corresponding values in the map
        Collections.sort(keys, new Comparator<String>() {
            public int compare(String key1, String key2) {
                return mp.get(key2).compareTo(mp.get(key1)); // Sort in descending order
            }
        });

        return keys;  // Return the sorted list of keys
    }
	

}


