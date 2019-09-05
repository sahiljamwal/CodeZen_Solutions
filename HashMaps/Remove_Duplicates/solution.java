package HashMaps.Remove_Duplicates;

import java.util.*;

/*
	- You are given a sorted integer array that can contain duplicate entries, i.e., same value might appear more than once.

	- Your task is to create a new sorted array that will not contain any duplicates, i.e., the repeating elements should appear only once.

*/

public class solution 
{
	public static int[] removeDuplicates(int arr[])
	{
		//	write your code here.
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				
			}
			else
			{
				map.put(arr[i], arr[i]);
			}
		}

		int ans[]=new int[map.size()];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				ans[index]=map.remove(arr[i]);
				index++;
			}
		}
		
		return ans;
	}
}
