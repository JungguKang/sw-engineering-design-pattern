/**
 * Command 인터페이스를 구현한 MuteCommand class
 * receiver인 tv에 접근하여 tv를 mute 시키는 역할을 한다.
 * @author 강정구
 *
 */
public class MuteCommand implements Command {
	
	private TV tv;
	
	public MuteCommand(TV tv)
	{
		this.tv = tv;
	}
	
	public void execute() {tv.mute(); }

}
