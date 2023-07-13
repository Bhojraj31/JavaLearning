package Assignment_String;

public class StringBufferPrac {

	public static void main(String[] args) {
		/* * * append() insert() replace() delete() reverse() charAt() substring() * * */

		StringBuffer sb = new StringBuffer();
		sb.append("Bhojraj Singh");
		System.out.println(sb);
		sb.append("!how are you today.");
		System.out.println(sb);

		sb.insert(7, " insert");
		System.out.println(sb);

		sb.replace(7, 16, " replace");
		System.out.println(sb);

		sb.delete(5, 13);
		System.out.println(sb);

		System.out.println(sb.charAt(9));

		String str = sb.substring(5, 10);
		System.out.println(str);

		System.out.println(sb.length());

		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");

		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2));

		StringBuffer sb3 = sb2;
		StringBuffer sb4 = new StringBuffer();
		sb4.append("i");

		System.out.println(sb3 == sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb4.compareTo(sb1));
		System.out.println(sb1.compareTo(sb4));
	}
}
