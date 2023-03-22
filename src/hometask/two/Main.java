package hometask.two;

public class Main {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(0.3, 0.4, 0.5);
		Triangle triangle2 = new Triangle(-2, 3, 5);
		Triangle triangle3 = new Triangle(1, 1, 8);

		System.out.println(triangle1.toString());
		if (triangle1.isExist()) {
			System.out.println("Площа трикутника дорівнює: " + triangle1.calculateArea() + " кв.см");
		}
		System.out.println();
		System.out.println(triangle2.toString());
		if (triangle2.isExist()) {
			System.out.println("Площа трикутника дорівнює: " + triangle2.calculateArea() + " кв.см");
		}
		System.out.println();
		System.out.println(triangle3.toString());
		if (triangle3.isExist()) {
			System.out.println("Площа трикутника дорівнює: " + triangle3.calculateArea() + " кв.см");
		}
	}
}