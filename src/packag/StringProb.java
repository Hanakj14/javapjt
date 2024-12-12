package packag;
import java.util.Scanner;
public class StringProb {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter the string  ");
        String input = scanner.nextLine();

               String[] words = input.split(" ");

      
        System.out.print("Reversed string: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

       
    }
}