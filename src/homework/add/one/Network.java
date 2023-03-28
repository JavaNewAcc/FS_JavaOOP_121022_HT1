package homework.add.one;

import java.util.Arrays;

public class Network {
	private String[] regPhonesArray = new String[] { "emptySlot", "emptySlot", "emptySlot", "emptySlot", "emptySlot" };
	private int counter = 0;

	public Network() {
		super();
	}

	public Network(String[] regPhonesArray) {
		super();
		this.regPhonesArray = regPhonesArray;
	}

	public String[] getRegPhonesArray() {
		return regPhonesArray;
	}

	public boolean isRegistered(String number) {
		for (int i = 0; i < regPhonesArray.length; i++) {
			if (regPhonesArray[i].equals(number)) {
				return true;
			}
		}
		return false;
	}

	public void regPhone(Phone phone) {
		if (!isRegistered(phone.getNumber())) {
			for (int i = 0; i < regPhonesArray.length; i++) {
				if (counter == regPhonesArray.length) {
					System.out.println("Телефон " + phone.getNumber()
							+ " не зареєстровано в мережі. Мережа зайнята. Спробуйте пізніше.");
					return;
				}
				if (regPhonesArray[i].equals("emptySlot")) {
					regPhonesArray[i] = phone.getNumber();
					counter++;
					phone.setRegistered(true);
					System.out.println("Телефон " + phone.getNumber() + " зареєстровано в мережі");
					return;
				}
			}
		} else {
			System.out.println("Телефон " + phone.getNumber() + " вже було зареєстровано в мережі");
		}
	}

	@Override
	public String toString() {
		return "Network [regPhonesArray=" + Arrays.toString(regPhonesArray) + ", counter=" + counter + "]";
	}
}