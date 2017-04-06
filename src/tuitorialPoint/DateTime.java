package tuitorialPoint;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTime {
	
	public static void main (String args[]){
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		// Format date
		SimpleDateFormat simple = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm.ss a z");
		System.out.println("use simple fromat:" + simple.format(date));
		
		// we also can format with printf
		String str = String.format("Curent: %8tR", date);
		System.out.printf(str + "\n");
		//or
		System.out.printf("%1$s %2$tB %2$tR %2$tY", "Due date", date);
		System.out.print("\n");
		System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
		
		// convert string to date
		SimpleDateFormat fmrt = new SimpleDateFormat("dd-MM-yy");
		String input = args.length == 0 ? "22-09-91": args[0];
		System.out.print("\n");
		System.out.println("Input as: " + input);
		try{
			long start = System.currentTimeMillis();
			Date t = fmrt.parse(input);
			// sleep 2s
			Thread.sleep(2*1000);
			long stop = System.currentTimeMillis();
			System.out.println("Output date as: " + t + "; delta: " + (stop-start));
			
//		}catch (ParseException e) {
		}catch (Exception e) {
			System.out.println("Unparseable: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

