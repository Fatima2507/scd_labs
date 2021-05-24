package lab5;

public class Thread1 extends Thread {
Customer c;; 
Thread1(Customer c){  
this.c=c;  
}  

	public void run()
	{
		c.withdraw(45000);
	}

}
