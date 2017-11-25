
public class Group {
	private String name;
	private int preferredLevel;
	
	public Group(String nName, int nPreferredLevel) {
		name = nName;
		preferredLevel = nPreferredLevel;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPreferredLevel(int newLevel) {
		preferredLevel = newLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPreferredLevel() {
		return preferredLevel;
	}
}