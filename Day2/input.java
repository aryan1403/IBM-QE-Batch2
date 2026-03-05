import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);
    public String acceptString() {
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // accept a string input from the user
        return str;
    }
    public static void main(String[] args) {
        input obj = new input();
        System.out.println("Enter your name: ");
        String name = obj.acceptString();
        System.out.println("Your name is: " + name);

    }
}