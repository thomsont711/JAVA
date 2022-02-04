package oopj;
import java.io.*;
import java.util.Scanner;


public class jfile2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("new2.txt");
		if( file1.exists() ){
			System.out.println("Exists");
		}
		else{
			file1.createNewFile();
			System.out.println("file created");
		}
		try{
		 FileOutputStream fileOut = new FileOutputStream("new2.txt",true);
		 BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter Data:");
		 String s = buff.readLine();
		 byte[] arr = s.getBytes();
		 fileOut.write(arr);
		    System.out.println("Data Added");
		 
		 }
		catch(Exception e){
			System.out.println("File not found");
		}
		int i=0;
		FileInputStream file2 = new FileInputStream("new2.txt");
		System.out.println(file2.available());
		while( (i=file2.read()) != -1){
			char c= (char) i;
			System.out.print(c);
		}

	}

}
