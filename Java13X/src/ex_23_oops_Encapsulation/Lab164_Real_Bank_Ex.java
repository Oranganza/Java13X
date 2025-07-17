package ex_23_oops_Encapsulation;

public class Lab164_Real_Bank_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICIBank amit = new ICICIBank("Amit" , 100);
		long Balance = amit.getBalance();
		System.out.println(Balance);
		
		amit.setBalance(500, true);
		long balnce = amit.getBalance();
		System.out.println(balnce);
		
	}
}

//- Encapsulation is a fundamental concept in Object oriented programming
//- Bundling of data and methods that operate on that data within a single
//- Data members should be private in nature
//- Methods with getter and setter only, you can access the data members


class ICICIBank
{
	
	 private String name;
	 private long Balance;
	 

public ICICIBank(String name, long balance) {
		super();
		this.name = name;
		Balance = balance;
	}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public long getBalance() {
	return Balance;
}


public void setBalance(long balance, boolean isCashier) {
	if(isCashier)
	{
		Balance = balance;
		
	}
	else
	{
		System.out.println("Not allowed to change the balance");
	}
	
}






 
}