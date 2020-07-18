
public class LowBatteryWarning implements Observer {

	private Battery battery;
	private static final int LOW_BATTERY = 30;
	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}
	
	/**
	 * updates battery level when battery is consumed
	 * and display battery level if it's lower than LOW_BATTERY
	 */
	public void update() {
		int level = battery.getLevel();
		if(level< LOW_BATTERY)
			System.out.println("<Warning> LowBattery :"
					+ level+" Compared with " +LOW_BATTERY);
	}
}
