
public class UserThread extends Thread{

	public UserThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		TicketMaker ticketMaker = new TicketMaker();
		System.out.println(Thread.currentThread().getName()+
				" is making ticket: " + ticketMaker.getNextTicketNumber());
	}
}
