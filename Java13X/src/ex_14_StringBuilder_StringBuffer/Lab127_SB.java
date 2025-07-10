package ex_14_StringBuilder_StringBuffer;

public class Lab127_SB {
 
	public static void main(String[] args)
	{
		StringBuffer stringBuffer = new StringBuffer("Pramod");
		stringBuffer.append("Patel");
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.reverse());
	}
}
