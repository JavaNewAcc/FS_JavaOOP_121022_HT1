package hometask.one;

public class Product {
	private String manufacturer;
	private String model;
	private double screenSize;
	private double price;

	public Product() {
		super();
	}

	public Product(String manufacturer, String model, double screenSize, double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.screenSize = screenSize;
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Phone [manufacturer=" + manufacturer + ", model=" + model + ", screen size=" + screenSize
				+ " inches, price=" + price + "UAH]";
	}

	public boolean isScreenBigger(double screenSize) {
		if (this.screenSize > screenSize) {
			return false;
		}
		return true;
	}
}
