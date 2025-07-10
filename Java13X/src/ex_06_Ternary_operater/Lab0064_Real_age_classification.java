package ex_06_Ternary_operater;

public class Lab0064_Real_age_classification {

	public static void main(String[] args)
	{
		// age = 23 
		// age < 18 - Minor
		// age < 18 > 65 - Adult
		// age > 65 Senior citizen
		
		int age = 50;
		String result = (age < 18) ? "Minor" : (age < 65)? "Adult" : "Senior citizen";
		System.out.println(result);
	}
}
