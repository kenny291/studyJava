package tuitorialPoint;

import tuitorialPoint.InnerClass.getAll;
import tuitorialPoint.InnerClass.nest_demo;

public class InnerMainClass {
	public static void main (String []args){
		InnerClass instance = new InnerClass();
		instance.display_inner();
		
		// get value, call inner calss
		InnerClass.getAll new_instance_inner = instance.new getAll();
		new_instance_inner.getValue();
		
		// abstract anonymous inner class
		InnerAnonymous iner = new InnerAnonymous() {
			
			// @Override
			public void mymethod() {
				// TODO Auto-generated method stub
				System.out.print("anonymous inner class");
			}
		};
		iner.mymethod();
		
		//static inner class
		InnerClass.nest_demo static_class = new InnerClass.nest_demo();
		static_class.say_st();
		
	}
}
