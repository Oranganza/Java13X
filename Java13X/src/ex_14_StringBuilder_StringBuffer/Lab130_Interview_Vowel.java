package ex_14_StringBuilder_StringBuffer;

public class Lab130_Interview_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java program to count vowel and consonants
		// vowel -> "a, i, e, o, u"
		
		String input = "Java program to count vowel and consonants";
		//System.out.println("Enter the input");
		int vowel = 0;
		int consonants = 0;
		
		input = input.toLowerCase();
		System.out.println(input);
		
		for(int i = 0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(ch == 'a'||ch=='i' || ch=='o' ||ch == 'e'|| ch == 'u')
			{
				 vowel++;
				 
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Number of vowels-" +vowel);
		System.out.println("Number of consonants-" +consonants);
	}

}
