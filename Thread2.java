package lab5;

public class Thread2 extends Thread{
	Customer c;; 
	Thread2(Customer c){  
	this.c=c;  
	} 
	
	public void run()
	{
		c.withdraw(20000);
	}

}
