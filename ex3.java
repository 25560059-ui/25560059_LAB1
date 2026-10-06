import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        int temp = Math.abs(number);
        int sum = 0;

        
        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;       
        }

        
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}