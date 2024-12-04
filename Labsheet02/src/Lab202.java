import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inputnumber : ");
		int number = scanner.nextInt();
		int lastNumber = number - 1;
		while (number > lastNumber) {
            lastNumber = number;
            System.out.print("Input number : ");
            number = scanner.nextInt();
        }
        System.out.println("\nBYE BYE");

        scanner.close();
    }

}


