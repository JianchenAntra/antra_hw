package assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class assginment6 {
	public static void main(String[] args) {
		Person p1 = new Person("aaa", 14, "male");
		Person p2 = new Person("abc", 4, "female");
		Person p3 = new Person("ddd", 24, "male");
		Person p4 = new Person("cgcc", 54, "female");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		List<String> res = search(list);
		for(String p : res) System.out.println(p);
		
		List<Integer> ls = Arrays.asList(3,1,43,22,-16,8,3);
		String str = getString(ls);
		
	}
	
	public static List<String> search(List<Person> list){
	        return list.stream().map(a->a.name).filter(a->{
	            return a.startsWith("a") && a.length()==3;
	        }).toList();
	  }
	
	
    public static String getString(List<Integer> list){
        return list.stream().map(i -> i%2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
        
    }
    
    public static Double average(List<Integer> integerList) {
    	return integerList.stream().mapToDouble(i->i).average().orElse(0.0);
    }
	
    public static List<String> upperCase(List<String> list){
        return list.stream().map(String::toUpperCase).toList();
    }
	
	
}


class Person{
	String name;
	int age;
	String sex;
	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}


