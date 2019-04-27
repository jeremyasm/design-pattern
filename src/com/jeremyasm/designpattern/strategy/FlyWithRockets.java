package com.jeremyasm.designpattern.strategy;

public class FlyWithRockets implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with rockets !");
	}

}
