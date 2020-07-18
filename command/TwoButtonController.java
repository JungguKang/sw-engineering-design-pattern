
public class TwoButtonController {

	private Command button1Command, button2Command;	
	public TwoButtonController(){}
	/**
	 * client에서 command 를 받아 각 button 이 무슨 역할을 할 지 받아온다. 
	 * 그리고 TwoButtonController에서 실행 할 수 있도록 Command type 으로 저장한다.
	 * @param c
	 */
	public void setButton1Mode(Command c){
		button1Command = c;
	}
	
	public void setButton2Mode(Command c) {
		button2Command = c;
	}
	/**
	 * polymorphism을 활용해 button 1 2 에 해당되는 기능을 수행한다.
	 */
	public void button1Pressed(){
		button1Command.execute();			
	}
	public void button2Pressed(){
		button2Command.execute();
	}
}
