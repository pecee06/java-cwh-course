import java.util.Scanner;

class UserInp{
	Scanner sc = new Scanner(System.in);
	void displayMessage(){
		System.out.print("Write your message : ");
		String msg = sc.nextLine();
		System.out.println(msg);
	}
}

public class Question2{
	public static void main(String[] args) {
		UserInp obj = new UserInp();
		obj.displayMessage();
	}
}