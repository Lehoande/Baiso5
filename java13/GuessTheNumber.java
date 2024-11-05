import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
       
        Random random = new Random();
        int secretNumber = random.nextInt(50) + 1; 
        int guess = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tro choi doan so trung thuongố!");
        System.out.println("Hay chon 1 co so tu 1 den 50.");
        
        while (guess != secretNumber) {
            System.out.print("Nhap so cua ban vao: ");
            guess = scanner.nextInt();
            
        
            if (guess < secretNumber) {
                System.out.println("So cao hon.");
            } else if (guess > secretNumber) {
                System.out.println("So thap hon .");
            } else {
                System.out.println("Chuc mung ban !,da doan trung so : " + secretNumber);
            }
        }           
    }
}
