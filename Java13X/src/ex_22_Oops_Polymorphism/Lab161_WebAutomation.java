package ex_22_Oops_Polymorphism;

public class Lab161_WebAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser b = new Browser();
		//b.startBrowser();
		b.startBrowser("Chrome");
	}

}

class Browser
{
	void startBrowser()
	{
		System.out.println("Starting a default Browser");
		
	}
	
	String startBrowser(String Browser)
	{
		System.out.println("Starting a Browser" +Browser);
		return Browser;
	}
}
