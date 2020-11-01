package com.algorithmic.preparation;

import java.util.Stack;

public class ImplementBrowserBackwardAndForward {

	public static String currentUrl = "";
	
	public Stack<String> backWardStack = new Stack<>();
	public Stack<String> forWardStack = new Stack<>();
	
	public void visitNewUrl(String newUrl) {
		
		if(currentUrl!= "") {
			backWardStack.add(currentUrl);
		} 
		currentUrl = newUrl;
		System.out.println("->Visited URL = " + currentUrl);
	}
	
	public void backOperation() {
		if(backWardStack.empty()) {
			System.out.println("No URL to backward");
		} else {
			
			forWardStack.add(currentUrl);
			currentUrl = backWardStack.peek();
			backWardStack.pop();
			System.out.println("Current Url after Back Operation = "+ currentUrl);
		}
		
		
	}
	
	public void forwardOperation() {
		if(forWardStack.empty()) {
			System.out.println("No URL to Forward");
		} else {
			
			backWardStack.add(currentUrl);
			currentUrl = forWardStack.peek();
			forWardStack.pop();
			System.out.println("Current Url after Forward Operation = "+ currentUrl);
		}
		
		
	}
	
	public  void Simulation() {
		String newUrl = "abc.com";	
		visitNewUrl(newUrl);
		
		newUrl = "xyz.com";		
		visitNewUrl(newUrl);
		
		newUrl = "def.com";		
		visitNewUrl(newUrl);
		
		newUrl = "fgh.com";		
		visitNewUrl(newUrl);
		
		forwardOperation();
		
		backOperation();
		
		forwardOperation();
		
		backOperation();
		
		backOperation();
		
		backOperation();
		
		backOperation();
		
		backOperation();
		
		forwardOperation();
		
		forwardOperation();
		
		forwardOperation();
		
		forwardOperation();
		
	}
	public static void main(String[] args) {
		
		ImplementBrowserBackwardAndForward obj = new ImplementBrowserBackwardAndForward();
		obj.Simulation();
	}
}
