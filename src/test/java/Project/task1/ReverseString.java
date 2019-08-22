package Project.task1;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void reverse()
	{
		String name="GreensTechnology";
		String reverse="";
		
		int count=name.length();
		for(int i=count-1; i>=0; i--)
		{
			char s= name.charAt(i);
			reverse= reverse+s;
			
		}
		System.out.println(reverse);
	}

}
