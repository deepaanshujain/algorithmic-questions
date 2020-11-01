package com.algorithmic.preparation;

public class HouseRobber {
	
	public static void maxRobbery(int[] houseWealth) {
		
		int[] selectedHouses = new int[houseWealth.length];
		
		selectedHouses[0] = houseWealth[0];
		selectedHouses[1] = Math.max(houseWealth[0], houseWealth[1]);
		
		for(int i = 2; i< houseWealth.length; i++) {
			selectedHouses[i] = Math.max(houseWealth[i] + selectedHouses[i-2], selectedHouses[i-1]);
		}
		
		System.out.println("Maximum Robbery = " + selectedHouses[houseWealth.length -1]);
	}
	
	public static void main(String[] args) {
		int[] houseWealth = {2,1,1,2};
		
		maxRobbery(houseWealth);
	}

}
