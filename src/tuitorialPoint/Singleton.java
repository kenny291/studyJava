package tuitorialPoint;

public class Singleton {
	private static  Singleton singleton = new Singleton();
	
	/* A private Constructor prevents any other
	    * class from instantiating.
	    */
	private Singleton(){}
	
	// static instance method
	public static Singleton getInstance(){
		return singleton;
	}
	//only callable in pakages
	protected static void demoMethod(){
		System.out.print("Method static demoMethod");
	}
	

}
