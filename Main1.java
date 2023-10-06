import java.rmi.UnexpectedException;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Napeshite interaciy N");
        int N = scanner.nextInt();
        int g = 0;
        while (g <= N) {
            System.out.println(N=g);
            g--;
        }
        g = 0;
        do {
            System.out.println(N);
            g--;

        }while (g <= N);
        for (g = 0;g <= N;g++){
            System.out.println(g);
        }
        scanner.close();
    }
}