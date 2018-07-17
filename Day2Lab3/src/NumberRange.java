import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int userNum = scan.nextInt();
		
		System.out.println("Please enter your name: ");
		String userName = scan.next();

		
		if(userNum > 1 && userNum < 100) {
			System.out.println(userName + " Number is less than 100.");
		} else { 
			System.out.println(userName + " Number is more than 100.");
		}
			
		if(userNum % 2 == 1 && userNum > 60 && userNum < 100) {
			System.out.println(userName + " " + userNum + " is Odd and over 60.");
		} else if (userNum % 2 == 1) {
			System.out.println(userName + " " + userNum + " is Odd.");
		} else if (userNum % 2 == 0 && userNum > 60) {
			System.out.println(userName + " " + userNum + " is Even.");
		} else if (userNum % 2 == 0 && userNum >= 2 && userNum <= 25) {
			System.out.println(userName + " the number is Even and less than 25.");
		} else if (userNum % 2 == 0 && userNum >= 26 && userNum <= 60) {
			System.out.println(userName + " Even.");
		} else {
			System.out.println(userName + " Thank you for participating!");
		}
		
		
			
	}

}
