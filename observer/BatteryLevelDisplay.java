public class BatteryLevelDisplay implements Observer {
	private Battery battery;
	
	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery;
	}
	/**
	 * updates battery level when battery is consumed
	 * and display battery level
	 */
	public void update() {
		int level = battery.getLevel();
		displayBatteryLevel(level);
	}
	
	private void displayBatteryLevel(int level) {
		System.out.println("Level : "+level);
	}

}
