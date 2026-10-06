import java.util.LinkedList;
import java.util.Locale; 
import java.util.Queue;
import java.util.Scanner;
public class BristlebacksQuillSpray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Set the locale to US for decimal point handling
        if (!scanner.hasNextInt()) return;

        
        int n = scanner.nextInt();
        double[] times = new double[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextDouble();
        }
        
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        
        double totalDamage = 0;
        Queue<Double> quills = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            double t = times[i];
            
            while (!quills.isEmpty() && t - quills.peek() > z) {
                quills.poll();
            }
            
            totalDamage += x + quills.size() * y;
            quills.add(t);
        }
        
        if (totalDamage == (long) totalDamage) {
            System.out.println((long) totalDamage);
        } else {
            System.out.println(totalDamage);
        }
        
        scanner.close();
    }
}