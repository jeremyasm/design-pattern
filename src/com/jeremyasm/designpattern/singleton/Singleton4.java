package com.jeremyasm.designpattern.singleton;

// thread safe, instantiate uniqueInstance when needed
class Singleton4 {
	private static volatile Singleton4 uniqueInstance; // static, volatile

	private Singleton4() {} // notice that constructor is private

	public static synchronized Singleton4 getInstance() { // static
		if(uniqueInstance == null) { // double check
			synchronized(Singleton4.class) {
				if(uniqueInstance == null) { // double check
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}
}
