import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		
		String txtConate ="";
		
		String word;
		
		while (true) {
			System.out.print("Enter word: ");
			word = kb.next();
			
			if(word.equalsIgnoreCase("Stop")) {
				System.out.println("Program Termonate");
				break;
			}
			
			txtConate += word+" ";
		}
		System.out.println(txtConate.toUpperCase());
		
		kb.close();
	}

}
