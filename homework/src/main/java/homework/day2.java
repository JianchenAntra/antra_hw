package homework;
import java.io.*;
import java.lang.*;
import java.util.*;

public class day2 {
	int id;
	String name;
	String food;
	
	
	public day2(int id, String name, String food) {
		this.id = id;
		this.name = name;
		this.food = food;
	}
	class sortById2 implements Comparable<day2> {
		public int compareTo(day2 day) {
			if(id == day.id) return 0;
			else if(id < day.id) return -1;
			else return 1;
		}
	}
}


class sortById implements Comparator<day2> {
	public int compare(day2 a, day2 b) {
		return a.id - b.id;
	}
}

class sortByName implements Comparator<day2> {
	public int compare(day2 a, day2 b) {
		return a.name.compareTo(b.name);
	}
}

 