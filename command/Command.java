/**
 * ocp를 위해 TwoButtonController class에서 MuteCommand, PowerCommand
 * 를 받을 수 있도록 해주는 interface이다.
 * @author 강정구
 *
 */
public interface Command {

	abstract public void execute();
}
