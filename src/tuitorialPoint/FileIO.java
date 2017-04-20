package tuitorialPoint;

import java.io.*;

public class FileIO {
/*copy an input file into an output file 
 * 
 */
	public static void main (String args[]) throws IOException{
		FileReader in = null;
		FileWriter out = null;
//		BufferedWriter output = null;
		
		try{
			// read 8 bit
//			in = new FileInputStream("/studyJava/src/tuitorialPoint/input.txt");
//			out = new FileOutputStream("/studyJava/src/tuitorialPoint/output.txt");
		
			// read 16 bit unicode
			in = new FileReader("/studyJava/src/tuitorialPoint/input.txt");
			out = new FileWriter("/studyJava/src/tuitorialPoint/output.txt");
			int c;
			while ((c = in.read()) != -1){
				out.write(c);
				System.out.print(c);
			}
			// write a new file
//			File file = new File("/studyJava/src/tuitorialPoint/abc.txt");
//			output = new BufferedWriter(new FileWriter(file));
//          output.write("demo");
			
			// File directory
			File file = new File("/studyJava/src/tuitorialPoint2");
			System.out.println(file.mkdirs()); //true
			File listDir = new File("/studyJava");
			String[] ls = listDir.list();
			for (String i: ls){
				System.out.println(i);
			}
//			System.out.print(file.getPath());
//			System.out.print(file.getAbsolutePath());
			
		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
		
		// Fast
//		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myFile.txt"), StandardCharsets.UTF_8))) {
//		    writer.write("text to write");
//		} 
		finally{
			if (in != null){
				in.close();
			}
			if (out != null){
				out.close();
			}
		}
	
	}
}
