package com.jeremyasm.designpattern.singleton;

// thread safe, but synchronized method costs a lot 
class Singleton2 {
	private static Singleton2 uniqueInstance; // static

	private Singleton2() {} // notice that constructor is private

	public static synchronized Singleton2 getInstance() { // static, instantiate uniqueInstance when needed
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
}
