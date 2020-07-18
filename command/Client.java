
public class Client {

	public static void main(String[] args)
	{
		TV tv = new TV();
		TwoButtonController rc = new TwoButtonController();
		Command powerOnCommand = new PowerCommand(tv);
		Command muteCommand = new MuteCommand(tv);
		
		/**
		 * remotecontroller �� �� ��ư�� ������ �������ش�.
		 * �̶� command type�� ������ �޾ƿ� set �Լ��� �Ҵ��Ѵ�.
		 */
		rc.setButton1Mode(powerOnCommand);
		rc.setButton2Mode(muteCommand);
		
		rc.button1Pressed();
		rc.button2Pressed();
		rc.button1Pressed();
		rc.button1Pressed();
		rc.button2Pressed();
		rc.button1Pressed();
		rc.button2Pressed();
	}
}
