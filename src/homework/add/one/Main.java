package homework.add.one;

public class Main {

	public static void main(String[] args) {
		Network network = new Network();
		String сallNumber;

		Phone phone1 = new Phone("+38-097-111-22-33", "380971112233", false);
		Phone phone2 = new Phone("+38-095-222-33-44", "380952223344", false);
		Phone phone3 = new Phone("+38-099-333-22-11", "380993332211", false);
		Phone phone4 = new Phone("+38-067-444-55-66", "380674445566", false);
		Phone phone5 = new Phone("+38-067-444-55-66", "380674445566", false);
		Phone phone6 = new Phone("+38-063-555-66-77", "380635556677", false);
		Phone phone7 = new Phone("+38-093-666-77-88", "380936667788", false);

		phone1.regInNetwork(network);
		phone2.regInNetwork(network);
		phone3.regInNetwork(network);
		phone4.regInNetwork(network);
		phone5.regInNetwork(network);
		phone6.regInNetwork(network);
		phone7.regInNetwork(network);

		сallNumber = "+38-063-555-66-77";

		if (network.isRegistered(сallNumber)) {
			System.out.println(phone1.callOutgoing(сallNumber));
		} else {
			System.out.println("Дзвінок не здійснено. Абонентский номер " + сallNumber + " не зареєстровано в мережі.");
		}

		if (network.isRegistered(сallNumber)) {
			phone1.callIncoming(сallNumber);
		} else {
			System.out.println(
					"Вам намагався подзвонити абонент з номером " + сallNumber + ", але зараз він не в мережі.");
		}
	}
}