package Assignment_String;

public class StringBuilderPrac {

	/*
	 * append() insert() replace() delete() reverse() charAt() substring()
	 * 
	 * 
	 */

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		sb.append("!how are you today.");
		System.out.println(sb);

		sb.insert(5, " insert ");
		System.out.println(sb);

		sb.replace(5, 12, " replace");
		System.out.println(sb);

		sb.delete(5, 13);
		System.out.println(sb);

		System.out.println(sb.charAt(9));

		String str = sb.substring(5, 10);
		System.out.println(str);

		System.out.println(sb.length());

		StringBuilder sb1 = new StringBuilder();
		sb1.append("hello");

		StringBuilder sb2 = new StringBuilder();
		sb2.append("hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2));

		StringBuilder sb3 = sb2;
		StringBuilder sb4 = new StringBuilder();
		sb4.append("i");

		System.out.println(sb3 == sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb4.compareTo(sb1));
		System.out.println(sb1.compareTo(sb4));
	}

}
