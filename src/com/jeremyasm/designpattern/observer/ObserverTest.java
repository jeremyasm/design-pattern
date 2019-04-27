package com.jeremyasm.designpattern.observer;

public class ObserverTest {
	
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		Tom tom = new Tom(wd);
		
		System.out.println(wd.getWeather());
		System.out.println(tom.getWeather());
		
		wd.setWeather("rainy"); // notifyObservers in setWeather(String newWeather)
		
		tom.unsubscribe();
		
		wd.setWeather("snowy");
	}

}
