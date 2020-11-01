package com.algorithmic.preparation;

import java.util.Arrays;
import java.util.Stack;

public class NextHighTemperature {
	
	public static void nextHightemperature(int[] arr) {
		
		int arrLen = arr.length;
		
		int[] nextWarm = new int[arrLen];
		Arrays.fill(nextWarm, -1);
		
		Stack<Integer> s = new Stack<>();
		
		for (int i =0; i<arrLen; i++) {
			
			while(!s.empty() && arr[s.peek()]< arr[i]) {
				nextWarm[s.peek()] = i -s.peek();
				s.pop();
			}
			s.add(i);
		}
		
		for(int j=0;j<nextWarm.length; j++) {
			System.out.println("element = "+ arr[j] + " | next warm = "+ nextWarm[j]);
		}
	}

	public static void main(String[] args) {
		int[] arr =  { 73, 74, 75, 71, 69, 72, 76, 73 };
		
		nextHightemperature(arr);

	}

}
