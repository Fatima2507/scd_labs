package lab5;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();//only one object  
		
		//created instances
		Thread1 t1=new Thread1(obj);  
		Thread2 t2=new Thread2(obj);  

		t1.start();
		t2.start();

		
	}

}
