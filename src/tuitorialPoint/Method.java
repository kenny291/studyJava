package tuitorialPoint;

public class Method {
	
	//  a class has two or more methods by the same name but different parameters
	// command line passing
	public static void main (String args[]){
		for (int i=0; i< args.length; i++){
			System.out.println("args[" + i +"]:" + args[i]);
		}
		
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[]{1, 2, 3});
	}
	//many args
	 public static void printMax(double ... numbers) {
	      if (numbers.length == 0) {
	         System.out.println("No argument passed");
	     return;
	     }
	
		 double result = numbers[0];
		
		 for (int i = 1; i <  numbers.length; i++){
			 if (numbers[i] >  result)
			 result = numbers[i];
		 }
		 System.out.println("The max value is " + result);
	}
}
