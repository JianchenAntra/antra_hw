package assignment2;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;


public class countFile {
	public static class Criteria{
		File dir;
		int fileNum;
		int folderNum;
		File[] fileList;
		
		public  Criteria(File dir) {
			this.dir = dir;
			fileNum = 0;
			folderNum = 0;
			fileList =  dir.listFiles();
		}
		public void folderPath() {
			for(File f : fileList) {
				if(f.isFile()) fileNum++;
				else folderNum++;
			}
		}
		public void print() {
			System.out.println("There are " + fileNum + " files and " + folderNum + " folders inside folder " +
		  dir.getAbsolutePath());
		}
		
		public boolean includeSubFolder() {
			return folderNum!=0;
		}
	}
	
	public static boolean isValidPath(String path) {
	    try {
	        Paths.get(path);
	    } catch (NullPointerException | InvalidPathException e) {
	        return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		System.out.println("enter file path");
        Scanner input = new Scanner(System.in);
        String inputPath = input.nextLine();
        input.close();
        boolean check = isValidPath(inputPath);
        if(!check)  System.out.println("invalid directory");
        else {
        File inputFile = new File(inputPath);
        
        Criteria criteria = new Criteria(inputFile);
        criteria.folderPath();
        criteria.print();
        }
	}
}
