package homework.add.one;

import java.util.Arrays;

public class Network {
	private String[] regPhonesArray = new String[] { "emptySlot", "emptySlot", "emptySlot", "emptySlot", "emptySlot",
			"emptySlot", "emptySlot", "emptySlot", "emptySlot", "emptySlot" };
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

	public void regPhone(String phoneNumber) {
		for (int i = 0; i < regPhonesArray.length; i++) {
			if (counter == regPhonesArray.length) {
				System.out.println("Мережа зайнята. Спробуйте пізніше.");
				return;
			}
			if (regPhonesArray[i].equals(phoneNumber)) {
				System.out.println("Телефон вже було зареєстровано в мережі");
				return;
			}
			if (regPhonesArray[i].equals("emptySlot")) {
				regPhonesArray[i] = phoneNumber;
				counter++;
				System.out.println("Телефон зареєстровано в мережі");
				return;
			}
		}
	}

	@Override
	public String toString() {
		return "Network [regPhonesArray=" + Arrays.toString(regPhonesArray) + ", counter=" + counter + "]";
	}
}