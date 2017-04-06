package tuitorialPoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
		private static final String INPUT = "cat cat cat cattie cat";
		
		public static void main (String args[]){
			
			// Find a digit string
			String line =  "This order was placed for QT3000! OK?";
			Pattern r = Pattern.compile("(.*)(\\d+)(.*)");
			Matcher m = r.matcher(line);
			if (m.find()) {
				System.out.println(m);
				System.out.println(m.group(0));
				System.out.println(m.group(1));
				System.out.println(m.group(2));
				System.out.println(m.group(3));
			}
			// Count cat in string
			Pattern p = Pattern.compile("\\bcat\\b");
			Matcher s = p.matcher(INPUT);
			int count = 0;
			while (s.find()){
				count ++;
				System.out.println("Match number " + count);
				System.out.println("Start() " + s.start());
				System.out.println("End() " + s.end());
				
			}
			//matches requires the entire input sequence to be matched, while lookingAt does not
			System.out.println("lookingAt(): "+s.lookingAt()); //true
		    System.out.println("matches(): "+s.matches()); //false
		    
		    // use replace
		    String ff = "foo ass foooooo";
		    Pattern pat = Pattern.compile("foo");
		    Matcher m3 = pat.matcher(ff);
		    String out = m3.replaceAll("dog");
		    System.out.println("replace: " + out);
		    
		    
			
		}
}
