package tuitorialPoint;

import java.rmi.RemoteException;

public class ExceptionJa {

	public void deposit(double amount) throws RemoteException{
		throw new RemoteException();
		
	}
	public static void main (String []args)  throws Exception{
		ExceptionJa a = new ExceptionJa();
		a.deposit(12);
	}
}

// User Exception
//import java.io.*;
//
//public class InsufficientFundsException extends Exception {
//   private double amount;
//   
//   public InsufficientFundsException(double amount) {
//      this.amount = amount;
//   }
//   
//   public double getAmount() {
//      return amount;
//   }
//}
