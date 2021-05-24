package lab5;

public class Customer {
	int amount=50000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount){  
	System.out.println("Insufficient Balance");  
	try{wait();}catch(Exception e){}  
	}  
	this.amount-=amount;  
	System.out.println("withdraw completed...");  
	}  

}
