package Com.Task2;

class Mobile{
	String name;
	static String type;
	int price;
	public Mobile() {
		name="Realme";
		price=19000;
	}
	public Mobile(String nam,int price) {
		this.name=nam;
		this.price=price;
	}
	public void show() {
		System.out.println(name+":"+price+":"+type);
	}
	static {
		int b=10;
		type="mobile";
		System.out.println(b+ " " + type+" in static block");
	}
	public static void show1() {
		System.out.println(type+" in static method");
	}
	public static void details(Mobile obj) {
		System.out.println(obj.name+" : "+obj.price+" : "+type);
	}
}
class Phone extends Mobile{
	public static void show1() {
		System.out.println("in child class static method");
	}
}

public class StaticProgram {
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.name="Oppo";
		obj.price=12000;
		Mobile obj1=new Mobile();
		obj1.name="Vivo";
		obj1.price=18000;
		obj.show();
		obj1.show();
		Mobile.show1();
		Phone.show1();
		Mobile cobj=new Mobile();
		cobj.show();
		Mobile cobj1=new Mobile("Akshit", 9999);
		cobj1.show();
		Mobile.details(obj1);
		}
}

