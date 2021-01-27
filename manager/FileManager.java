package com.tactfactory.javaniveau2.tps.tp7.manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileManager {

//	./test/src/main/java/com/tactfactory/myproject/Myproject.java
//	
//	public FileManager(file) {
//		this.file = file;
//	}
//	
	public void createProjectstructure() {
	
		try { 
	        File f = new File("D:\\MyProject.java");
	
	        if (f.createNewFile())
	            System.out.println("File created");
	        else
	            System.out.println("File already exists");
	    }
	    catch (Exception e) {
	        System.err.println(e);
	    }
		
		Path path = Paths.get("D:\\MyProject.java");
		try {
			String str = "package com.tactfactory.myproject;\n" +
						"\n" +
						"public class MyProject {\n" +
						"\n" +
						"  public static void main(String[] args) {\n" +
						"    System.out.println(\"Hello world\");\n" +
						"  }\n" +
						"}\n";
			byte[] bs = str.getBytes();
			Path writtenFilePath = Files.write(path, bs);
			System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
