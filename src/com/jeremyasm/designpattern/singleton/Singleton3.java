package com.jeremyasm.designpattern.singleton;

// thread safe, instantiate uniqueInstance immediately when JVM loads the class
class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3(); // static ... 

	private Singleton3() {} // notice that constructor is private

	public static synchronized Singleton3 getInstance() { // static
		return uniqueInstance;
	}
}
