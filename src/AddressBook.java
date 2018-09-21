import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<BuddyInfo> buddyinfo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hahahahahahahahahahahahaha
		BuddyInfo buddy = new BuddyInfo("Weihong Shen", "Carleton", "613");
		AddressBook address = new AddressBook();
		address.addBuddy(buddy);
		address.removeBuddy(0);
	}
	
	public AddressBook() {
		this.buddyinfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo a) {
		if(a != null) {
			this.buddyinfo.add(a);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if(index >=0 && index < this.buddyinfo.size()) {
			return this.buddyinfo.remove(index);
		}
		return null;
	}

}
