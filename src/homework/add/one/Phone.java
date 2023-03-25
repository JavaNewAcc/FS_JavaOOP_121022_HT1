package homework.add.one;

public class Phone {
	private String number;
	private String userID;

	public Phone() {
		super();
	}

	public Phone(String number, String userID) {
		super();
		this.number = number;
		this.userID = userID;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void regInNetwork(Network network) {
		network.regPhone(this.number);
	}

	public String callOutgoing(String phoneNumber) {
		
		return "";
	}

	public String callIncoming() {
		return "";
	}

}
