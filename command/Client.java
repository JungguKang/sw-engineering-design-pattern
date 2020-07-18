
public class Client {

	public static void main(String[] args)
	{
		TV tv = new TV();
		TwoButtonController rc = new TwoButtonController();
		Command powerOnCommand = new PowerCommand(tv);
		Command muteCommand = new MuteCommand(tv);
		
		/**
		 * remotecontroller 에 각 버튼의 역할을 지정해준다.
		 * 이때 command type의 역할을 받아와 set 함수로 할당한다.
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
