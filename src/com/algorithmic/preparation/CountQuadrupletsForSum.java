package com.algorithmic.preparation;

import java.util.HashMap;
import java.util.Map;

public class CountQuadrupletsForSum {
	
	
	public void countSum(Integer[] arr, Integer sum) {
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + ", ");
		}
		System.out.println("\n");
		Map<Integer, Integer> map = new HashMap<>();
		
		Integer count = 0;
		
		for( int i =0; i<arr.length-1; i++) {
			
			
			for (int j= i +1; j<arr.length; j++) {
				Integer temp = arr[i] + arr[j];
				
				if(temp<sum) {
					if(map.get(sum-temp)!=null) {
						
						count+=map.get(sum-temp);
						System.out.println("Increment Count =" + count);
					}
				}
				
				System.out.println("First loop => i ="+ i+ " arr[i] =" + arr[i] + " | j="+ j+ " arr[j]= " +arr[j] + " | map ="+ map.toString());
			}
			
			for(int j=0;j<i;j++) {
				int temp = arr[i] + arr[j];
				if(temp<sum) {
					if( map.get(temp) == null) {
						map.put(temp, 1);
					} else {
						map.put(temp, map.get(temp) +1);
					}
					
				}
				
				System.out.println("Second loop => i ="+ i+ " arr[i] =" + arr[i] + " | j="+ j+ " arr[j]= " +arr[j] + " | map ="+ map.toString());
			}
		}
		
		
		System.out.println("Count = " + count);
	}
	
	
	public static void main(String[] args) {
		CountQuadrupletsForSum obj = new CountQuadrupletsForSum();
		
		Integer arr[] = { 4, 5, 3, 1, 2, 4 };
		
		Integer sum= 13;
		obj.countSum(arr, sum);
	}
	
	

}
