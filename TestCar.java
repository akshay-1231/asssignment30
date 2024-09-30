package assignment30;
import java.util.Scanner;
public class TestCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre carmodel,carname,carprice,carowner");
		String carModel=sc.next();
		String carName=sc.next();
		double carPrice=sc.nextDouble();
		String carOwner=sc.next();
		
		 Car car=new Car(carOwner, carOwner, carPrice, carOwner);
		 car.setCarModel(carModel);
			car.setCarName(carName);
			car.setCarPrice(carPrice);
			car.setCarOwner(carOwner);
			//display methd
			System.out.println("displying details");
			System.out.println("carModel is" + car.getCarModel());
			System.out.println("carName is" + car.getCarName());
			System.out.println("carPrice is" + car.getCarPrice());
			System.out.println("carOwner is" + car.getCarOwner());
			car. assignValue();
	}

}
