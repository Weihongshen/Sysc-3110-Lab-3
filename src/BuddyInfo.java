
public class BuddyInfo {
	
	public String name;
	public String phonenum;
	public String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public BuddyInfo(String name, String phonenum, String address) {
		this.name=name;
		this.phonenum=phonenum;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
