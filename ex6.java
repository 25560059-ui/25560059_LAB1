import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the number to search for (x): ");
        int x = scanner.nextInt();

        
        int resultIndex = -1; 

        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                resultIndex = i; 
                break;           
            }
        }

       
        System.out.println("Result: " + resultIndex);

        scanner.close();
    }
}
