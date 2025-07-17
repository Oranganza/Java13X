package ex_22_Oops_Polymorphism;

public class Lab163_Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommonToAll c = new CommonToAll();
		c.openBrowser();
		
		FirefoxTc f = new FirefoxTc();
		f.openBrowser();
		
		CommonToAll c1 = new ChromeBrowser();
		c1.openBrowser();
	}

}

class CommonToAll
{
	void openBrowser()
	{
		System.out.println("Starting IE browser");
	}
}

class ChromeBrowser extends CommonToAll
{
	@Override
	void openBrowser()
	{
		System.out.println("Starting Chrome");
	}
}

class FirefoxTc extends CommonToAll
{
	@Override
	void openBrowser()
	{
		System.out.println("Starting firefox");
	}
}
