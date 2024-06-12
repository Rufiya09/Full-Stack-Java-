
public class Variables_Ex {

	int marks = 23456;// global variable instance 4 bytes
	static int countryCode = 91; // global and static

	public static void main(String[] args) {

		System.out.println(Variables_Ex.countryCode);
		// local variables
		byte age = 29;
		long contact = 934939432l;
		float salary = 23.56383829034534f;
		double result = 23.56383829034534;
		boolean condition = true;
		char gender = 'M';

		System.out.println(age);
		System.out.println(contact);
		System.out.println(salary);
		System.out.println(result);
		System.out.println(condition);
		System.out.println(gender);

		Variables_Ex obj = new Variables_Ex();
		System.out.println(obj.marks);
		
		
	}
}

//ctrl+a ctrl+shift+f