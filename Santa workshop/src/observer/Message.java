package observer;

import java.util.ArrayList;
import java.util.List;

public class Message implements Observable {

	private List<Observer> observers;	
	private String message;
	
	public Message() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setMessage(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		this.notifyObservers();
	}

}
