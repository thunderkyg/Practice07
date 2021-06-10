package com.javaex.ex02;

public abstract class Bird {
	
	//Field
    private String name;


    //Constructor
    public Bird() {

    }

	public Bird(String name) {
		this.name = name;
	}

    //Method - G/S
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
    //Method - Ordinary
	
	public void showName() {
		
	}
	
	public void fly() {
		
	}
	
	public void sing() {
		
	}

}
