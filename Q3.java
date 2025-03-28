package Strings_and_IO;
import java.util.*;
public class Q3 {
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer("Coding");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCurrent Text: " + text+"\n1. Append Text\n2. Insert Text"
            		+ "\n3. Delete Text\n4. Reverse Text\n5. Replace Text\n6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    text.append(scanner.nextLine());
                    System.out.println("Current state:"+text+"  Capacity:"+ text.capacity()+"  Length:"+text.length());
                    break;
                case 2:
                    System.out.print("Enter index to insert at: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter text to insert: ");
                    text.insert(index, scanner.nextLine());
                    System.out.println("Current state:"+text+"  Capacity:"+ text.capacity()+"  Length:"+text.length());
                    break;
                case 3:
                    System.out.print("Enter start and end index to delete: ");
                    int start = scanner.nextInt();
                    int end = scanner.nextInt();
                    text.delete(start, end);
                    System.out.println("Current state:"+text+"  Capacity:"+ text.capacity()+"  Length:"+text.length());
                    break;
                case 4:
                    text.reverse();
                    System.out.println("Current state:"+text+"  Capacity:"+ text.capacity()+"  Length:"+text.length());
                    break;
                case 5:
                    System.out.print("Enter start and end index to replace: ");
                    start = scanner.nextInt();
                    end = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter replacement text: ");
                    text.replace(start, end, scanner.nextLine());
                    System.out.println("Current state:"+text+"  Capacity:"+ text.capacity()+"  Length:"+text.length());
                    break;
            }
        } while (choice != 6);
        scanner.close();

	}

}
