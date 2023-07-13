package Com.Task2;

abstract class User{
	static int num;
	int ab=10;
	static void method3() {
		num=10;
		System.out.println(num);
	}
	public void method() {
		System.out.println("in abstract");
	}
	public abstract void method2();
	static void staticMethod() {
		System.out.println("in static method");
	}
}
class Student extends User{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("in student class method");
		
	}
	public void method() {
		System.out.println("in student");
	}
	

}

public class AbstractProgram {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.method();
		
		Student.staticMethod();
		User.staticMethod();
		Student.method3();
	
		obj.ab=14;
		System.out.println(obj.ab);
		Student obj1 = new Student();
		System.out.println(obj1.ab);
		
		System.out.println("------------------");
		System.out.println(obj.getClass());
	}

}
