import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail();
	}
	
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(varEmail!=null&&!varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}else {
				JOptionPane.showConfirmDialog(null, "E-mail cannot be empty!!!");
			}
			
			ans=JOptionPane.showInputDialog("Do you want to input e-mail address[Y/y]:");
		}while(ans!=null&&ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String email) {
	
		while(email.startsWith("@")||email.contains(" ")){
			email=JOptionPane.showInputDialog("Invalid e-mail. Input tour e-mailagain:");
		}
		email=email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-mail is "+email
				:"Your e-mail is not a hotmail or gmail address."
		);
	}
	public static boolean checkEmail(String email) {
		return email.endsWith("@gmail.com")||email.endsWith("hotmail.com");
		
	}
	
}

