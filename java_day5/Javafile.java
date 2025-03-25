package interview_task;
import java.io.*;
public class Javafile {
public static void main(String[]args) {
	/*
	try {
		
	
	FileWriter w1 =new FileWriter("C:\\Users\\malat\\eclipse-workspace\\interview_task\\src\\interview_task\\file");
	w1.write("Hello...1");
	w1.close();
	System.out.println("Data written to file.");
	FileReader r1=new FileReader("C:\\Users\\malat\\eclipse-workspace\\interview_task\\src\\interview_task\\file");
	int character;
	while((character=r1.read()) !=-1) {
		System.out.print((char)character);
		
	}
	r1.close();
	
}catch(IOException e) {
	System.out.println("An error occured:"+e.getMessage());
	
}
}
}
*/
	File obj=new File("demo.txt:)");
	System.out.println("File Created");
}
}