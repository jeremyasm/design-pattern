package com.jeremyasm.designpattern.observer;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private String weather = "sunny";
	
	void setWeather(String newWeather) {
		weather = newWeather;
		setChanged(); // inherited from Observable
		notifyObservers(); // inherited from Observable
	}
	
	String getWeather() {
		return weather;
	}
	
}
