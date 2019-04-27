package com.jeremyasm.designpattern.singleton;

// thread unsafe
class Singleton1 {
	private static Singleton1 uniqueInstance; // static

	private Singleton1() {} // notice that constructor is private

	public static Singleton1 getInstance() { // static, instantiate uniqueInstance when needed
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}
