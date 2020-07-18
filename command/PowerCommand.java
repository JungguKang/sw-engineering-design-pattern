/**
 * Command 인터페이스를 구현한 PowerCommand class
 * receiver인 tv에 접근하여 tv를 power on/off 시키는 역할을 한다.
 * @author 강정구
 *
 */
public class PowerCommand implements Command{

	private TV tv;
	
	public PowerCommand(TV tv)
	{
		this.tv = tv;
	}
	
	public void execute() {tv.power(); }
}
