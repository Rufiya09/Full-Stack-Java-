
public class ForLoopEx {
	public static void main(String[] args) {

		// even numbers 2,4,6,8,...100

//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//
//			}
//		}	
//		
//		int number = 0;
//		while (number < 90) {
//			if (number == 45)
//					{
//					break;
//						}
//			System.out.println(number);
//			number++;
//		}
		String day = "sunday";

		switch (day) {
		case "Monday":
			System.out.println("Monday!!!");
			break;
		case "Tuesday":
			System.out.println("Tuesday!!!");
			break;
		case "Wednesday":
			System.out.println("Wednsesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday Holiday");
			break;

		default:
			System.out.println("IT's Sunday");
			break;
		}

	}
}
