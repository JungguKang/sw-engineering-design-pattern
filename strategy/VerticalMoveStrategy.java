
public class VerticalMoveStrategy extends DirectionStrategy{

	public void move(Ball ball)
	{
		ball.setIntervals(0, Ball.INTERVAL);
	}
}
