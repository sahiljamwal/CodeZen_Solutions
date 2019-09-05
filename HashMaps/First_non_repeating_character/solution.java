package HashMaps.First_non_repeating_character;

import java.util.HashMap;

/*
	- You are given a string, that can contain repeating characters.
	- Your task is to return the first character in this string that does not repeat. i.e., occurs exactly once
	- The string will contain characters only from English alphabet set, i.e., ('A' - 'Z') and ('a' - 'z');

*/

public class solution 
{
	public static char firstNonRepeatingChar(String str)
	{
		//	write your code here.
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count=map.get(str.charAt(i));
				count++;
				map.put(str.charAt(i), count);
						
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		
		char ans=str.charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			if(map.get(str.charAt(i))==1)
			{
				ans=str.charAt(i);
				break;
			}
		}
		
		return ans;
 
	}
}
