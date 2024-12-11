import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String error="";
		
		while(true) {
			System.out.println("Enter your Password(type 'exit' to quit:");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			
			
			if(password.length()<8) {
				error +="- Password must be at least 8 character long";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase =false;
			boolean hasDigit = false;
			
			for(int i=0;i <=password.length()-1;i++) {
				char ch =password.charAt(i);
				if(ch>='A'&& ch<='Z') {
					hasUpperCase = true;		
				}else if (ch>='A'&& ch<='Z') {
					hasLowerCase = true;
				}else if (ch>='0'&& ch<='9') {
					hasDigit = true;
				}
			}
			if(!hasUpperCase) {
				error+="- Password must contain at least one uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				error+="- Password must contain at least one uppercase letter(a-z).\n";
			}
			if(!hasDigit) {
				error+="- Password must contain at least one digit(0-9).\n";
			}
			
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
				
			}else {
				System.out.print("Password validation errors.");
				System.out.print(error);
			}
		}
		scan.close();
	}

}
