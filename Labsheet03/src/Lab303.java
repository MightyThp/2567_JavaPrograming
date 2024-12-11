import java.util.*;

import javax.swing.JOptionPane;
public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sen = new Scanner(System.in);
		
		int spacebar =0;
		int word =0;
		System.out.print("Input a sentance: ");
		String sentance = sen.nextLine();
		
		while(!sentance.endsWith(".")) {
			System.out.print("Input a sentance,again: ");
			sentance = sen.nextLine();
		}
		for(int i =0; i<sentance.length();i++) {
			char ch = sentance.charAt(i);
			if (ch==' ') {
				spacebar++;
			}
			word = spacebar + 1;
			
		}
		System.out.println("This sentance has "+spacebar+" spacebar.");
		System.out.println("This sentance has "+word+" word.");
	}

}
