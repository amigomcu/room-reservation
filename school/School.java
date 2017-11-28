package school;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class School {
	private List<Room> roomList = new ArrayList<Room>();
	private String id;
	private static List<Request> pendingRequests = new ArrayList<Request>();
	private static List<Account> authorizedAccounts = new ArrayList<Account>();
	private List<Group> groupList = new ArrayList<Group>();
	
	public School(String nId) {
		id = nId;
		authorizedAccounts.add(makeAdmin());
		createSampleRequests();
	}
	
	public String getId() {
		return id;
	}
	
	public List<Room> getRoomList(){
		return roomList;
	}
	
	public static List<Request> getPendingRequests(){
		return pendingRequests;
	}
	
	public static List<Account> getAuthorizedAccounts(){
		return authorizedAccounts;
	}
	
	public List<Group> getGroupList(){
		return groupList;
	}
	
	public void addRoom(Room newRoom) {
		roomList.add(newRoom);
	}
	
	public Account makeAdmin() {
		Account admin = new Account("admin", "admin");
		return admin;
	}
	
	public static void AddPendingRequest(Request r) {
		School.pendingRequests.add(r);
	}
	
	public static void createSampleRequests() {
		Group MathClub = new Group("Math Club");
		Group ChessClub = new Group("Chess Club");
		Group HockeyTeam = new Group("Hockey Team");
		Booking[] mb1 = {
				new Booking(LocalTime.parse("01:00"),LocalTime.parse("02:00"),Semester.FALL, DayOfWeek.MONDAY, MathClub),
				new Booking(LocalTime.parse("02:00"),LocalTime.parse("03:00"),Semester.FALL, DayOfWeek.MONDAY, MathClub),
				new Booking(LocalTime.parse("03:00"),LocalTime.parse("04:00"),Semester.FALL, DayOfWeek.MONDAY, MathClub),
				new Booking(LocalTime.parse("04:00"),LocalTime.parse("05:00"),Semester.FALL, DayOfWeek.MONDAY, MathClub),
				new Booking(LocalTime.parse("05:00"),LocalTime.parse("06:00"),Semester.FALL, DayOfWeek.MONDAY, MathClub),
				};
		Booking[] cb1 = {
				new Booking(LocalTime.parse("01:00"),LocalTime.parse("02:00"),Semester.FALL, DayOfWeek.FRIDAY, ChessClub),
				new Booking(LocalTime.parse("02:00"),LocalTime.parse("03:00"),Semester.FALL, DayOfWeek.FRIDAY, ChessClub),
				new Booking(LocalTime.parse("03:00"),LocalTime.parse("04:00"),Semester.FALL, DayOfWeek.FRIDAY, ChessClub),
				new Booking(LocalTime.parse("04:00"),LocalTime.parse("05:00"),Semester.FALL, DayOfWeek.FRIDAY, ChessClub),
				new Booking(LocalTime.parse("05:00"),LocalTime.parse("06:00"),Semester.FALL, DayOfWeek.FRIDAY, ChessClub),
				};
		Booking[] hb1 = {
				new Booking(LocalTime.parse("01:00"),LocalTime.parse("02:00"),Semester.FALL, DayOfWeek.TUESDAY, HockeyTeam),
				new Booking(LocalTime.parse("02:00"),LocalTime.parse("03:00"),Semester.FALL, DayOfWeek.TUESDAY, HockeyTeam),
				new Booking(LocalTime.parse("03:00"),LocalTime.parse("04:00"),Semester.FALL, DayOfWeek.TUESDAY, HockeyTeam),
				new Booking(LocalTime.parse("04:00"),LocalTime.parse("05:00"),Semester.FALL, DayOfWeek.TUESDAY, HockeyTeam),
				new Booking(LocalTime.parse("05:00"),LocalTime.parse("06:00"),Semester.FALL, DayOfWeek.TUESDAY, HockeyTeam),
				};
		Request samReq1 = new Request(new Applicant("Jen", MathClub), 1, new Room("ChemLab", 1), mb1, "Math Club Tournament");
		Request samReq2 = new Request(new Applicant("Bob", MathClub), 2, new Room("Library", 2), cb1, "Chess Meeting");
		Request samReq3 = new Request(new Applicant("Steve", MathClub), 1, new Room("Gym", 3), hb1, "Hockey Practice");
	}
}
