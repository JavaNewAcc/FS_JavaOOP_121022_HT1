package hometask.two;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
		super();
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public String toString() {
		return "Дано трикутник зі стороною A = " + sideA + " см, стороною B = " + sideB + " см, стороною C = " + sideC
				+ " см.";
	}

	public boolean isExist() {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			System.out.println("Сторона трикутника має бути більше 0.");
			return false;
		} else if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
			System.out.println("Трикутник зі сторонами " + sideA + ", " + sideB + ", " + sideC + " не існує");
			return false;
		}
		return true;
	}

	public double calculateArea() {
		double area;
		double p = (sideA + sideB + sideC) / 2;
		area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		return area;
	}
}