import java.util.Scanner;

public class HelloUser {
	static String userName;
	
	public static String greetMe (String userName){
		return "Hello "+userName+"!";
	}
	
	public static void main (String [] args){
		System.out.println("Hello ASE2015 - how are you? :)");
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name:");
		userName = input.nextLine();
		
		System.out.println(greetMe(userName));
	}

}
