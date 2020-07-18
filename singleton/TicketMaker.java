
public class TicketMaker {
	//declare ticket static so each thread 
	//can access the same variable ticket
	private static int ticket = 1000;
	
	/**
	 * also while increasing ticket value and returning 
	 * other thread can get access so synchronize the method 
	 * so other thread can't get access
	 * @return ticket number
	 */
	public synchronized static int getNextTicketNumber()
	{
		return ticket++;
	}

}
