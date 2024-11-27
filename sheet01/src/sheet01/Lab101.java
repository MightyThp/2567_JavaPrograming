package sheet01;
import java.text.DecimalFormat;
import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Price per unit : ");
		float  productPrice = input.nextFloat();
		
		System.out.println();
		System.out.println("---------------------------------------");
		
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceProduct)+" baht.");
		
		System.out.println("---------------------------------------");
		
		System.out.print("How many discount (%) : ");
		float discount = input.nextFloat();
		float totaldiscount = totalPriceProduct*(discount/100);
		
		System.out.println("---------------------------------------");
		float finalPrice = totalPriceProduct - totaldiscount;
		System.out.println("Discount from "+discount+"%\t"+totaldiscount+" baht.");
		System.out.println("Amount to be paid\t"+frm.format(finalPrice)+" baht.");
	}

}
