package com.algorithmic.preparation;

import java.util.Arrays;
import java.util.Collections;

public class MaximumWoodLengthforNWoodAndKPieces {

	public boolean isValidLength(Integer[] woodLengths, int len, int pieces) {
		
		int calculatedPiecesCount = 0;
		
		for(int i=0;i< woodLengths.length;i++) {
			calculatedPiecesCount+=woodLengths[i]/len;
		}
		
		return calculatedPiecesCount>=pieces;
		
	}
	
	public void getMaxLength (int pieces, Integer[] woodLengths) {
	
		int maxLength = Collections.max( Arrays.asList(woodLengths));
		int left =1;
		int right = maxLength;
		
		while(left<= right) {
			int mid = left + (right - left)/2;
			
			System.out.println(mid);
			
			if(isValidLength(woodLengths, mid, pieces)) {
				left = mid +1;
			} else {
				right = mid -1;
			}
		}
		
		System.out.println("Maximum Length to get "+ pieces + " pieces of wood is " + right);
		
	}
	
	public static void main(String[] args) {
		MaximumWoodLengthforNWoodAndKPieces obj = new MaximumWoodLengthforNWoodAndKPieces();
		
		int pieces = 4;
		Integer[] woodLengths = {5,9,7};
		
		obj.getMaxLength(pieces, woodLengths);
		
		
	}
}
