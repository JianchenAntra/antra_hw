package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listAndHashMap {
	public static List<Integer> combine(HashMap<String,String> map, List<Integer> list) {
		Collection<String> value = map.values();
		List<Integer> ans = new ArrayList<>();
		for(int i : list) {
			String str = Integer.toString(i);
			if(value.contains(str)) continue;
			
			ans.add(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		List<Integer> list = Arrays.asList(1,2,3,4,10);
		
		 map.put("a","1");
	     map.put("b","2");
	     map.put("c","10");
	     
	    List<Integer> ans = combine(map,list);
	    
	    for(int k : ans) System.out.println(k);
		 
		 
	}
}
