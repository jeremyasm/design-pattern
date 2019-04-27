package com.jeremyasm.designpattern.strategy;

public class DuckTest {
	public static void main(String[] args) {
		Duck duck = new Duck("McDonald", new FlyWithRockets());

		duck.fly();

		duck.setFlyBehavior(new FlyWithWings());

		duck.fly();

	}
}
