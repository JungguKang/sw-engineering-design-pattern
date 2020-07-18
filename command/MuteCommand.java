/**
 * Command �������̽��� ������ MuteCommand class
 * receiver�� tv�� �����Ͽ� tv�� mute ��Ű�� ������ �Ѵ�.
 * @author ������
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
