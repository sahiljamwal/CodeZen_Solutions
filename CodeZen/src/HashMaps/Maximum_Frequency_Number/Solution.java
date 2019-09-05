package HashMaps.Maximum_Frequency_Number;

import java.util.HashMap;
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
	
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count=map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		int max=arr[0];
		int maxFrequency=map.get(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			int tempFrequency=map.get(arr[i]);
			if(tempFrequency>maxFrequency)
			{
				max=arr[i];
			}
		}
        
        
		
		return max;
	}
}