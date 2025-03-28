package Strings_and_IO;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an string: ");
	        StringBuilder str = new StringBuilder(scanner.nextLine());
	        int choice;

	        do {
	            System.out.println("\nCurrent String: " + str);
	            System.out.println("1. Add Substring 2. Remove Characters 3. Modify Character 4. Concatenate 5. Exit");
	            System.out.print("Choose an option: ");
	            choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter index to insert at: ");
	                    int index = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter text: ");
	                    str.insert(index, scanner.nextLine());
	                    System.out.println("Modified Text:"+str);
	                    break;
	                case 2:
	                    System.out.print("Enter start and end index to delete: ");
	                    int start = scanner.nextInt();
	                    int end = scanner.nextInt();
	                    str.delete(start, end);
	                    System.out.println("Modified Text:"+str);
	                    break;
	                case 3:
	                    System.out.print("Enter index to modify:");
	                    int pos = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter new character:");
	                    str.setCharAt(pos, scanner.next().charAt(0));
	                    System.out.println("Modified Text:"+str);
	                    break;
	                case 4:
	                    System.out.print("Enter text to concatenate:");
	                    str.append(scanner.nextLine());
	                    System.out.println("Modified Text:"+str);
	                    break;
	            }
	        } while (choice != 5);
	        scanner.close();

	}

}
