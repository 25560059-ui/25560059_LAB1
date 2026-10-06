import java.util.Scanner;
public class ex5 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + "=" + (n * i));
        }

        scanner.close();
    }}
    

