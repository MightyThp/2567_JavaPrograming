import javax.swing.*;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("your balance : "+balance+
																		 "\nInput money to withdeaw:"));
		if(moneyWithdraw>balance) {
 JOptionPane.showMessageDialog(null, "Error : Connot withdraw more than balance",
		 							 "ERROR",
		 							 JOptionPane.ERROR_MESSAGE);
		}else if (moneyWithdraw >50000) {
			JOptionPane.showMessageDialog(null, "Error : Connot withdraw more than 50,000",
					 "ERROR",
					 JOptionPane.ERROR_MESSAGE);
		}else if (moneyWithdraw %100 !=0) {
			JOptionPane.showMessageDialog(null, "Error : Connot withdraw"+(moneyWithdraw%100)+" baht.",
					 "ERROR",
					 JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+moneyWithdraw+" baht."+
												"\n1,000 ="+(moneyWithdraw/1000) + 
												"\n500 ="+((moneyWithdraw%1000)/500)+
												"\n100 ="+((moneyWithdraw%500)/100));
			
		}
		
	}

}
