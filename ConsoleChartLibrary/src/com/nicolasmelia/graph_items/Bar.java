package com.nicolasmelia.graph_items;

public class Bar {
	
	// The value is the height of the bar. Ex. 1 - 10 for example
	private int value;
	
	// This String declares the name of the bar. Ex. May or June 
	private String Name;

	public Bar(int value, String Name) {
		// Constructor method for the bar object
		this.value = value;
		this.Name = Name;
	}
	
	public String getName(){
		return this.Name;
		}
	
	public int getValue(){
		return value;
	}
	
	
	

}
