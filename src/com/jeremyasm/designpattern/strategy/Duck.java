package com.jeremyasm.designpattern.strategy;

public class Duck {
	String name;
	FlyBehavior flyBehavior; // FlyBehavior is an interface rather than a class
	
	Duck(String name, FlyBehavior flyBehavior){
		this.name = name;
		this.flyBehavior = flyBehavior;
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior; // Dynamically set behavior (algorithm)
	}
	
	public void fly() {
		this.flyBehavior.fly(); // Delegate behavior to other object
	}
}
