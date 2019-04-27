package com.jeremyasm.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Tom implements Observer {
	
	Observable observable;
	
	String weather;
	
	Tom(Observable o){
		this.observable = o;
		this.observable.addObserver(this); // add itself to Observable's observer list
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			this.weather = wd.getWeather();
			System.out.println("Tom: weather is " + this.weather);
		}
	}
	
	public void unsubscribe() {
		this.observable.deleteObserver(this);
	}
	
	String getWeather() {
		return weather;
	}
	
}
