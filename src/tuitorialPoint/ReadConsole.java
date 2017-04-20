package tuitorialPoint;

import java.io.*;
import java.io.IOException;

public class ReadConsole {
//	to read standard input stream until the user types a "q" −
	public static void main (String []args) throws IOException{
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Input until q");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			} while (c != 'q');
		}finally
			{
			if (cin != null)
				{
				cin.close();
				}
			}
			
	}
}
