import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> buddyinfo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo b = new BuddyInfo("Weihong Shen", "Carleton", "613");
		AddressBook a = new AddressBook();
		a.addBuddy(b);
		a.removeBuddy(0);
	}
	
	public AddressBook() {
		buddyinfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo a) {
		if(a != null) {
			buddyinfo.add(a);
		}
	}
	
	public void removeBuddy(int index) {
		if(index >=0 && index < buddyinfo.size()) {
			buddyinfo.remove(index);
		}
	}

}
