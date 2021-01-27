package com.tactfactory.javaniveau2.tps.tp7.manager;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileManager{

//	./test/src/main/java/com/tactfactory/myproject/Myproject.java
//	
	
	private File f;
	
	public FileManager(File Newfile){
		this.f = Newfile;
	}
	
	public void createProjectStructure() throws IOException {
	
		try { 
	        File fjava = new File("MyProject.java");
	
	        if (fjava.createNewFile())
	            System.out.println("File created");
	        else
	            System.out.println("File already exists");
	    }
	    catch (Exception e) {
	        System.err.println(e);
	    }
		
//		Path path = Paths.get(f);
//		try {
//			String str = "package com.tactfactory.myproject;\n" +
//						"\n" +
//						"public class MyProject {\n" +
//						"\n" +
//						"  public static void main(String[] args) {\n" +
//						"    System.out.println(\"Hello world\");\n" +
//						"  }\n" +
//						"}\n";
//			byte[] bs = str.getBytes();
//			Path writtenFilePath = Files.write(path, bs);
//			System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		    String value = "package com.tactfactory.myproject;\n" +
					"\n" +
					"public class MyProject {\n" +
					"\n" +
					"  public static void main(String[] args) {\n" +
					"    System.out.println(\"Hello world\");\n" +
					"  }\n" +
					"}\n";
		    FileOutputStream fos = new FileOutputStream(f);
		    DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
		    outStream.writeUTF(value);
		    outStream.close();

	}

	public void listFiles() {
		// TODO Auto-generated method stub
		String[] pathnames;
		pathnames = f.list();
		for (String pathname : pathnames) {
            System.out.println(pathname);
        }
		
	}
}
