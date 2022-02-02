package homework.assignment1;

import java.util.Scanner;

public class keybordX {

//"static void main" must be defined in a public class.

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("enter integer please");
		String a = keyboard.nextLine();
		if(a.equals("q")) {
			System.out.println("quit");
			System.exit(0);
		}else if(Integer.parseInt(a)>0){
			int sum  = 0;
			for(int i = 0; i < Integer.valueOf(a); i++ ) {
				sum+= i;
			}
			System.out.println(sum);
		}else {
			System.out.println("Error, x <= 0");
			System.exit(0);
		}
	}
}