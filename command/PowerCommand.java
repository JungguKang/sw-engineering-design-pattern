/**
 * Command �������̽��� ������ PowerCommand class
 * receiver�� tv�� �����Ͽ� tv�� power on/off ��Ű�� ������ �Ѵ�.
 * @author ������
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
