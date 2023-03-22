package hometask.one;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone("Samsung", "S23", 6.1, 39999);
		Phone phone2 = new Phone("IPhone", "14", 6.1, 35999);
		System.out.println("Характеристики та ціна на телефони в наявності:");
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println();
		System.out.println("Характеристики та ціна на телефони з доставкою через 30 днів:");
		double price1 = phone1.getPrice();
		phone1.setPrice(price1 - 599);
		double price2 = phone2.getPrice();
		phone2.setPrice(price2 - 999);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println();
		if (phone1.isScreenBigger(10)) {
			System.out.println(
					"Екран Вашого пристрою більше ніж екран " + phone1.getManufacturer() + " " + phone1.getModel());
		} else {
			System.out.println(
					"Екран Вашого пристрою менше ніж екран " + phone1.getManufacturer() + " " + phone1.getModel());
		}
		if (phone2.isScreenBigger(3)) {
			System.out.println(
					"Екран Вашого пристрою більше ніж екран " + phone2.getManufacturer() + " " + phone2.getModel());
		} else {
			System.out.println(
					"Екран Вашого пристрою менше ніж екран " + phone2.getManufacturer() + " " + phone2.getModel());
		}
	}
}