package iostreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("Students.txt");
		File f1 = new File("src");
		File f2 = new File("MaheshIt-students.txt");
		boolean fileCreatedStatus = f2.createNewFile();
		
		File f3 = new File("src/sureshit");
		boolean directoryStatus = f3.mkdir();
		System.out.println("Directory Status ::::" + directoryStatus);
		
		//create afile with name as temp.txt under maheshit directory
		if(f3.exists()) {
			File f4 = new File(f3, "temp.txt");
			boolean createNewFile = f4.createNewFile();
			if(createNewFile) {
				System.out.println("Your File Created in Required Location.....");
				FileOutputStream fos = new FileOutputStream(f4);
				fos.write("Welcome To AshokIT".getBytes());
			}  
		}else {
			f3.mkdir();
		}
		
		//list() will return the name of files only
		String[] fileNames = f3.list();
		for(String fileName : fileNames) {
			System.out.println("File Names::::" + fileName);
		}
		
		
		File[] listFiles = f3.listFiles();
		for(File file :listFiles) {
			System.out.println("File Name :::::" + file.getName());
			System.out.println("File Path :::::" + file.getPath());
			System.out.println("File Path :::::" + file.getAbsolutePath());
		}
		
		System.out.println("File Status :::::" + fileCreatedStatus);		
		System.out.println("Is File Method ::::" + f.isFile());
		System.out.println("Is DIR Method ::::" + f1.isDirectory());
	}
}
