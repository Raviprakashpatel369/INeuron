package in.company.main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,2,2,3,3,4,5,5,6,7,8,};
		int n=arr.length;
		HashMap<Integer,Integer> c = new HashMap<Integer, Integer>();
		HashMap<Integer,Integer> d = new HashMap<Integer, Integer>();
	//	ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<n;++i){
			if(!c.containsValue(arr[i])){
				c.put(i, arr[i]);
			}
			else if(!d.containsValue(arr[i])){
				d.put(i, arr[i]);
			}
			
		}
		System.out.println(d.values());
	}	
}





