import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong day Fibonacci: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen duong.");
        } else {
            System.out.print("Day Fibonacci: ");
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + (i < n - 1 ? ", " : ""));
                int next = a + b;
                a = b;
                b = next;
            }
        }       
    }
}
