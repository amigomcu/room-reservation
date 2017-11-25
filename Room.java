public class Room {
	//availableTimes[0][0] is Sunday at 8am, availableTimes[0][1] is 9am, etc
	//availableTimes[1][0] is Monday at 8am.
	private timeSlot[][] availableTimes = new timeSlot[7][16];
	private String name;
	private int idno;
	
	public Room(String nName, int nIdno) {
		availableTimes = initialize();
		name = nName;
		idno = nIdno;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIDno() {
		return idno;
	}
	
	public timeSlot[][] initialize() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 16; j++) {
				availableTimes[i][j] = new timeSlot();
			}
		}
		return availableTimes;
	}
	
	public void addAvailability(int weekday, int[] time) {
		for(int t:time) {
			availableTimes[weekday][t].makeAvailable();
		}
	}
}