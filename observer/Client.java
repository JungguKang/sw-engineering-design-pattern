
public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery();
		
		BatteryLevelDisplay bld = new BatteryLevelDisplay(battery);
		LowBatteryWarning lbw = new LowBatteryWarning(battery);
		
		battery.attach(bld);
		battery.attach(lbw);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
	}

}
	