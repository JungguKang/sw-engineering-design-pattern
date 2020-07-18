
public class TwoButtonController {

	private Command button1Command, button2Command;	
	public TwoButtonController(){}
	/**
	 * client���� command �� �޾� �� button �� ���� ������ �� �� �޾ƿ´�. 
	 * �׸��� TwoButtonController���� ���� �� �� �ֵ��� Command type ���� �����Ѵ�.
	 * @param c
	 */
	public void setButton1Mode(Command c){
		button1Command = c;
	}
	
	public void setButton2Mode(Command c) {
		button2Command = c;
	}
	/**
	 * polymorphism�� Ȱ���� button 1 2 �� �ش�Ǵ� ����� �����Ѵ�.
	 */
	public void button1Pressed(){
		button1Command.execute();			
	}
	public void button2Pressed(){
		button2Command.execute();
	}
}
