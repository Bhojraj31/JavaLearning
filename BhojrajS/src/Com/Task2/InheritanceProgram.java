package Com.Task2;

class Parent {

	public void method() {
		System.out.println("Parent method");
	}

	public void test() {
		System.out.println("test");
	}
}

class Child extends Parent {

	public void method() {

		System.out.println("Child method");
	}

	public void test2() {
		System.out.println("test2");
	}
}

public class InheritanceProgram {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.method();
		Child obj1 = new Child();
		obj1.method();
		Child obj3 = new Child();
		Child obj4 = obj3;
		System.out.println(obj3.equals(obj4));
		System.out.println(obj3 == obj4);

	}
}
