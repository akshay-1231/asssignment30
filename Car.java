package assignment30;

public class Car {
	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	public Car(String carModel, String carName, double carPrice, String carOwner) {
		super();
		this.carModel = carModel;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carOwner = carOwner;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public void assignValue() {
		System.out.println("values for each car");
	}

}
