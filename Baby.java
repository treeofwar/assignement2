import java.util.*;

public class Baby implements Subject {
	private Cry cry;//creates instance of the cry list
	private ArrayList<Observer> observers; 
	public Baby() {
		System.out.println("a baby is born");
		 observers = new ArrayList<Observer>();
		 this.cry = cry;
	}
	public void hungryCry() {
		System.out.println("this baby is hungry");
		notifyObservers();
	}
	public void angryCry() {
		System.out.println("this baby is angry!");
		notifyObservers();
	}
	public void wetCry() {
		System.out.println("this baby is wet");
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(cry);
		}
	}
}
