import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Type your name: ");
		
		String name = console.nextLine();
      
        String firstname = name.substring(0, 1) + ".";
      
        String lastname = name.substring(name.indexOf(" ") + 1) + ", ";
      
        name = lastname + firstname;
		
		System.out.println("Your name is: " + name);

    }
}