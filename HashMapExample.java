
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("M", 1000);
		
		System.out.println(hm.get("M"));
		
	}
	
}
............................................................................................................................................

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);

		for(Map.Entry<String, Integer> me:map.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
			
		}
	
	}

}


