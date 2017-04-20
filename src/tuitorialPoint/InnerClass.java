package tuitorialPoint;

public class InnerClass {
	private int a = 12;
	
	private class  SubClass{
		public void print(){
			System.out.println("THis is sub-inner class");
		}
	}
	public class getAll{
		public int getValue(){
			System.out.print(a);
			return a;
		}
	}
	void display_inner(){
		SubClass InnerDemo = new SubClass();
		InnerDemo.print();
		}
	// Static inner class
	static class nest_demo{
		public void say_st(){
			System.out.println("THis is static inner class");
		}
	}
	
	//access inner class
//	void my_Method() {
//	      int num = 23;
//
//	      // method-local inner class
//	      class MethodInner_Demo {
//	         public void print() {
//	            System.out.println("This is method inner class "+num);	   
//	         }   
//	      } // end of inner class
//		   
//	      // Accessing the inner class
//	      MethodInner_Demo inner = new MethodInner_Demo();
//	      inner.print();
//	   }
//	   
//	 public static void main(String args[]) {
//	      Outerclass outer = new Outerclass();
//	      outer.my_Method();	   	   
//	   }
}

