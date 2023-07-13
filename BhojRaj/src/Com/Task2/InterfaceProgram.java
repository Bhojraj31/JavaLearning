package Com.Task2;

interface person {

	public void details();

	static void print() {
		System.out.println("in static method");
	}

	default void msg() {
		System.out.println("in default method");
	}

}

interface specification {

	public void showDetails();
}

class Employee implements person {

	private String name;
	private int age;

	public void empTest() {
		System.out.println("employee class method");
	}

	public void details() {
		System.out.println(name + " : " + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Car implements person {

	private String fuelType;
	private String name;
	static int price = 1000;

	public void test() {

		System.out.println("car class method only");
	}

	public void details() {
		System.out.println(name + " : " + fuelType + " : " + price);
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Car.price = price;
	}

}

class Aeroplane implements person, specification {

	public void showDetails() {
		System.out.println("specification interface method");

	}

	public void details() {
		System.out.println("person interface method");
	}

}

public class InterfaceProgram {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Bhojraj");
		employee.setAge(22);
		employee.details();
		person.print();
		employee.msg();

		Employee emp1 = new Employee();
		emp1.setName("Shivang");
		emp1.details();
		emp1.msg();

		Car car = new Car();
		car.setFuelType("petrol");
		car.setName("skoda");
		car.details();
		car.msg();

		Car car1 = new Car();
		car1.setFuelType("Diesel");
		car1.setName("Maruti");
		car1.setPrice(15000);
		car1.details();
		car1.msg();

		car.details();

		Aeroplane a = new Aeroplane();
		a.msg();
		car.test();

	}
}
