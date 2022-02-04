package assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//This code exists tiny bug. The goal of this exercise is to test your knowledge of Java Threads.
public class thread {
	 public static void main(String[] args) throws ExecutionException, InterruptedException {
		 List<String> sb = new ArrayList<>();
		 
	       ThreadRead t1 = new ThreadRead("in	put", sb); 
	       
	       ThreadWrite t2 = new ThreadWrite("output",sb);
	       
	       t1.start();
	       t2.start();
	       
	      
	       
	   }
	 
	 static class ThreadRead extends Thread{
		 String name;
		 List<String> sb = new ArrayList<>();
		 ThreadRead(String name, List<String> sb) {
			 this.name = name;
			 this.sb = sb;
		 }
		 public String calculate(String line) {
			 
			 String[] split = line.split(" ");
			 int sum = 0;
			 int sign = 1;
			 
			 for(String i : split) {
				  if(i.equals("")) break;
				  if(i.equals("+")){
					  sign = 1;
				  }else if(i.equals("-")) {
					  sign = -1;
				  }else {
					  sum += sign*Integer.parseInt(i);
				  }
			 }
			 return line + " = " + sum;
			 
		 }
		 @Override
		 public void run() {
			 BufferedReader br = null;
			 File f = new File("./src/main/java/assignment4/input.txt");
			 try {
				FileReader read = new FileReader(f);
				br = new BufferedReader(read);
				while(br.readLine()!=null) {
					sb.add(calculate(br.readLine()));
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					sb.add("End");
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 
		 }
		 
	 }
	 
	 static class ThreadWrite extends Thread{
		 String name;
		 BufferedWriter br = null;
		 List<String> sb = new ArrayList<>();
		 ThreadWrite(String name, List<String> sb) {
			 this.name = name;
			 this.sb = sb;
		 }
		 
		 public void run() {
			  try {
				BufferedWriter br = new BufferedWriter(new FileWriter("./src/main/java/assignment4/output.txt"));
				for(int i = 0; i < sb.size(); i++) {
					String temp = sb.get(i);
					if(temp.equals("End")) break;
					br.write(temp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
			  try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		 }
	 }
	 
	}
