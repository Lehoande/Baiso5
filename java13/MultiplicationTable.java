import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so de tao bang cuu chuong: ");
        int number = scanner.nextInt();

        System.out.println("Bang cuu chuong cho so " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }       
    }
}
