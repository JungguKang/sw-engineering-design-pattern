/**
 * when consume method is called by client
 * this class calls notifyObservers method
 * which updates all observers
 */
public class Battery extends Subject {
	private int level = 100;	

	public void consume(int amount)
	{
		level -= amount;
		notifyObservers();
	}
	public int getLevel() {return level;}

}
