package Strings_and_IO;

public class Q1 {
	public static void main(String[] args) {
		String str1= "Java";
		String str2= "Java";
		String str3= new String ("Java");
		String str4= new String ("Java");
		System.out.println("Comparing string literals using (.equals()):"+str1.equals(str2));
		System.out.println("Comparing string literals using (==)"+str1==str2);
		System.out.println("Comparing new string using (.equals()):"+str3.equals(str4));
		System.out.println("Comparing new string using (==)"+str3==str4);
	
	}

}
