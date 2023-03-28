package homework.add.one;

public class Phone {
	private String number;
	private String userID;
	private boolean isRegistered;

	public Phone() {
		super();
	}

	public Phone(String number, String userID, boolean isRegistered) {
		super();
		this.number = number;
		this.userID = userID;
		this.isRegistered = isRegistered;
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

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public void regInNetwork(Network network) {
		network.regPhone(this);
	}

	public String callOutgoing(String number) {
		if (!this.isRegistered()) {
			return "Дзвінок не здійснено. Ваш телефон не зареєстрований в мережі";
		} else if (this.getNumber().equals(number)) {
			return "Дзвінок не здійснено. Номер абонента, що викликається, не може співпадати з Вашим номером";
		} else {
			return "Ви успішно здійснили дзвінок на номер " + number;
		}
	}

	public void callIncoming(String number) {
		if (this.getNumber().equals(number)) {
			System.out.println("Вхідних дзвонків немає");
		} else {
			System.out.println("Вам надійшов дзвінок з номера " + number);
		}
	}
}